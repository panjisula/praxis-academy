package medium.contoh;

public class Synchronize{
    private static int counter = 0;
    private static synchronized void increment(){
        ++counter;
    }

    private static void process(){
        Thread t1 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                for(int i = 0; i<1000;i++){
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                for(int i = 0; i<1000;i++){
                    increment();
                }
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        process();
        System.out.println(counter);
    }
}