class If9
{
   static
   {
    System.out.println("Method is loading");
   }

   public If9()
   {
    System.out.println("Object is created");
   }
}


public class Obj2
{
    public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        String className = args[0];
        
        Object obj = Class.forName(args[0]).newInstance();
        
        System.out.println(obj.getClass().getName());

    }
}