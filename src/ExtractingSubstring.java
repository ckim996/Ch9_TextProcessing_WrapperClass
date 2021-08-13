public class ExtractingSubstring
{
    public static void main(String[] args)
    {
        String str = "Stonk market sucks";
        System.out.println("Original string: " + str);
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,8));

        char[] c = new char[8];
        str.getChars(6,12,c,0);
        for(int i = 0; i < c.length; i++)
        {
            System.out.print(c[i] + " ");
        }

        System.out.println();
        c = str.toCharArray();
        for(int j = 0; j < c.length; j++)
        {
            System.out.print(c[j] + " ");
        }
    }
}
