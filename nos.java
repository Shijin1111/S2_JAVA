import java.util.Scanner;
class nos
{
    int size;
    int[] numbers;
    public static void main(String[] args)
    {
        int size=5,sum=0;
        int[] numbers = new int[size];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            numbers[i] = sc.nextInt();
            try
            {
                if(numbers[i]<0)
                {
                    i--;
                    throw new neg("number must be above zero");
                }
                else
                {
                    sum = sum + numbers[i];
                }
            }
            catch(neg e)
            {
                System.out.println(e.getMessage());
            }
        }
    
        System.out.println("sum="+sum);         
    }

}
class neg extends RuntimeException
{
    neg(String s)
    {
        super(s);
    }
}