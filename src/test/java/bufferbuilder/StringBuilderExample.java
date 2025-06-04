package bufferbuilder;

class StringBuilderExample 
{
    static StringBuilder sb = new StringBuilder("Start");

    public static void main(String[] args) 
    {
        Thread t1 = new Thread(() -> 
        {
            for (int i = 0; i < 5; i++) 
            {
                sb.append("A");
                System.out.println("Thread 1: " + sb);
            }
        });

        Thread t2 = new Thread(() -> 
        {
            for (int i = 0; i < 5; i++) 
            {
                sb.append("B");
                System.out.println("Thread 2: " + sb);
            }
        });

        t1.start();
        t2.start();
    }
}