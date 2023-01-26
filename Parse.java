class Parse
{
    public static void main(String []args)
    {
        int i = Integer.parseInt("10");
        System.out.println(i);

        boolean b = Boolean.parseBoolean("hjd");
        System.out.println(b);

        double d = Double.parseDouble("1001.23");
        System.out.println(d);

        System.out.println(Integer.parseInt( args[0]) + Integer.parseInt( args[1]) );
    }
}