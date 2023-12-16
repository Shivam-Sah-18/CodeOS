import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OctalDecimalMatrix
{
    int matrix[][], M, N, decArray[];
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    void Input() throws Exception
    {
        System.out.println("The Order of Matrix is(MxN) ");
        System.out.print("Enter (No. of Rows)M: ");
        M = Integer.parseInt(BR.readLine());
        System.out.print("Enter (No. of Columns)N: ");
        N = Integer.parseInt(BR.readLine());
        if(M<=0 || M>=10 || N<=2 || N>=6)
        {
            System.out.println("Out of Range!");
            return;
        }

        matrix = new int[M][N];
        for(int i=0; i<M; i++)
        {
            System.out.println("Enter Elements for Row "+(i+1)+": ");
            for(int j=0; j<N; j++)
            {
                matrix[i][j] = Integer.parseInt(BR.readLine());
                if(matrix[i][j]<0 || matrix[i][j]>7)
                {
                    System.out.println("You have entered an Invalid Input");
                    return;
                }
            }
        }
        Calculations();
    }
    void printMatrix()
    {
        System.out.println("Filled Matrix\tDecimal Equivalent");
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<N; j++)
            {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("\t\t"+decArray[i]);
        }
    }
    void Calculations()
    {
        decArray = new int[M];
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<N; j++)
            {
                decArray[i] = decArray[i]*10 + matrix[i][j];
            }
            decArray[i] = Conversions(decArray[i]);
        }
        printMatrix();
    }
    int Conversions(int data)
    {
        int result = 0, count = 0;
        while(data!=0)
        {
            result = result + (int)(data%10)*(int)(Math.pow(8, count));
            count++;
            data = data/10;
        }
        return result;
    }
    public static void main(String args[]) throws Exception
    {
        OctalDecimalMatrix ODM = new OctalDecimalMatrix();
        ODM.Input();
    }
}