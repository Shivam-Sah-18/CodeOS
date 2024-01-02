import java.io.BufferedReader;
import java.io.InputStreamReader;
public class GoldbachNumber 
{
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    int N;
    void input() throws Exception
    {
        System.out.println("Enter a Number: ");
        N = Integer.parseInt(BR.readLine());
        if(N<=9 || N>=50)
        {
            System.out.println("Invalid Input. Number Out of Range.");
            return;
        }
        if(!(N%2==0))
        {
            System.out.println("Invalid Input. Number is ODD.");
            return;
        }
        display();
    }
    boolean isPrime(int n, int i)
    {
        if(i>(n/2)) return true;
        else if(n%i == 0) return false;
        else return isPrime(n, i+1);
    }
    void display()
    {
        System.out.println("The Prime Pairs are: ");
        for(int i=3; i<=(N/2); i=i+2)
        {
            if(isPrime(i, 2) && isPrime(N-i, 2))
            System.out.println(i+", "+(N-i));
        }
    }
    public static void main(String args[])
    {
        GoldbachNumber GBN = new GoldbachNumber();
        try
        {
            GBN.input();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}