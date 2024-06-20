import java.util.*;
class stack<t>
{
    ArrayList<t> A;
    int top = -1;
    int size;
    stack(int size)
    {
        this.size = size;
        this.A = new ArrayList<t>(size);
    }
    void push(t x)
    {
        if((top+1)==size)
        {
            System.out.println("overflow");
        }
        else{
            top = top + 1;
            if(A.size()>top)
            {
                A.set(top,x);
            }
            else
            {
                A.add(x);
            }
        }
    }
    t top()
    {
        if(top==-1)
        {
            System.out.println("underflow");
            return null;
        }
        else
            return A.get(top);
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            top = top -1;
        }
    }
}
public class genericstack
{
    public static void main(String[] args)
    {
        stack<Integer> s = new stack<> (5);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int x = sc.nextInt();
            s.push(x);
        }
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.get(3));
        System.out.print(s.get(4));
    }
}