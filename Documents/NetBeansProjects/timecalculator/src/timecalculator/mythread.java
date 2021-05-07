package timecalculator;
class mythread implements Runnable{
    public void run()
    {}
    public static void main(String[] args) 
    {
        Thread T1 = new Thread("Hello I am Thread 1");
        Thread T2 = new Thread("Hello I am Thread 2");
        T1.start();
        T2.start();
        System.out.println(T1.getName());
        System.out.println(T2.getName());
      
    }
    
 }
