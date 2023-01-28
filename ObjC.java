class If8
{
   static
   {
    System.out.println("Method is loading");
   }

   If8()
   {
    System.out.println("Object is created");
   }
}


class ObjC
{
    public static void main(String[] args)throws ClassNotFoundException
    {
        String className = args[0];
        Class c = Class.forName(className);



    }
}