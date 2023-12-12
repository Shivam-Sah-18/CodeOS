import java.io.BufferedReader;
import java.io.InputStreamReader;
public class QuadraticEquations 
{
    int a, b, c;
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    void input() throws Exception
    {
        System.out.println("Enter the values as: ");
        System.out.print("a: ");
        a = Integer.parseInt(BR.readLine());
        System.out.print("b: ");
        b = Integer.parseInt(BR.readLine());
        System.out.print("c: ");
        c = Integer.parseInt(BR.readLine());
    }

    void calculateRoots()
    {
        int d = (b*b) -(4*a*c);
        if(d>0)
        {
            double root = (-b + Math.sqrt(d))/(2*a);
            System.out.print("The Roots are: " +root);
            root = (-b - Math.sqrt(d))/(2*a);
            System.out.println(", "+root);
        }
        else if(d==0)
        {
            double root = -b/(2*a);
            System.out.print("The Repititive Root is: " +root);
        }
        else
        System.out.println("The Roots are Complex and Imaginary.");
    }
    public static void main(String ARGS[]) throws Exception   
    {
        QuadraticEquations QE = new QuadraticEquations();
        QE.input();
        QE.calculateRoots();
    }
}
