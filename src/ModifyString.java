public class ModifyString
{
    public static void main(String[] args)
    {
        String fullN;
        String firstN = "Chanwoo";
        String lastN = "Kim";
        fullN = firstN.concat(lastN);
        System.out.println(fullN);

        String n = fullN.replace('o','a');
        System.out.println(n);

        String s = "   Hello   ";
        System.out.println(s);
        String s1 = s.trim();
        System.out.println(s1);
    }
}
