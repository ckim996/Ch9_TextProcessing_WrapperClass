public class StringBuilderTEST
{
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder();
        StringBuilder city = new StringBuilder("New City");
        str.append("We sold ");
        str.append(12);
        str.append(" doughnuts for $");
        str.append(15.95);

        city.insert(4, "York ");

        System.out.println(str);
        System.out.println(city);
    }
}
