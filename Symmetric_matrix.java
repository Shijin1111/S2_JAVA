import java.util.Scanner;
public class Symmetric_matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns of the matrices");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] m1 = new int[rows][cols];
        
        boolean flag = true;
        if (rows!=cols)
            flag=false;
        else
        {
            System.out.println("Enter the elements of the first matrix:");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    m1[i][j] = sc.nextInt();
                }
            }
        
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(m1[i][j]!=m1[j][i])
                        flag = false;
                        break;
                }
            }
        }
        if(flag==false)
            System.out.println("matrix is nonsymmetric");
        else
            System.out.println("matrix is symmetric");
    }    
    
}


