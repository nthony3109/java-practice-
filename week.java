package GitPush;


enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}   

public class Week {    
    Days day;

    public Week(Days day) { 
        this.day = day;
    }   

    public void displayDay(Days day) {   

        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");    
                break;
            case THURSDAY:
                System.out.println("Thursday"); 
                break;
            case FRIDAY:
                System.out.println("Friday");   
                break;
            case SATURDAY:
                System.out.println("Saturday"); 
                break;
            case SUNDAY:
                System.out.println("Sunday");   
                break;
            default:
                System.out.println("Invalid day");  
        }
    }   


    // public void getDays() {
    //     for (Days day : Days.values()) {
    //         System.out.println(day);
    //     }
    // }   
}
