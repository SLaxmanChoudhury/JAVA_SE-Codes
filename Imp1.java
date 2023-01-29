class Imp1
{
    public static void main(String[] args)
    {
        java.util.Scanner sn = new java.util.Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sn.nextInt();
        System.out.println("The number is : "+a);


        //This approch is not possible without Import.java.util.Scanner; statement.
 
        // Scanner sn1 = new Scanner(System.in);
        // System.out.println("Enter the next Number : ");
        // int b = sn1.nextInt();
        // System.out.println("The Number is "+b);
    }
}