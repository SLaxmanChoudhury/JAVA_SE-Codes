class EH1
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 2;
        int c = 0;
        int d = a/b; //Div-1
        System.out.println("Div-1 result is : " + d);
        int e = a/c; //Div-2 Exception in thread "main" java.lang.ArithmeticException: / by zero at EH1.main(EH1.java:10)
        System.out.println("Div-2 result is : " + e);
    }
}