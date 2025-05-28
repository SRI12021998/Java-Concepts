package bufferbuilder;

class SynchronizedStringBuilder 
{
    static StringBuilder sb = new StringBuilder("Start");

    // Synchronized method
    public synchronized static void appendText(String text) 
    {
        sb.append(text);
        System.out.println(Thread.currentThread().getName() + ": " + sb);
    }

    public static void main(String[] args) 
    {
        Thread t1 = new Thread(() -> 
        {
            for (int i = 0; i < 5; i++) 
            {
                appendText("A");
            }
        });

        Thread t2 = new Thread(() -> 
        {
            for (int i = 0; i < 5; i++) 
            {
                appendText("B");
            }
        });

        t1.start();
        t2.start();
    }
}