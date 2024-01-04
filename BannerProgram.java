import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BannerProgram 
{
    int N;
    StringBuffer teamArray[];
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    void input() throws Exception
    {
        System.out.println("Enter value of N: ");
        N = Integer.parseInt(BR.readLine());
        if(N<=2 || N>=9)
        {
            System.out.println("Invalid Input. Out of Range.");
            return;
        }
        teamArray = new StringBuffer[N];

        for(int i=0; i<N; i++)
        {
            System.out.println("Team"+(i+1)+": ");
            teamArray[i] = new StringBuffer(BR.readLine());
        }
        addSpaces();
        display();
    }
    int max()
    {
        int m=0;
        for(int i=0; i<N; i++)
        {
            if(teamArray[i].length()>m) m = teamArray[i].length();
        }
        return m;
    }
    void addSpaces()
    {
        for(int i=0; i<N; i++)
        {
            while(teamArray[i].length()!=max())
            teamArray[i].append(" ");
        }
    }
    void display()
    {
        for(int j=0; j<max(); j++)
        {
            for(int i=0; i<N; i++)
            System.out.print(teamArray[i].charAt(j)+"\t");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        BannerProgram BNP = new BannerProgram();
        try
        {
            BNP.input();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}