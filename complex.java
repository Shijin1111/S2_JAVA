public class complex
{
    int real;
    int img;
    public complex(int r,int i)
    {
        this.real=r;
        this.img=i;
    }
    public static complex complex_sum(complex c1,complex c2)
    {
        complex temp=new complex(0,0);
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        return temp;
    }
    public static void main(String args[])
    {
        complex x=new complex(2,5);
        complex y=new complex(4,8);
        complex temp=complex_sum(x,y);
        System.out.println("sum="+temp.real+"+"+temp.img+"i");
    }
}