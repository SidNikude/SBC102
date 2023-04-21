// 1.6 Write a program to demonstrate static variables, methods, and blocks.
package Day1PractiseProblem;

public class StaticDemo
{
    //Static variable
    static int count=0;

    //Static block
    static
    {
        System.out.println("Static block executed");
    }

    //Static method
    public static void staticMethodExecution()
    {
        System.out.println("Static method executed ");
        count++;
        System.out.println(count);
    }

    public static void main(String[] args)
    {
        staticMethodExecution();
    }
}
