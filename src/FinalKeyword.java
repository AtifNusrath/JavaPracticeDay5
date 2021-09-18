public final class FinalKeyword {
    final int WHEELS = 4;

    public final int getNoOfWheels(){
        return WHEELS;
    }

    public static void main(String[] args) {
        FinalKeyword obj=new FinalKeyword();
        System.out.println("Number of Car Wheel: "+obj.getNoOfWheels());
    }
}