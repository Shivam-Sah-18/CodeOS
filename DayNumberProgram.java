package CodeOS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class DayNumberProgram
{
    static int DN, M, Y, i, j; 
    static int month[] = {0, 31, 28, 31, 30,31, 30, 31, 30, 31, 30, 31, 30};
    static String monthName[] = {" ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    static void input() throws Exception
    {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the year: ");
        Y = Integer.parseInt(BR.readLine());
        System.out.println("Enter The day number: ");
        DN = Integer.parseInt(BR.readLine());
    }
    static void compute()
    {
        if(Y%4 == 0) month[2]++;
        for(i=1; i<=12; i++)
        {
            for(j=1; j<=month[i] && j<=DN; j++)
            {
                if(j == DN) continue;
                if(j == month[i]) DN = DN - (j);
            }
            if((j-1)==DN) break;
        }
    }
    public static void main(String args[]) throws Exception
    {
        input();
        compute();
        System.out.println("The required date is: "+(j-1)+" "+monthName[i]+", "+Y );
    }
}