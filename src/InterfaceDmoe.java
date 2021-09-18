interface MyInterface1
{
    void method1();
    void method2();
}
class Demo implements MyInterface1
{
    public void method1()
    {
        System.out.println("implementation of method1");
    }
    public void method2()
    {
        System.out.println("implementation of method2");
    }

}
public class InterfaceDmoe {
    public static void main(String arg[])
    {
        MyInterface1 obj = new Demo();
        obj.method1();
        obj.method2();
    }
}
