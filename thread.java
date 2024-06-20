class multiple extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("5*"+i+"="+(5*i));
        }
    }
}
class prime extends Thread
{
    public void run()
    {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            int temp = 0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    temp = 1;
                }
            }
            if(temp==0)
            {
                System.out.println(i);
            }
        }
    }
}
class thread
{
    public static void main(String[] args){
        multiple m = new multiple();
        prime p = new prime();
        m.start();
        p.start();
    }
}