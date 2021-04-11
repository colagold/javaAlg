package KnowledgePoint.MultiThread;

/**
 * 通过继承来自定义线程
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("自定义线程");
    }
}
