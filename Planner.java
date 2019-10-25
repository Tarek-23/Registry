import java.util.*;

import java.text.SimpleDateFormat;

//Implement watcher to sent out notifications when events are added or removed

public class Planner implements manageObserver {

    //Store events in array

    AbstractEvent[] events;

    //Store size

    int currentSize;

    //Store observers list i.e whom to send out notifications

    ArrayList <Observer> observerList;

    public Planner(){

        observerList = new ArrayList<Observer>();

    }

    //initialize the events array

    public Planner(int size){

        observerList = new ArrayList<Observer>();

        events=new AbstractEvent[size];

        currentSize=0;

    }

    //return the current size

    int size(){

        return this.currentSize;

    }

    //returns true when addition of event is successful

    boolean addEvent(AbstractEvent event){

        //add to event

        if(currentSize<events.length){

            this.events[currentSize]=event;

            currentSize++;

            //notify event added

            notifyOb("Event Added " + event.getDescription());

            return true;

        }

        else{

            return false;

        }

    }

    //returns the event at position

    AbstractEvent eventAt(int pos){

        if(pos<=currentSize && pos>=0)

            return events[pos];

        else

            return null;

    }

    //removes the element at given position

    AbstractEvent remove(int pos){

        AbstractEvent removedEvent=null;

        if (pos <= currentSize && pos >= 0)

            removedEvent=events[pos];

        for(int i=pos;i<(currentSize-1);i++){

            events[i]=events[i+1];

        }

        //Notification for Removal

        notifyOb("Event Removed "+removedEvent.getDescription());

        return removedEvent;

    }

   
    void display(Date date){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Events that will reoccur on "+sdf.format(date));

        for(int i=0;i<currentSize;i++){

            AbstractEvent event=eventAt(i);

            while(event.hasMoreOccurrences()){

                if(date.equals(event.nextOccurrence())){

                    System.out.println(event.getDescription());

                }

            }

        }

    }

    //To sort the events

    void sort( Comparator<AbstractEvent> c ){

        Arrays.sort(events, c);

    }

    @Override

    public void addOb(Observer o) {

        observerList.add(o);

    }

    @Override

    public void removeOb(Observer o) {

        observerList.remove(observerList.indexOf(o));

    }

    @Override

    public void notifyOb(String notification) {

        for (Iterator<Observer> it = observerList.iterator(); it.hasNext();) {

            Observer o = it.next();

            o.showNotification(notification);

        }

    }

}