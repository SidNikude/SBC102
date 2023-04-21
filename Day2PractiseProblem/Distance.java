// 4. Write a program Distance.java that takes two integer command-line arguments x and y
// and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
// The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

package Day2PractiseProblem;
import java.util.*;
class Distance
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double euclideanDistance = (Math.sqrt(x*x + y*y));
        System.out.println("The Euclidean distance from the point (x, y) to the origin (0, 0) is " + euclideanDistance);
    }
}
