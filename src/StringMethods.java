public class StringMethods
{
    public static void main(String[] args)
    {
        String str = "Four score and seven years ago";
        String str2 = "THOSE SEVEN YEARS PASSED QUICKLY";

        // Using the overloaded ignoreCase method
        if(str.regionMatches(true,15,str2,6,11))
        {
            // prints true
            System.out.println("the regions match");
        }else{
            System.out.println("Regions do not match");
        }

        // using the original regionMatches method
        if(str.regionMatches(15,str2,6,11))
        {
            System.out.println("the regions match");
        }else{
            // prints false
            System.out.println("Regions do not match");
        }
    }
}
