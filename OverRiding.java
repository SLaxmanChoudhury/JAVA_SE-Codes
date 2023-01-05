class Shape
{
    void draw()
    {
        System.out.println("Can't say shape type.");
    }
}
class Squre extends Shape
{
   @Override
    void draw()
    {
        System.out.println("Squre shape.");
    }
}
class OverRiding
{
    public static void main(String[] args)
    {
        Shape sq = new Squre();
        sq.draw();
    }
}