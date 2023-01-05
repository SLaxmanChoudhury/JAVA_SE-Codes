class A
{
    int a;
    String b;

    A(int x , String y)
    {
      a = x;
      b = y;
        System.out.println(x + " " + y);
    }
    A(A ref)
    {
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }


}

public class ParaCntr
{
    public static void main(String[] args)
    {
        A r = new A(100,"KC");
        A r1 = new A(r);

    }
}