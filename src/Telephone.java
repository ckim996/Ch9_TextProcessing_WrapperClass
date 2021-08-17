public class Telephone
{
    public final static int FORMATTED_LENGTH = 13;
    public final static int UNFORMATTED_LENGTH = 10;

    // (XXX)XXX-XXXX
    public static boolean isFormatted(String s)
    {
        boolean valid;

        if(s.length() == FORMATTED_LENGTH &&
        s.charAt(0) == '(' &&
        s.charAt(4) == ')' &&
        s.charAt(8) == '-')
        {
            valid = true;
        }else{
            valid = false;
        }
        return valid;
    }

    public static String unformat(String s)
    {
        StringBuilder str = new StringBuilder(s);
        if(isFormatted(s))
        {
            str.deleteCharAt(0);
            // XXX)XXX-XXXX
            str.deleteCharAt(3);
            // XXXXXX-XXXX
            str.deleteCharAt(6);
            // XXXXXXXXXX
        }else{
            System.out.println("The correct format for Formatted T# is (XXX)XXX-XXXX");
        }
        return str.toString();
    }

    public static String format(String s)
    {
        StringBuilder str = new StringBuilder(s);
        if(str.length() == UNFORMATTED_LENGTH)
        {
            str.insert(0,'(');
            str.insert(4, ')');
            str.insert(8,'-');
        }

        return str.toString();
    }
}
