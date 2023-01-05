class ThisKey
{
    void show()
    {
        System.out.println(this);

    }
    public static void main(String[] args)
    {
        ThisKey tk = new ThisKey();
        tk.show();
        System.out.println(tk);
        
    }
}