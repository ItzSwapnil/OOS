package Samples;

public class Run extends Thread
{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            try
            {
                Thread.sleep(500);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Run t1=new Run();
        Run t2=new Run();
        t1.run();
        t2.run();
    }
}
