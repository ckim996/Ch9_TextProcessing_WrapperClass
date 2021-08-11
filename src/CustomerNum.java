import java.util.Scanner;

public class CustomerNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a customer number in the following format LLLNNNN" +
                "\n(LLL = Letters & NNNN = #s):");
        String input = sc.nextLine();

        if(isValid(input))
        {
            System.out.println("Welcome " + input);
        }else{
            System.out.println("That is not LLLNNNN format. Later boi");
        }

    }

    public static boolean isValid(String in)
    {
        boolean good = true;
        int i = 0;

        if(in.length() != 7)
            good = false;

        //Tests the first three characters if it is a letter LLLNNNN
        while(good && i < 3)
        {
            if(!Character.isLetter(in.charAt(i)))
            {
                good = false;
            }
            i++;
        }

        //Tests the last four digits if it is a number LLLNNNN
        while(good && i < 7)
        {
            if(!Character.isDigit(in.charAt(i)))
            {
                good = false;
            }
            i++;
        }
        return good;
    }
}
