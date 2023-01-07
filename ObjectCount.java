class Demo
{
   static int a = 0;
    
   
  
   {
        a++;
   }

}




class ObjectCount
{
    public static void main(String[] args)
    {
        Demo d1 =new Demo();
        Demo d2 =new Demo();
        Demo d3 =new Demo();
         System.out.println("Total number of object is : " + Demo.a);
       

    }
}