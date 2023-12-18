import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RearrangeWord
{
    StringBuilder SB;
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    void input() throws Exception
    {
        System.out.println("Enter a Single Word: ");
        SB = new StringBuilder(BR.readLine());
        int i = 0;
        while(i<SB.length())
        {
            SB.replace(i, i+1, Character.toString(Character.toUpperCase(SB.charAt(i))));
            i++;
        }
    }
    void arrange()
    {
        int index = 0;
        char ch;
        for(int i=0; i<SB.length(); i++)
        {
            ch = SB.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                SB.deleteCharAt(i);
                SB.insert(index, ch);
                index++;
            }
        }
        System.out.println("The Formatted String is: "+SB);
    }
    public static void main(String args[]) throws Exception
    {
        RearrangeWord RWD = new RearrangeWord();
        RWD.input();
        RWD.arrange();
    }
}