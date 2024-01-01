import java.util.Scanner;
public class MatrixCreation 
{
    int N;
    char ch1, ch2, ch3;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strength of Matrix: ");
        N = sc.nextInt();
        if(N<=3 || N>=10)
        {
            System.out.println("Size Out of Range. Invalid Input!");
            sc.close(); return;
        }
        System.out.println("First Character: ");
        ch1 = sc.next().charAt(0);
        System.out.println("Second Character: ");
        ch2 = sc.next().charAt(0);
        System.out.println("Third Character: ");
        ch3 = sc.next().charAt(0);
        sc.close();
        displayMatrix();
    }
    void displayMatrix()
    {
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                if(i==0 || j==0 || i==(N-1) || j==(N-1))
                {
                    if(i==j && (i==0 || j==(N-1)))
                    System.out.print(ch1+"\t");
                    else if((i+j)==(N-1) && (i==0 || i==(N-1)))
                    System.out.print(ch1+"\t");
                    else System.out.print(ch2+"\t");
                }
                else System.out.print(ch3+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])    
    {
        MatrixCreation MCT = new MatrixCreation();
        MCT.input();
    }
}
