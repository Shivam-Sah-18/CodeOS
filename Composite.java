public class Composite 
{
    int arr[][], m, n;
    Composite(int mm, int nn)    
    {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    int isComposite(int p)
    {
        for(int i=2; i<=p/2; i++)
        {
            if(p%i==0)
            return 1;
        }
        return 0;
    }
    void fill()
    {
        int count = 1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                while(isComposite(count)!=1) count++;
                arr[j][i] = count;
                count++;
            }
        }
    }
    void display()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Composite CMP = new Composite(3, 4);    
        CMP.fill();
        CMP.display();
    }
}