import java.io.BufferedReader;
import java.io.InputStreamReader;
public class GCD_and_LCM_Recursion 
{
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    int a, b, gcd;
    void input()
    {
        System.out.println("Enter Two Numbers: ");
        try
        {
            a = Integer.parseInt(BR.readLine());
            b = Integer.parseInt(BR.readLine());
            if(a == 0 || b == 0)
            {
                System.out.println("You Cannot Enter ZERO!");
                System.exit(0);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    int min()
    {
        return a<b ? a : b;
    }
    int GCD(int i)
    {
        if(i==1)
        {
            return 1;
        }
        if(a%i == 0 && b%i == 0)
        return (i);
        else return GCD(i-1);
    }
    int LCM()
    { 
        return (a*b)/GCD((min()));
    }
    public static void main(String args[])    
    {
        GCD_and_LCM_Recursion GLM = new GCD_and_LCM_Recursion();
        GLM.input();
        System.out.println("The Greatest Common Divisor of "+GLM.a+" and "+GLM.b+" is "+GLM.GCD((GLM.min())));
        System.out.println("The Lowest Common Multiple of "+GLM.a+" and "+GLM.b+" is "+GLM.LCM());
    }
}