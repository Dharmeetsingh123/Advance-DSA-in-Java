import java.util.*;
public class Stack {


    int top=-1;
    int stack[]=new int[10];
    public void push(int x){
        if (top>=stack.length-1)
        {
            System.out.println("Sorry stack is full....");
           
        }
        else {
            top+=1;
            stack[top]=x;
        }
    }
    public int pop(){
        int x=stack[top];
        top-=1;
        return x;
    }
  void display(){
    if(top==-1){
        System.out.println("nothing to print in stack....");
    }
    else{
    for (int i=0;i<=top;i++)
    {
        System.out.print(stack[i]+" ");
    }
    }
    
  }


    public static void main(String arr[])
    {

        Scanner sc=new Scanner(System.in);
            Stack s1=new Stack();
            int c;
            do{
                System.out.println("Enter your choise : ");
                int choise;
                choise=sc.nextInt();
              switch(choise){
                case 1:
                System.out.println("Enter the element : ");
                int x=sc.nextInt();
                s1.push(x);
                break;
                case 2:
                s1.pop();
                break;
                case 3:
                s1.display();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.print("invalid choise ...please try again");
                break;

              }
              System.out.println("do want to continue so pres 1 ");
                c=sc.nextInt();
            }while(c==1);
            
        }    
    
}
