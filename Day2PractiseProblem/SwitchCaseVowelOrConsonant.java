// Programs with Switch Statement
//1. Write a Program to Check Vowel or Consonant

package Day2PractiseProblem;
import java.util.Scanner;
public class SwitchCaseVowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check if vowel or constant");
        char input = sc.next().charAt(0);

        switch (input)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
