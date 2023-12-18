import java.util.Scanner;
public class MatrixPattern 
{
    Scanner SC = new Scanner(System.in);
    int a[], b[][], ab[];
    void input()
    {
        System.out.println("Enter the strength of matrix a: ");
        a = new int[SC.nextInt()];
        if(a.length<=2 || a.length>=10)
        {
            System.out.println("Order is Out of Range!");
            return;
        }
        System.out.println("Enter the Elements of matrix a: ");
        for(int i=0; i<a.length; i++)
        {
            a[i] = SC.nextInt();
            if(a[i]<0)
            {
                System.out.println("Invalid Input!");
                return;
            }
        }
        sortMatrix();
    }
    void sortMatrix()
    {
        int temp = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }        
        showPattern();
    }
    void showPattern()
    {
        ab = new int[(a.length)*a.length];
        b = new int[a.length][a.length];
        System.out.println("Output Matrix: ");
        int count = 0, index = 0;
        for(int i=4; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                ab[index] = a[j];
                System.out.print(a[j]+"\t");
                index++;
            }
            for(int k=0; k<count; k++)
            {
                ab[index] = a[k];
                System.out.print(a[k]+"\t");
                index++;
            }
            count++;
            System.out.println();
        }
    }
    void printMatrix()
    {
        System.out.println("Matrix b[][]: ");
        int count = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                b[i][j] = ab[count];
                count++;
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])    
    {
        MatrixPattern MPT = new MatrixPattern();
        MPT.input();
        MPT.printMatrix();
    }
}