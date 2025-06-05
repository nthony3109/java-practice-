package GitPush;

public class SubClass extends superClass {
    public void printAllDays() {
        for (Enum day : Enum.values()) {
            display(day); // method inherited from superclass
        }
    }
}


