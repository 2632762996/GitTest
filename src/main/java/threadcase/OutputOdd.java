package threadcase;

public class OutputOdd implements Runnable{
    private static int num = 1;
    private static  Object lock = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (lock){
                if(num>100){
                    break;
                }else{
                    if(num%2==1){
                        System.out.println(Thread.currentThread().getName()+" : "+num);
                    }
                    num++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
