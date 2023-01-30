 interface Add
 {
    void sum(int... a);
 }

 public class Lamb2
 {
    public static void main(String[] args)
    {
        Add ad = (int... a)->
        {
            int num = 0;
            for(int b:a)
            {
                num += b;
            }
            
            System.out.println(num);
        };

        ad.sum(10,20,30);

    }
 }