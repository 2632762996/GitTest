package threadcase;

import java.util.Random;

public class RedPocket implements Runnable{
    private double money=100;
    private int count = 3;
    private static double min = 0.01;
    @Override
    public void run() {
        synchronized (RedPocket.class){
            if(count>0){
                double prize = 0;
                if(count==1){
                    prize = money;

                }else {
                    Random r = new Random();
                    double bound = money-(count-1)*min;
                    prize=r.nextDouble()*bound;
                    if(prize<min){
                        prize=min;
                    }
                }

                --count;
                System.out.println(Thread.currentThread().getName()+"抢到了"+prize+"元");
                money = money - prize;

            }else{
                System.out.println(Thread.currentThread().getName()+"没有抢到红包");
            }

        }

    }
}
