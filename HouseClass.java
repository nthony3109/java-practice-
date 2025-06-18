package GitPush;

public class HouseClass {

private class InnerHouseClass {
          public void say() {
        System.out.println(" inner class with private modify");
    }
    
}
protected class Another {
    public void print() {
        System.out.println("fromm protected inner class");
    }
}
 public interface MyInterface {
            void print();
    
 }

public static void main(String[] args) {
    HouseClass house = new HouseClass();
    InnerHouseClass inner1Class = house.new InnerHouseClass();
    Another another = house.new Another();
    MyInterface mine = new MyInterface() {
        @Override
        public void print() {
            System.out.println(" from anonymous class implementing an interface");
        }
    };
      inner1Class.say();
      another.print();
      mine.print();;
}
}
