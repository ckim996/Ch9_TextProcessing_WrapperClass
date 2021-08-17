import java.util.Scanner;

public class TelephoneDemo
{
    public static void main(String[] args)
    {
        String tNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your UNFORMATTED telephone number: ");
        tNum = sc.nextLine();
        System.out.println("The formatted version is " + Telephone.format(tNum));

        System.out.println("Please input your FORMATTED (XXX)XXX-XXXX telephone number:");
        tNum = sc.nextLine();
        System.out.println("The unformatted version is " + Telephone.unformat(tNum));
    }
}
