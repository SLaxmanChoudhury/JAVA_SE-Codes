class Radix
{
    public static void main(String[] args)
    {
        Integer in = Integer.valueOf("100" , 2);
        System.out.println(in);
        System.out.println("MIN_RAXIX => "+Character.MIN_RADIX);
        System.out.println("MAX_RAXIX => "+Character.MAX_RADIX);
    }
}