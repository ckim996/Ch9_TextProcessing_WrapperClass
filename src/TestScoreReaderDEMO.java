import java.io.IOException;

public class TestScoreReaderDEMO
{
    public static void main(String[] args) throws IOException
    {
        double avg;
        int sNum = 1;
        TestScoreReader tS = new TestScoreReader("Grades.csv");
        while(tS.readNextLine())
        {
            avg = tS.getAverage();
            System.out.println("Average for student " + sNum + " is " + avg);
            sNum++;
        }
        tS.close();
        System.out.println("no more scores");
    }
}
