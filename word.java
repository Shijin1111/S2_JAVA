import java.util.Scanner;

class word
{
    String s;
    word()
    {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }
    void string_manipulation()
    {
        System.out.println("Lower case: "+ s.toLowerCase());
        System.out.println("upper case: "+s.toUpperCase());
        System.out.println("length : "+s.length());
         System.out.println("substring(2): "+s.substring(2));
 System.out.println("substring(2,6): "+s.substring(2,6));
 System.out.println("trim: "+s.trim());
 System.out.println("indexOf('o'): "+s.indexOf('o'));
 System.out.println("indexOf('o',10): "+s.indexOf('o',10));
 System.out.println("concat('hello'): "+s.concat("hello"));
    }
    public static void main(String[] args)
    {
        word w = new word();
        w.string_manipulation();
    }
}