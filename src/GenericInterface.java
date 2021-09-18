interface MinMax<Test extends Comparable<Test>> {
    Test min();
    Test max();
}

class MyClass <Test extends Comparable<Test>> implements MinMax<Test> {

    Test[] values;

    MyClass(Test[] obj) { values = obj; }

    public Test min()
    {
        Test obj1 = values[0];

        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(obj1) < 0)
                obj1 = values[i];

        return obj1;
    }

    public Test max()
    {
        Test obj1 = values[0];

        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(obj1) > 0)
                obj1 = values[i];

        return obj1;
    }
}

public class GenericInterface {
    public static void main(String[] args)
    {
        Integer arr[] = { 3, 6, 2, 8, 6 };

        MyClass<Integer> obj1 = new MyClass<Integer>(arr);

        System.out.println("Minimum value: " + obj1.min());
        System.out.println("Maximum value: " + obj1.max());
    }
}
