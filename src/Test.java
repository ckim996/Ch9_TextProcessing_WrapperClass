import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/sales.txt");
        Scanner inputFile = new Scanner(file);
        double total=0;
        int count=0;
        double finaltotal=0;
        double greatest=0;
        double lowest=Integer.MAX_VALUE;
        int num=0;
        int num1=0;

        while(inputFile.hasNext())
        {
            String s = inputFile.nextLine();
            StringTokenizer token = new StringTokenizer(s,",");
            count++;

            while(token.hasMoreTokens())
            {
                total+=Double.parseDouble(token.nextToken());
            }

            if(total>greatest)
            {
                greatest=total;
                num=count;
            }

            if (total<lowest)
            {
                lowest=total;
                num1=count;
            }


            finaltotal+=total;

            System.out.println("Week " + count + " Total : "+ total);
            System.out.println("Week " + count + " Average : "+ (total/7));
            total=0;
        }
        System.out.println("Total Sales: "+ finaltotal);
        System.out.println("Average Weekly Sales: "+ (finaltotal/count));
        System.out.println("Highest Week Sales: " + "Week " + num + " with " + greatest );
        System.out.println("Lowest Week Sales: " + "Week " + num1 + " with " + lowest );
    }
}

