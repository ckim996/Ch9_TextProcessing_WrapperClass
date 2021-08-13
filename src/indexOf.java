/*
Program for indexOf and lastIndexOf
 */

public class indexOf
{
    public static void main(String[] args)
    {
        String str = "Hello there, why were you there";

        System.out.println(str);

        System.out.println("the word there appears in the following positions: ");
        int position = str.indexOf("there");
        while(position != -1)
        {
            System.out.println(position);
            position = str.indexOf("there", position +1);
        }

        System.out.println("\nUsing indexOf(character)");
        System.out.println("Searching for character e from string that appears the first time. Position: " + str.indexOf('e'));

        System.out.println("\nUsing indexOf(character, int start)");
        System.out.println("Searching for character e from string after the third position of the substring. Position: " + str.indexOf('e',3));

        System.out.println("\nUsing indexOf(string)");
        System.out.println("Searching for substring 'there' from string that appears the first time. Position: " + str.indexOf("there"));

        System.out.println("\nUsing indexOf(string, int start)");
        System.out.println("Searching for substring 'there' from string after the 7th position of the substring. Position: " + str.indexOf("there", 7));

        System.out.println("\nUsing lastIndexOf(character)");
        System.out.println("Searching for character e from string that appears the last time. Position: " + str.lastIndexOf('e'));

        System.out.println("\nUsing lastIndexOf(character, int start)");
        System.out.println("Searching for character e from string before the 12th position and returns the position of its last occurrence. Position: " + str.lastIndexOf('e',12));

        System.out.println("\nUsing lastIndexOf(string)");
        System.out.println("Searching for substring 'there' and returns the position of its last occurrence. Position: " + str.lastIndexOf("there"));

        System.out.println("\nUsing lastIndexOf(string, int start)");
        System.out.println("Searching for substring 'there' before the 12th position and returns the position of its last occurrence. Position: " + str.lastIndexOf("there",12));
    }
}
