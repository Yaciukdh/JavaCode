abstract class Person
{

    protected int[][] memory;
    protected int score;
    protected int[] quikmem;
    public Person(){ }

    public abstract void amnesia( int numberToRemember, int turn);


    public boolean knows( int questionableNumber)
    {
        if(quikmem[questionableNumber]==1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public int getScore()
    {
        int tempScore = this.score;
        return tempScore;
    }

    public void incScore()
    {
        this.score = this.score + 1;
    }

    public int[][] getMemory()
    {
        int[][] tempMem = new int[2][5];
        for(int i = 0; i < 5 ; i++)
        {
            tempMem[0][i] = this.memory[0][i] ;
            tempMem[1][i] = this.memory[1][i] ;
        }

        return tempMem;
    }


}
