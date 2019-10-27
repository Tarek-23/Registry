import java.util.*;

import java.text.SimpleDateFormat;



public class Planner implements manageObserver {

  

    AbstractEvent[] events;

    

    int cur_size;

    

    ArrayList <Observer> observerList;

    public Planner(){

        observerList = new ArrayList<Observer>();

    }

   

    public Planner(int size){

        observerList = new ArrayList<Observer>();

        events=new AbstractEvent[size];

        cur_size=0;

    }



    int size(){

        return this.cur_size;

    }

   

    boolean addEvent(AbstractEvent event){

        

        if(cur_size<events.length){

            this.events[cur_size]=event;

            cur_size++;

           

            notifyOb("Event Added " + event.getDescription());

            return true;

        }

        else{

            return false;

        }

    }

  

    AbstractEvent eventAt(int pos){

        if(pos<=cur_size && pos>=0)

            return events[pos];

        else

            return null;

    }

  

    AbstractEvent remove(int pos){

        AbstractEvent removedEvent=null;

        if (pos <= cur_size && pos >= 0)

            removedEvent=events[pos];

        for(int i=pos;i<(cur_size-1);i++){

            events[i]=events[i+1];

        }

        

        notifyOb("Event Removed "+removedEvent.getDescription());

        return removedEvent;

    }

   
    void display(Date date){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Events that will reoccur on "+sdf.format(date));

        for(int i=0;i<cur_size;i++){

            AbstractEvent event=eventAt(i);

            while(event.hasMoreOccurrences()){

                if(date.equals(event.nextOccurrence())){

                    System.out.println(event.getDescription());

                }

            }

        }

    }
    
    public String toString() {
        
    	String out = "Planner Content: \n";
    	
    	for(int i = 0; i<cur_size;i++)
    	{
    		AbstractEvent event = eventAt(i);
    		out += event.toString();
    		out+= "\n";
    		
    	}
    	
    	return out;
    		
    }

 

    void sort( Comparator<AbstractEvent> c ){

        Arrays.sort(events, c);

    }



    public void addOb(Observer o) {

        observerList.add(o);

    }

   

    public void removeOb(Observer o) {

        observerList.remove(observerList.indexOf(o));

    }

    

    public void notifyOb(String notification) {
    	
    	
//    	for (Observer o: observerList)
//    		
//    		o.showmsg(notification);
    	
    Iterator<Observer> it = observerList.iterator();
    
       while(it.hasNext()) 
       {

            Observer o = it.next();

            o.showmsg(notification);

        }

    }

}