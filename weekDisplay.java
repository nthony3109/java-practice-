package GitPush;


public class WeekDisplay  { 
    public static void main(String[] args) {
        Week week = new Week(Days.MONDAY); // Create an instance of Week with MONDAY    
        week.displayDay(Days.MONDAY);
        week.displayDay(Days.TUESDAY);  
        week.displayDay(Days.WEDNESDAY); 
        week.displayDay(Days.THURSDAY); 
        week.displayDay(Days.FRIDAY);   
        week.displayDay(Days.SATURDAY); 
        week.displayDay(Days.SUNDAY);   
        //week.getDays();


        }
    }   

