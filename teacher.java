import java.util.Scanner;
class emp
{
    int empid;
    String name;
    int salary;
    String address;
    emp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        empid = sc.nextInt();
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter salary");
        salary = sc.nextInt();
        System.out.println("enter address");
        address = sc.next();

    }
}
public class teacher extends emp
{
    String dept;
    String subject;
    teacher()
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dept");
        dept = sc.next();
        System.out.println("enter subject");
        subject = sc.next();
    }
    public static void main(String[] args)
    {
        teacher t[] = new teacher[3];
        for(int i=0;i<2;i++)
            t[i] = new teacher();  
          
    }

}