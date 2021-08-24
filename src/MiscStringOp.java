import java.util.Scanner;

public class MiscStringOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a short sentence: ");
        String s = sc.nextLine();
        System.out.print("\nNumber of words in sentence: " + wordCount(s));
        System.out.println("\nFirst appearing most frequent character: " + mostFrequent(s));
    }

    public static int wordCount(String s) {
        String[] wordArr;
        int count = 0;

        wordArr = s.split("\\s+");
        count += wordArr.length;

        return count;
    }

    /*
    // different way to do wordCount
    public static int wordCount(String phrase)
    {
        StringTokenizer st = new StringTokenizer(phrase);
        return st.countTokens();
    }
     */

    public static String arrayToString(char[] c) {
        String s;
        s = c.toString();

        return s;
    }

    public static char mostFrequent(String s) {
        int count = 0;
        char ch;
        String t = s.replaceAll(" ", "");
        char[] c = new char[t.length()];
        int[] comparingArr = new int[c.length];

        System.out.println(t);

        for (int i = 0; i < c.length; i++) {
            c[i] = t.charAt(i);
        }


        for (int a = 0; a < c.length; a++) {
            System.out.print(c[a] + " ");
        }

        for (int j = 0; j < c.length; j++) {
            ch = c[j];
            for (int k = j + 1; k < c.length; k++) {
                if (ch == c[k]) {
                    count++;
                }
            }
            comparingArr[j] = count;
            count = 1;
        }

        System.out.println();

        for (int z = 0; z < comparingArr.length; z++) {
            System.out.print(comparingArr[z] + " ");
        }
        /*
        System.out.println();
        for(int y = 1; y < c.length; y++)
        {
            if(bigC < comparingArr[y])
            {
                comparingArr[y] = bigC;
            }
        }


        ch = c[bigC];
        System.out.println(ch);
         */

        int bigC = comparingArr[0];
        StringBuilder sb = new StringBuilder();
        for (int y = 1; y < comparingArr.length; y++) {
            if (bigC < comparingArr[y]) {
                bigC = comparingArr[y];
                sb.append(c[y]);
            }

            if (bigC == comparingArr[y]) {
                bigC = comparingArr[y];
                sb.append(c[y]);
            }
        }
        String finalStr = sb.toString();
        System.out.println();

        return finalStr.charAt(0);
    }
}