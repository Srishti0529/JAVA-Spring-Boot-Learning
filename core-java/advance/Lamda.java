public class Lamda {
    public static void main(String args[]){
        Runnable a = () ->{
            for(int i = 1 ; i <=5 ; i++){
                System.out.println("Hi");
                try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        };
         Runnable b = () ->{
            for(int i = 1 ; i <=5 ; i++){
                System.out.println("Hello");
                try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
