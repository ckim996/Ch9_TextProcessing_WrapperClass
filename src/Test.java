import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int count = 1;
        char ch;
        String s = "Hello my name is susie";
        String t = s.replaceAll(" ", "");
        System.out.print("String length: " + t.length());
        System.out.println();

        char[] c = new char[t.length()];
        int[] comparingArr = new int[c.length];

        System.out.println(t);

        for (int i = 0; i < c.length; i++)
        {
            c[i] = t.charAt(i);
        }


        for(int a = 0; a < c.length; a++)
        {
            System.out.print(c[a] + " ");
        }

        for(int j = 0; j < c.length; j++)
        {
            ch = c[j];
            for(int k = j+1;k < c.length; k++)
            {
                if(ch == c[k])
                {
                    count++;
                }
            }
            comparingArr[j] = count;
            count = 1;
        }

        System.out.println();

        for(int z = 0; z < comparingArr.length; z++)
        {
            System.out.print(comparingArr[z] + " ");
        }


        int bigC = comparingArr[0];
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


        StringBuilder sb = new StringBuilder();
        for(int y = 1 ; y < comparingArr.length; y++)
        {
            if (bigC < comparingArr[y])
            {
                bigC = comparingArr[y];
                sb.append(c[y]);
            }

            if(bigC == comparingArr[y])
            {
                bigC = comparingArr[y];
                sb.append(c[y]);
            }
        }
        String finalStr = sb.toString();
        System.out.println();

        for(int i = 0; i < finalStr.length(); i++)
        {
            System.out.print(finalStr.charAt(i) + " ");
        }


    }
}

