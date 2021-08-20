import java.util.Scanner;

public class PasswordVerifier
{
    public static void main(String[] args)
    {
        String pw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        pw = sc.nextLine();
        System.out.println(verify(pw));
    }

    public static String verify(String s)
    {
        StringBuilder response = new StringBuilder();
        int UCounter = 0;
        int LCounter = 0;
        int DCounter = 0;
        boolean valid = true;

        if(s.length() < 6)
        {
            response.append("Password too short! ");
            valid = false;
        }else{
            for(int i = 0; i < s.length(); i++)
            {
                if(Character.isUpperCase(s.charAt(i)))
                {
                    UCounter++;
                }else if(Character.isLowerCase(s.charAt(i)))
                {
                    LCounter++;
                }else if(Character.isDigit(s.charAt(i)))
                {
                    DCounter++;
                }
            }
        }

        if(valid && UCounter >= 1 && LCounter>=1 && DCounter>=1)
        {
            response.append("Password passes all requirements.");
        }else{
            response.append("Password does NOT pass all requirements");
        }

        return response.toString();
    }
}
