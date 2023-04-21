// 3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)
//Take a, b, and c as input values to find the roots of x.

package Day2PractiseProblem;
import java.util.*;
public class Quadratic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of x ");
        double x = sc.nextDouble();
        System.out.println("Enter the value of b ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c ");
        double c = sc.nextDouble();
        double quadraticEquation = a*x*x + b*x + c;
        double delta =  b*b - 4*a*c;

        double root1 = (-b + (Math.sqrt(delta)))/(2*a);
        System.out.println("The root 1 is " + root1);
        double root2 = (-b - (Math.sqrt(delta)))/(2*a);
        System.out.println("The root 2 is " + root2);
    }
}
/*
import java.util.Scanner;

public class Quadratic
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        */