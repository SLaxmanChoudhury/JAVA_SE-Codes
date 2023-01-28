class If8
{
   static
   {
    System.out.println("Method is loading");
   }

   public If8()
   {
    System.out.println("Object is created");
   }
}


public class ObjC
{
    public static void main(String[] args)throws ClassNotFoundException,  InstantiationException,  IllegalAccessException
    {
        String className = args[0];
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        Student std = (Student)obj;
        System.out.println(std);

    }
}