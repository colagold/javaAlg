package KnowledgePoint.MultiThread;

public class ThreadTrain {
    public static void main(String[] args) throws InterruptedException {
        //继承Thread类，覆写run方法
        Thread thread=new MyThread();
        ThreadTrain threadTrain=new ThreadTrain();
        ThreadTest threadTest=threadTrain.new ThreadTest();
        //实现Runnable接口，重写run方法
        Thread thread1=new Thread(new MyRunnable());
        //lambda方法
        Thread t=new Thread(()->{
            System.out.println("lambda实现多线程");
        });
        t.start();
        t.join();//在线程t start（）之后，需等待t线程执行完再执行其他程序
//        t.setPriority(10); //设置优先级。但并不能保证能先调用该线程
        thread1.start();
        threadTest.start();
        thread.start();
    }
    class ThreadTest extends Thread{
        @Override
        public void run(){
            System.out.println("内部类继承Thread");
        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("继承Runnable");
    }
}
