class CopyString
{
    public static void main(String[] args)
    {
        String s1 ="kalia";
        String s2 = "";
        String s3 = "";
        for(int i=0;i<s1.length();i++)
        {
            s2 += s1.charAt(i);
        }
        System.out.println("String s1 = " + s1);
        System.out.println("Copy String s2 = " + s2);
        s3= s3+s1;
        System.out.println("Copy String s3 = " + s3);
    }
}