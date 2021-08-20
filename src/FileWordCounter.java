import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWordCounter
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Files available: word.txt\tGrades.csv\nInput file name to find word counter: ");
        String fileN = sc.nextLine();

        File file = new File("src/"+fileN);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String[] wordArr;
        int counter = 0;

        while((s = br.readLine()) != null)
        {
            // if line is not empty. Without the if statement, it will count the empty lines as well.
            if(!s.isEmpty())
            {
                wordArr = s.split("\\s+");
                counter += wordArr.length;
            }
        }
        fr.close();

        System.out.println("The number of characters in " + file + " is " + counter);
    }
}