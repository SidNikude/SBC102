// 2. Read a Number 1,10,100,1000 and display unit, ten hundred
package Day2PractiseProblem;
import java.util.Scanner;

public class ReadOneTenHundred
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value ");
            int value = sc.nextInt();
            if (value == 1)
            {
                System.out.println("Unit");
            }

            else if (value == 10)
            {
                System.out.println("Ten");
            }
            else if (value == 100)
            {
                System.out.println("Hundred");
            }
            else
            {
                System.out.println("Thousand");
            }
        }
}
