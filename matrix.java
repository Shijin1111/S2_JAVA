import java.util.Scanner;
public class matrix{
    Scanner sc=new Scanner(System.in);
    int n,m;
    matrix()
    {
        System.out.println("enter the size of the matrix");
        n=sc.nextInt();
        m=sc.nextInt();
        matrix=new int[n][m];
        System.out.println("Enter value of matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[n][m]=sc.nextInt();
            }
        }
    }
    void sum(matrix x,matrix y)
    {
        if(x.n!=y.n || x.m!=y.m)
        {
            System.out.println("Addition not possible ");
        }
        else{
            int temp=new int[x.n][x.m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    temp[i][j]=x[i][j]+y[i][j];
                }
            }
        }
    }
    void display(int matrix[][])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        addmatrix a=new addmatrix();
        addmatrix b=new addmatrix();
        a.add(b);
    }
}