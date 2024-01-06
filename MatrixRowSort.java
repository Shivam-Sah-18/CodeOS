import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MatrixRowSort 
{
    int array[][], M, N;
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    void input() throws Exception
    {
        System.out.println("Enter Number of rows(M): ");
        M = Integer.parseInt(BR.readLine());
        System.out.println("Enter the number of columns(N): ");
        N = Integer.parseInt(BR.readLine());
        if(M<=2 || M>=10 || N<=2 || N>=10)
        {
            System.out.println("Matrix Size Out of Range");
            return;
        }
        array = new int[M][N];
        System.out.println("Enter Elements of Matrix: ");
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<N; j++)
            array[i][j] = Integer.parseInt(BR.readLine());
        }
        System.out.println("Original Matrix: ");
        displayMatrix();
        System.out.println("Sorted Matrix: ");
        sortMatrix();
        displayMatrix();
    }
    void displayMatrix()
    {
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<N; j++)
            System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
    void sortMatrix()
    {
        for(int i=0; i<M; i++)
        {
            int flag=0, temp=0;
            for(int j=0; j<N-1; j++)
            {
                if(array[i][j]>array[i][j+1])
                {
                    temp = array[i][j];
                    array[i][j] = array[i][j+1];
                    array[i][j+1] = temp;
                    flag++;
                }
            }
            if(flag!=0) i=(i-1);
        }
    }
    public static void main(String args[]) 
    {
        MatrixRowSort MRS = new MatrixRowSort();
        try
        {
            MRS.input();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}