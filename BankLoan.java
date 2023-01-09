import java.util.*;
class Student
{
    int a = 1;
    void student()
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dear consumer you are a student then press '1' else press '0' :");
        int b = sn.nextInt();
        if(b == a)
        {

            System.out.println("Dear student please enter your age : ");
            int ag = sn.nextInt();
            if(ag <= 25)
            {
                System.out.println("Congrulation! Dear student you are eligible for Education loan :) ");

            }
            else
            {
                System.out.println("Sorry! Dear student you age is grater then '25' so, you are not eligible :( ");
            }

        }
        else if(b == 0)
        {
            System.out.println("Dear consumer you are not a student so, your are not eligibel for this Education loan :(");
        }
        else{
            System.out.println("Please enter valid button.");
        }


    }

}
class Home
{
    void home()
    {
        int a = 1;
        Scanner sn = new Scanner(System.in);
        System.out.println("Dear consumer you have a own Home then press '1' else press '0' :");
        int b = sn.nextInt();
        if(b == a)
        {

            System.out.println("Dear woner please enter your home value : ");
            int ag = sn.nextInt();
            if(ag >= 300000)
            {
                System.out.println("Congrulation! Dear woner you are eligible for Home loan :) ");

            }
            else
            {
                System.out.println("Sorry! Dear woner your home value less then 'Rs.300000' so, you are not eligible :( ");
            }

        }
        else if(b == 0)
        {
            System.out.println("Dear consumer you have not any own home so, your are not eligibel for this Education loan :(");
        }
        else{
            System.out.println("Please enter valid button.");
        }

    }

}
class Gold
{
    void gold()
    {
        int a = 1;
        Scanner sn = new Scanner(System.in);
        System.out.println("Dear consumer you have a own Gold then press '1' else press '0' :");
        int b = sn.nextInt();
        if(b == a)
        {

            System.out.println("Dear consumer please enter your gold value : ");
            int ag = sn.nextInt();
            if(ag >= 30000)
            {
                System.out.println("Congrulation! Dear consumer you are eligible for Gold loan :) ");

            }
            else
            {
                System.out.println("Sorry! Dear consumer your gold value less then 'Rs.30000' so, you are not eligible :( ");
            }

        }
        else if(b == 0)
        {
            System.out.println("Dear consumer you have not any own gold so, your are not eligibel for this Gold loan :(");
        }
        else{
            System.out.println("Please enter valid button.");

        }
    }   


}









class BankLoan
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        int pin = 1234;
        System.out.println("Welcome! to our Bank :)");
        System.out.println();
        System.out.println("Plaese enter your name : ");
        String num = sn.nextLine();
        System.out.println("Enter your 4 digit password : ");
        int pass = sn.nextInt();
        if(pass == pin)
        {
             System.out.println("These are our bank's following loan types :-");
             System.out.println("1) Education Loan");
             System.out.println("2) Home Loan");
             System.out.println("3) Gold Loan");
             System.out.println("Check are you eligible for which loan : ");
             System.out.println("Press '1' for Education Loan");
             System.out.println("Press '2' for Home Loan");
             System.out.println("Press '3' for Gold Loan");
             int pres = sn.nextInt();
             if(pres == 1)
             {
                Student stu = new Student();
                stu.student();
             }
             else if(pres == 2)
             {
                Home hm = new Home();
                hm.home();
             }
             else if(pres == 3)
             {
                Gold gld = new Gold();
                gld.gold();
             }
             else{
                System.out.println("Please enter valid button.");
             }



        }
        else
        {
            System.out.println("Invalid Password! Please try again.");
        }
       System.out.println("Thank You! for Coming :)");



    }
}