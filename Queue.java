import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Queue {
    int front=-1;
    int rear=-1;
    int queue[]=new int[10];
    void enqueue(int x){
        if(front==-1&&rear==-1){
            front=0;
            rear=0;
            queue[front]=x;
        }
        if(front==queue.length-1){
            System.out.println("queue is over flow....");
        }
        else{
            queue[++front]=x;
        }
    }

     int dequeue(){

        if(front==-1&&rear==-1){
            System.out.println("nothing to print...");
        }
        else{
            System.out.print(queue[rear]);
            
            rear=rear+1;
        }

        return 0;

    }

    public void display(){
        int temp=rear;
        for (int i=temp;i<=front;i++){
            System.out.print(queue[i]+" ");
        }
    }

    public static void main(String arr[]){
        Queue  q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
         q.enqueue(10);
        q.enqueue(20);
         q.enqueue(10);
        q.enqueue(20);
        q.enqueue(20);
         q.enqueue(10);
        
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println();
                q.display();
    }
    
}
