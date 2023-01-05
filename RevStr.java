class RevStr
{
    public static void main(String[] args)
    {
        String str = "kalia";
        String str1 = "";
        int l = str.length();
        for(int i = l-1; i>=0; i--){
            str1 =str1 + str.charAt(i);
        }
        System.out.println(str1);
    }
}