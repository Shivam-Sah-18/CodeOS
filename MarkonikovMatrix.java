import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MarkonikovMatrix
{
    double M[][], SumRow, SumColumn;
    int N;
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    void input() throws Exception
    {
        System.out.println("Enter the order of Matrix(3<=N<=9): ");
        N = Integer.parseInt(BR.readLine());
        if(N<3 || N>9)
        {
            System.out.println("The Entered Order is Out of Range!");
            return;
        }
        M = new double[N][N];
        System.out.println("Enter the Elements of Matrix(>=0): ");
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                M[i][j] = Double.parseDouble(BR.readLine());
                if(M[i][j]>=0) continue;
                else System.out.println("You cannot enter a Negative Number!");
            }
        }
    }
    void printMatrix()
    {
        System.out.println("The Elements of Matrix are: ");
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                System.out.print(M[i][j]+"  ");
            }
            System.out.println();
        }
    }
    void checkMatrixConditions()
    {
        for(int i=0; i<N; i++)
        {
            SumRow = 0; SumColumn = 0;
            for(int j=0; j<N; j++)
            {
                SumRow = SumRow + M[i][j];
                SumColumn = SumColumn + M[j][i];
            }
            if(SumRow!=1)
            {
                System.out.println("The Entered Matrix is NOT a Doubly Markonikov Matrix!");
                return;
            }
            if(SumColumn!=1)
            {
                System.out.println("The Entered matrix is NOT a Doubly Markonikov Matrix!");
                return;
            }
        }        
        System.out.println("The Entered Matrix is a Doubly Markonikov Matrix!");
    }
    public static void main(String args[]) throws Exception
    {
        MarkonikovMatrix MM = new MarkonikovMatrix();
        MM.input();
        MM.printMatrix();
        MM.checkMatrixConditions();
    }
}