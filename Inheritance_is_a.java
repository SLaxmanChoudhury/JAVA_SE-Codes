class SBI
{
    
}
class Axis extends SBI
{
    protected SBI bank()
    {
        SBI sbi = new SBI();
       
        return sbi;
    }
}
class UGB
{
    public Axis bank()
    {
        Axis ax = new Axis();
        System.out.println("This is the code about Co-Veriant Return Type.");
        return ax;
    }
}





class Inheritance_is_a
{
    public static void main(String[] args)
    {
        UGB ugb = new UGB();
        ugb.bank();


    }
}