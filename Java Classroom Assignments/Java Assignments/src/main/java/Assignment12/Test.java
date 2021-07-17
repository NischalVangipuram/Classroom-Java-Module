package Assignment12;

public class Test extends Thread
{
    public void run()
    {
        for(int h=1;h<=3;h++) {
            try {
                Thread.currentThread().getName();
                Thread.sleep(10);
            } catch (Exception e)
            {
                System.out.println("hello");
            }
            Thread.currentThread().getName();
            System.out.println(h+" ");
        }
    }
    public static void main(String a[])
    {
        Test h1=new Test();
        Test h2=new Test();
        Test h3=new Test();

        h1.setPriority(Thread.MAX_PRIORITY);
        h2.setPriority(Thread.MIN_PRIORITY);
        h3.setPriority(Thread.NORM_PRIORITY);
        h1.start();
        Thread.currentThread().getName();
        try{
            h1.join();
            h2.join();
        }
        catch(Exception e)
        {
            System.out.println("hi");
        }
        h2.start();
        h3.start();
    }
}
