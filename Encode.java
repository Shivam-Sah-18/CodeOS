import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encode 
{
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer word = new StringBuffer();
    int length;
    StringBuffer new_word = new StringBuffer();
    public static void main(String args[]) throws Exception
    {
        Encode obj = new Encode();
        obj.acceptWord();
        obj.nextVowel();
        obj.display();
    }
    Encode()
    {
        length = 0;
    }
    void acceptWord() throws Exception
    {
        System.out.println("Enter a Single Word");
        word.append(BR.readLine());
        length = word.length();
    }
    void nextVowel()
    {
        int flag = 0;
        char ch;
        for(int i=0; i<length; i++)
        {
            ch = word.charAt(i);
            if(Character.isUpperCase(ch)) 
            {
                ch = Character.toLowerCase(ch);
                flag++;
            }
            switch (ch) {
                case 'a': ch = 'e'; break;
                case 'e': ch = 'i'; break;
                case 'i': ch = 'o'; break;
                case 'o': ch = 'u'; break;
                case 'u': ch = 'a'; break;
            }
            if(flag>0) new_word.append(Character.toUpperCase(ch));
            else new_word.append(ch);
            flag = 0;
        }
    }
    void display()
    {
        System.out.println("Original Word: "+word);
        System.out.println("Encoded Word: "+new_word);
    }
}