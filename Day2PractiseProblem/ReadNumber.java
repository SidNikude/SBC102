//If Else Statement Problems
//1. Read a single Digit Number and write in word

package Day2PractiseProblem;
import java.util.Scanner;

public class ReadNumber
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String[] arr = {"zero","one", "two", "three","four","five","six","seven","eight","nine"};
        System.out.println("Enter a single Digit Number ");
        int number = sc.nextInt();
        if(number<10)
        {
            System.out.println("You have entered number: "+ arr[number]);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}