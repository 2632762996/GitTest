package threadcase;

public class ThreadWork {
    public static void main(String[] args) {
//        GiveGift giveGift1= new GiveGift();
//        Thread t1 = new Thread(giveGift1,"thread1");
//        Thread t2 = new Thread(giveGift1,"thread2");
//        OutputOdd outputOdd = new OutputOdd();
//        Thread t1 = new Thread(outputOdd,"thread1");
//        Thread t2 = new Thread(outputOdd,"thread2");
        RedPocket redPocket = new RedPocket();
        Thread t1 = new Thread(redPocket,"李明");
        Thread t2 = new Thread(redPocket,"李华");
        Thread t3 = new Thread(redPocket,"张三");
        Thread t4 = new Thread(redPocket,"李四");
        Thread t5 = new Thread(redPocket,"王五");

        t2.start();
        t1.start();
        t3.start();
        t4.start();
        t5.start();





    }
}
