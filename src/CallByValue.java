public class CallByValue {

        int num = 50;

        void change(int data){
            num = data + 100;
        }

        public static void main(String args[]){
            CallByValue op=new CallByValue();

            System.out.println("Before change: "+op.num);
            op.change(500);
            System.out.println("After change: "+op.num);

        }
    }
