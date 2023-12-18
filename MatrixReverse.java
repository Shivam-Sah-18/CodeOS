import java .io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixReverse 
{
    int array[][];
    int m, n;
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    void input() throws Exception
    {
        System.out.println("Enter the number of rows: ");
        m = Integer.parseInt(BR.readLine());
        System.out.println("Enter the number of columns :");
        n = Integer.parseInt(BR.readLine());

        array = new int[m][n];
        System.out.println("Enter the ELements of array row-wise: ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                array[i][j] = Integer.parseInt(BR.readLine());
            }
        }
    }
    int reverse(int number)
    {
        int rev = 0;
        while(number!=0)
        {
            rev = rev*10 +number%10;
            number = number/10;
        }
        return rev;
    }
    void reverseMatrix()
    {
        System.out.println("Input: ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Output: ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                array[i][j] = reverse(array[i][j]);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) throws Exception
    {
        MatrixReverse MRS = new MatrixReverse();
        MRS.input();
        MRS.reverseMatrix();
    }
}
