import java.lang.Math;

//TODO: Make it multithreaded. 1,000,000,000 number of trails took about 37 minutes (2203 seconds) on my computer
// at 100,000,000, takes about 4 minutes (230-250 seconds).

public class Problem298
{
    public static void main(String[] args)
    {
        int numTrails = 100000000;
        long startTime = System.nanoTime();
        int score = 0;
        for(int k = 0; k < numTrails; k++)// parallelize here
        {
            int[] randArray = randArray(50);
            Larry larry = new Larry(randArray);
            Robin robin = new Robin(randArray);

            for (int j = 0; j < 50; j++)
            {
                boolean larryKnows = larry.knows(randArray[j],j);
                boolean robinKnows = robin.knows(randArray[j]);

                if(true == larryKnows)
                {
                    larry.incScore();
                }
                else
                {
                    larry.amnesia(randArray[j],j);
                }

                if(true ==robinKnows)
                {
                    robin.incScore();
                }
                else
                {
                    robin.amnesia(randArray[j],j);
                }

            }

            score = score + java.lang.Math.abs(larry.getScore() - robin.getScore());
        }

        double finalScore = (score + 0.0)/numTrails;
        System.out.println(score);
        System.out.println(finalScore);
        long endTime = System.nanoTime();
        System.out.println("Time to compute: "+ (endTime-startTime)/1000000000+" seconds");
    }


    public static int[] randArray(int numberOfRandNumReq)
    {
        int[] randNumbers = new int[numberOfRandNumReq];
        for(int i = 0; i < numberOfRandNumReq; i++)
        {
            randNumbers[i] = ((int) Math.floor(10*Math.random()))+1;
        }
        return randNumbers;
    }

    public static void print_array(int[] array, int end )
    {
        for (int i = 0; i < end; i++)
        {
            System.out.println(array[i]);
        }
    }

}
