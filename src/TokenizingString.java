public class TokenizingString
{
    public static void main(String[] args)
    {
        String str = "one, two, three, four, five";
        String names = "Chanwoo Kim; Ericka Liang; Cyka Blyat";
        String email = "chanwookm@hotmail.com";

        String[] tokens = str.split(",");
        String[] token2 = names.split(";");
        String[] token3 = email.split("[@.]");

        for(String s : tokens)
        {
            System.out.print(s);
        }

        System.out.println();

        for(String s1 : token2)
        {
            System.out.print(s1);
        }

        System.out.println();

        for(String s2 : token3)
        {
            System.out.print(s2);
        }
    }
}