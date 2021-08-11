import java.util.Scanner;

public class CharacterTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("Input any single character: ");
        String input = sc.nextLine();
        c = input.charAt(0);

        if(Character.isDigit(c))
        {
            System.out.println(c + " is a digit");
        }
        if(Character.isLetter(c))
        {
            System.out.println(c + " is a letter");
        }
        if(Character.isLowerCase(c))
        {
            System.out.println(c + " is lowercase");
        }
        if(Character.isUpperCase(c))
        {
            System.out.println(c + " is upper case");
        }
        if(Character.isSpaceChar(c))
        {
            System.out.println("That is a space character");
        }
        if(Character.isWhitespace(c))
        {
            System.out.println("That is a white space");
        }
    }
}
