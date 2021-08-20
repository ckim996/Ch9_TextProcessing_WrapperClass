import java.util.Scanner;

public class SentenceCapitalizer
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input sentence to capitalize: ");
        s = sc.nextLine();
        System.out.println(capitalize(s));
    }

    public static String capitalize(String s)
    {
        int position = 0;
        boolean cap = true;
        StringBuilder sb = new StringBuilder(s);
        while(position < sb.length())
        {
            if(sb.charAt(position) == '.')
            {
                cap = true;
            }else if(cap && !Character.isWhitespace(sb.charAt(position)))
            {
                sb.setCharAt(position,Character.toUpperCase(sb.charAt(position)));
                cap = false;
            }
            position++;
        }
        return sb.toString();
    }
}