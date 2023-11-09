import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvilNumber
{
    static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    static int num, bin;
    static String str;
    public static void main(String args[]) throws Exception
    {
        acceptNum();
        rec_bin(num);   
        check();
    }

    static void acceptNum() throws Exception
    {
        System.out.println("Enter a Number: ");
        num = Integer.parseInt(BR.readLine());
    }

    static void rec_bin (int x)
    {
        str = Integer.toBinaryString(x);
        bin = Integer.parseInt(str);
    }

    static void check()
    {
        int count = 0; 
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '1') count++;
        }
        if(count%2 == 0) System.out.println(num+" is an Evil Number!");
        else System.out.println(num+" isn't an Evil Number");
    }
}