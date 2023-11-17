import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TechNumber 
{
    public static void main(String args[]) throws Exception  
    {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number: ");   
        int num = Integer.parseInt(BR.readLine());
        
        if(length(num)%2 != 0)
        {
            System.out.println(num+ " isn't a Tech Number!");
            return;
        }
        int half1 = 0, half2 = 0; int flag = 1; 
        for(int i=1; i<=length(num)/2 ;i++)
        {
            flag = flag*10;
        }
        half1 = num/flag;
        half2 = num%flag;

        if(square(half1+half2) == num)
        System.out.println(num+" is a Tech Number!");
        else System.out.println(num+" isn't a Tech Number!");
    }
    static int length(int number)
    {
        int count = 0;
        while(number!=0)
        {
            number = number/10;
            count++;
        }
        return count;
    }
    static int square(int number)
    {
        return number*number;
    }
}