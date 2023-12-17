import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sentence 
{
    String SB, array[];
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    void input() throws Exception
    {
        System.out.println("Input a Sentence: ");
        SB = BR.readLine();
    }
    void CheckAndArrange()
    {
        if(SB.charAt(SB.length()-1)== '.' || SB.charAt(SB.length()-1)== '?' || SB.charAt(SB.length()-1)== '!');
        else
        {
            System.out.println("Invalid Input");
            return;
        }
        array = (SB.substring(0, SB.length()-1)).split(" ");
        System.out.println(SB); 
        String temp;
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array.length-1; j++)
            {
                if(array[j].length()>array[j+1].length()) 
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                else if(array[j].length() == array[j+1].length())
                {
                    if(array[j].compareTo(array[j+1])>0)
                    {
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
        for(String i:array)
        System.out.print(i+" ");
    }
    public static void main(String args[]) throws Exception
    {
        Sentence STC = new Sentence();
        STC.input();
        STC.CheckAndArrange();
    }
}