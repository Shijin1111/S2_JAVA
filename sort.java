import java.util.Scanner;
class sort
{
    int size;
    String arr[];
    sort()
    {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr=new String[size];
        System.out.println("enter the elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.next();
        }
    }
    void sort_array()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void dis()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        sort s = new sort();
        System.out.println("array before sort");
        s.dis();
        s.sort_array();
        System.out.println("array after sort");
        s.dis();
    }
}