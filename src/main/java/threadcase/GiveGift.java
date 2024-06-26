package threadcase;

public class GiveGift implements Runnable{

    private static int num=100;

    @Override
    public void run() {
        while (true){
            if(!give()){
                break;
            }
        }

    }

    private synchronized boolean give(){
        if(num<10){
            return false;
        }else{
            num--;
            System.out.println(Thread.currentThread().getName()+ "剩余礼物数量："+num);
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
