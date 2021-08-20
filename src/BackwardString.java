import java.util.Scanner;

public class BackwardString
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a word you would like to see backward: ");
        s = sc.nextLine();

        int length = s.length()-1;
        for(int i = 0; i < s.length(); i++)
        {
            char a;
            a = s.charAt(length);
            System.out.print(a);
            length--;
        }
        System.out.println("\nWord Counter: " + wordCounter(s));
    }

    public static int wordCounter(String s)
    {
        return s.length();
    }
}
