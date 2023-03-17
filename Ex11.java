public class Ex11
{
    public static void main(String[] args)
    {
        System.out.println("Before Set priority "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("After Set priority "+Thread.currentThread().getPriority());
        Thread t = new Thread();
        System.out.println("After create new thread "+t.getPriority());

    }
}