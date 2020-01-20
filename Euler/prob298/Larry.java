class Larry extends Person
{

    public Larry(){}

    public Larry(int[] firstFive)
    {
        this.memory  = new int[2][5];
        this.quikmem = new int[11];

        for(int i = 1; i < 10; i++ )
        {
            this.quikmem[i] = 0;
        }

        for(int i = 0; i < 5; i++)
        {
            this.memory[0][i] =  firstFive[i];
            this.memory[1][i] = i;
            this.quikmem[firstFive[i]] = 1;
        }

        this.score = 0;
    }

    public void amnesia( int numberToRemember, int turn )
    {
        int comp = turn;
        int index = 0;
        for(int i = 0; i < 5; i++) // find number called furthest in past
        {
            if(this.memory[1][i]<comp)
            {
                index = i;
                comp = this.memory[1][i];
            }
        }
        // set variables
        this.memory[0][index] = numberToRemember;
        this.memory[1][index] = turn;
        this.quikmem[index] = 0;
        this.quikmem[numberToRemember] = 1;
    }

    public boolean knows( int questionableNumber, int turn )
    {
        boolean val = super.knows(questionableNumber);

        if( true == val ) //if we know the number
        {
            for(int i = 0; i < 5; i++) // look through the numbers
            {
                if(this.memory[0][i] == questionableNumber) // and update when it was last called
                {
                    this.memory[1][i] = turn;
                }
            }
        }
        return val;
    }

    public int getScore()
    {
        return super.getScore();
    }

    public void incScore()
    {
        super.incScore();
    }

    public int[][] getMemory()
    {
        return super.getMemory();
    }

}
