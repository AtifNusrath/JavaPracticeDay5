interface MyInterface{
    static int num = 100;
    void display();
}
class InterfaceExample implements MyInterface{
    public int num = 1000;
    public void display() {
        System.out.println("This is the implementation of the display method");
    }
    public void show() {
        System.out.println("This is the implementation of the show method");
    }

}
public class InterfaceField {
    public static void main(String args[]) {
        InterfaceExample obj = new InterfaceExample();
        System.out.println("Value of num of the interface "+MyInterface.num);
        System.out.println("Value of num of the class "+obj.num);
    }
}
