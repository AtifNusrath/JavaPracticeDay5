
interface InterfaceOne{
    void print();
}

interface InterfaceTwo extends InterfaceOne{
    void show();
}


class DemoClass1 implements InterfaceTwo {
    public void print() {
        System.out.println("Democlass :: InterfaceOne_Print ()");
    }

    @Override
    public void show() {
        System.out.println("DemoClass :: Interface_Two_Show ()");

    }
}

public class InterfaceInheritance{
    public static void main(String args[]){
        DemoClass1 obj = new DemoClass1();  //create DemoClass object and call methods
        obj.print();
        obj.show();
    }
}
