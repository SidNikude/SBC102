// Programs With While Loop
//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

package Day2PractiseProblem;

public class SumOfNNaturalNo
{
    public static void main(String[] args)
    {
        int sum=0;
        int i=0;
        while(i<=5)
        {
            sum+=i;
            i++;
        }
        System.out.println("The sum of 1 to 5 is " + sum);

    }
}
