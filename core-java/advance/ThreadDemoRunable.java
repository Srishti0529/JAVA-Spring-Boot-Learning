class C implements Runnable{
    public void run(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
class D implements Runnable{
    public void run(){
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
public class ThreadDemoRunable {
    public static void main(String[] args) {

        Runnable c = new C();
        Runnable d = new D();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(d);

        t1.start();
        t2.start();
    }
    
}
