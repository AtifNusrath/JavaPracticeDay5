
interface Interface_One{
    void print();
}

interface Interface_Two{
    void show();
}

class DemoClass implements Interface_One,Interface_Two{
    public void print(){
        System.out.println("Democlass::Interface_One_Print ()");
    }
    public void show(){
        System.out.println("DemoClass::Interface_Two_Show ()");
    }
}

public class MultipleInterface{

    public static void main(String args[]){
        DemoClass obj = new DemoClass();
        obj.print();
        obj.show();
    }
}
