public class StringBuilderTEST
{
    public static void main(String[] args)
    {
        /*
        str uses append
        city uses insert
        str2 uses replace
        str3 uses delete, deleteCharAt, setCharAt
        str4 uses toString method
         */

        StringBuilder str = new StringBuilder();
        str.append("We sold ");
        str.append(12);
        str.append(" doughnuts for $");
        str.append(15.95);

        StringBuilder city = new StringBuilder("New City");
        city.insert(4, "York ");

        StringBuilder str2 = new StringBuilder("We moved from Chicago to Atlanta.");
        str2.replace(14,21,"Seoul");

        StringBuilder str3 = new StringBuilder("I ate 100 bluberries!");
        str3.deleteCharAt(7);
        str3.delete(9,12);
        str3.setCharAt(6,'5');

        StringBuilder str4 = new StringBuilder("Hello my name is SOOSIE");
        String st = str4.toString();

        System.out.println(str);
        System.out.println(city);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(st);
    }
}
