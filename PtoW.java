class PtoW
{
    public static void main(String[] args)
    {
        // Integer in = new Integer(150);
        Integer in = Integer.valueOf(150);
        System.out.println(in.byteValue());
        System.out.println(in.shortValue());
        System.out.println(in.intValue());
        System.out.println(in.longValue());
        System.out.println(in.floatValue());
        System.out.println(in.doubleValue());

        Character c =Character.valueOf('a');
        char c1 = c.charValue();
        System.out.println(c1);

        Boolean b = Boolean.valueOf("jhdj");
        boolean b1 = b.booleanValue();
        System.out.println(b1);
    }

}