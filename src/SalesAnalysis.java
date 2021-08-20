import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SalesAnalysis
{
    public static void main(String[] args) throws IOException
    {
        int choice;
        int week = 0;
        double sum = 0;
        int count = 0;
        double greatest = 0;
        int greatestWeek = 0;
        double lowest = Integer.MAX_VALUE;
        int lowestWeek = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Welcome to Sales Analysis Program. Choose the menu, then the file!" +
                    "\n\nMENU:" +
                    "\n1) Get Total Sales of each week" +
                    "\n2) Get Average daily sales for each week" +
                    "\n3) Get Total Sales for all of the weeks" +
                    "\n4) Get Average Weekly Sales" +
                    "\n5) Get the Week number that had the highest amount of sales" +
                    "\n6) Get the Week number that had the lowest amount of sales" +
                    "\n7) Exit Program" +
                    "\n 1-7: ");
            choice = sc.nextInt();

            if(choice == 1) // Total Sales for each week
            {
                Scanner inputFile = openFile();
                while(inputFile.hasNext())
                {
                    String line = inputFile.nextLine();
                    StringTokenizer token = new StringTokenizer(line,",");
                    count++;

                    while(token.hasMoreTokens())
                    {
                        sum += Double.parseDouble(token.nextToken());
                    }
                    System.out.printf("Week %d Sales Total: $%.2f",count,sum);
                    System.out.println();
                }
                // count and sum = 0 to reset for other files
                count = 0;
                sum = 0;
                inputFile.close();
                System.out.println();
            }else if(choice == 2) // Average daily sales for each week
            {
                Scanner inputFile = openFile();
                while(inputFile.hasNext())
                {
                    String line = inputFile.nextLine();
                    StringTokenizer token = new StringTokenizer(line,",");
                    count++;

                    while(token.hasMoreTokens())
                    {
                        sum += Double.parseDouble(token.nextToken());
                    }
                    double avg = sum / 7;
                    System.out.printf("Week %d Average: $%.2f",count,avg);
                    System.out.println();
                }
                // count and sum = 0 to reset for other files
                count = 0;
                sum = 0;
                inputFile.close();
                System.out.println();
            }else if(choice == 3) // Total Sales for all of the weeks
            {
                double ttlSales = 0;
                Scanner inputFile = openFile();
                while(inputFile.hasNext())
                {
                    String line = inputFile.nextLine();
                    StringTokenizer token = new StringTokenizer(line,",");
                    count++;

                    while(token.hasMoreTokens())
                    {
                        sum += Double.parseDouble(token.nextToken());
                    }
                    ttlSales += sum;
                }
                System.out.printf("Total Sales for all week: $%.2f",ttlSales);
                System.out.println();
                sum = 0;
                inputFile.close();
                System.out.println();
            }else if(choice == 4) // Average Weekly Sales
            {
                double ttlSales = 0;
                Scanner inputFile = openFile();
                while(inputFile.hasNext())
                {
                    week++;
                    String line = inputFile.nextLine();
                    StringTokenizer token = new StringTokenizer(line,",");
                    count++;

                    while(token.hasMoreTokens())
                    {
                        sum += Double.parseDouble(token.nextToken());
                    }
                    ttlSales += sum;
                }
                double avgWeekly = ttlSales / week;
                System.out.printf("Total Sales for all week: $%.2f",avgWeekly);
                System.out.println();
                sum = 0;
                inputFile.close();
                System.out.println();
            }else if(choice == 5) // Week number that had highest amount of sales
            {
                Scanner inputFile = openFile();
                while(inputFile.hasNext())
                {
                    String line = inputFile.nextLine();
                    StringTokenizer token = new StringTokenizer(line,",");
                    count++;

                    while(token.hasMoreTokens())
                    {
                        sum += Double.parseDouble(token.nextToken());
                    }
                    if(sum > greatest)
                    {
                        greatest = sum;
                        greatestWeek = count;
                    }
                }
                System.out.printf("Week %d had the highest amount of sales of $%.2f",greatestWeek,greatest);
                System.out.println();
                // count and sum = 0 to reset for other files
                count = 0;
                sum = 0;
                inputFile.close();
                System.out.println();
            }else if(choice == 6) // Week number that had lowest amount of sales
            {
                Scanner inputFile = openFile();
                while(inputFile.hasNext())
                {
                    String line = inputFile.nextLine();
                    StringTokenizer token = new StringTokenizer(line,",");
                    count++;

                    while(token.hasMoreTokens())
                    {
                        sum += Double.parseDouble(token.nextToken());
                    }
                    if(sum < lowest)
                    {
                        lowest = sum;
                        lowestWeek = count;
                    }
                }
                System.out.printf("Week %d had the highest amount of sales of $%.2f",lowestWeek,lowest);
                System.out.println();
                // count and sum = 0 to reset for other files
                count = 0;
                sum = 0;
                inputFile.close();
                System.out.println();
            }else if(choice == 7)
            {
                System.exit(0);
            }
        }while(choice <= 6 || choice >= 1);
    }

    public static Scanner openFile() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Files available: word.txt\tGrades.csv\tsales.txt\nInput file name to find word counter: ");
        String fileN = sc.nextLine();

        File file = new File("src/"+ fileN);
        Scanner inputFile = new Scanner(file);
        return inputFile;
    }
}
