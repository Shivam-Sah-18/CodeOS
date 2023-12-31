import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DayProgram 
{
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    int DayNumber, year, Month[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int iDate, jMonths, count, dayaft;
    String MonthName[] = {null, "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
    void input() throws Exception
    {
        System.out.println("Enter the Day Number: ");
        DayNumber = Integer.parseInt(BR.readLine());
        System.out.println("Enter the Year: ");
        year = Integer.parseInt(BR.readLine());
        System.out.println("Day After: ");
        dayaft = Integer.parseInt(BR.readLine());
    }
    void Calculations()
    {
        iDate = 1;
        count = 1;
        jMonths = 1;
        if(year%4 == 0) Month[2] = 29;
        else Month[2] = 28;
        while(count!=DayNumber)
        {
            iDate++;
            count++;
            if(iDate>Month[jMonths])
            {
                iDate = 1;
                jMonths++;
                if(jMonths>12)
                {
                    jMonths = 1;
                    year++;
                    if((year)%4 == 0) Month[2] = 29;
                    else Month[2] = 28;
                }
            }
        }
    }
    void display()
    {
        System.out.println("The Date is: "+iDate+" "+MonthName[jMonths]+", "+year);
    }
    public static void main(String args[])
    {
        DayProgram DPO = new DayProgram();
        try
        {
            DPO.input();
            DPO.Calculations();
            DPO.display();
            System.out.println("Day After "+DPO.dayaft+" days, ");
            DPO.DayNumber = DPO.DayNumber + DPO.dayaft;
            DPO.Calculations();
            DPO.display();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}