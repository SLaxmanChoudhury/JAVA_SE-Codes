class ToString1
{
    public static void main(String[] args)
    {
        String i1 = Integer.toString(10,2);
        String i2 = Integer.toString(10,8);
        String i3 = Integer.toString(10,16);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

         System.out.println();

        String s1 = Integer.toBinaryString(10);
        String s2 = Integer.toOctalString(10);
        String s3 = Integer.toHexString(10);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Integer x = 10;
        Integer y = 10;
        System.out.println(x == y);//true
    }
}