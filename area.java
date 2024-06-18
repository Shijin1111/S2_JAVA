import java.util.Scanner;
class area{
    void areafn(int a,int b)
    {
        System.out.println("area of the rectangle"+(a*b));
    }
    void areafn(int a)
    {
        System.out.println("area of the circle"+(3.14*a*a));
    }
    void areafn(float a)
    {
        System.out.println("area of the square"+(a*a));
    }
    public static void main(String[] args)
    {
        System.out.println("enter the sides of the rectangle");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        area a = new area();
        a.areafn(l,b);
        System.out.println("enter the radius of the circle");
        int r = sc.nextInt();
        a.areafn(r);
        System.out.println("enter the side of the square");
        float s = sc.nextFloat();
        a.areafn(s);



    }
}