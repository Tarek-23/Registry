import java.util.*;

public class Test {

    public static void main(String[] args) {

     

        Planner planner=new Planner(4);

      

        Notifications notifications=new Notifications();

     
        planner.addOb(notifications);

        //To get todays date

        Calendar cal = Calendar.getInstance();

        Calendar cal2= Calendar.getInstance();

        //Adding Events for Testing with start time today

        DailyEvent event1=new DailyEvent();

        event1.setDescription("First Daily Event");

        event1.setStart_time(cal.getTime());

    



        DailyEvent event2=new DailyEvent();

        event2.setDescription("Second Daily Event");

        event2.setStart_time(cal.getTime());

        
        
        WeeklyEvent event3=new WeeklyEvent();

        event3.setDescription("First Weekly Event");
        event3.setStart_time(cal.getTime());

       


        WeeklyEvent event4=new WeeklyEvent();

        event4.setDescription("Second Weekly Event");

       
        event4.setStart_time(cal.getTime());

     



        DailyEvent event5=new DailyEvent();

        event5.setDescription("Third Daily Event");

       
        event5.setStart_time(cal.getTime());

        //Adding the events and printing if successful or not

        System.out.println(planner.addEvent(event1));

        System.out.println(planner.addEvent(event2));

        System.out.println(planner.addEvent(event3));

        System.out.println(planner.addEvent(event4));

        System.out.println(planner.addEvent(event5));

        //Removing first weekly Event

        planner.remove(2);

       

        

        

    }

}

