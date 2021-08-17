import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestScoreReader
{
    private Scanner inputFile;
    private String line;

    public TestScoreReader(String fileN) throws IOException
    {
        fileN = "src/" + fileN;
        File file = new File(fileN);
        inputFile = new Scanner(file);
    }

    public boolean readNextLine()
    {
        boolean lineRead;

        //Determine whether there is more to read
        lineRead = inputFile.hasNext();

        if(lineRead)
        {
            line = inputFile.nextLine();
        }
        return lineRead;
    }

    public double getAverage()
    {
        int total = 0;
        double avg;

        String[] tokens = line.split(",");

        for(String s : tokens)
        {
            total += Integer.parseInt(s);
        }

        avg = (double) total / tokens.length;

        return avg;
    }

    public void close() throws IOException
    {
        inputFile.close();
    }
}
