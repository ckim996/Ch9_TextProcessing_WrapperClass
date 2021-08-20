import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Please enter a series of numbers separated by commas: ");
        s = sc.nextLine();
        System.out.println("Sum is: " + Sum(s));
    }

    public static int Sum(String s)
    {
        int sum = 0;
        String[] tokens = s.split(",");
        for(String a:tokens)
        {
            sum += Integer.parseInt(a);
        }

        return sum;
    }
}
