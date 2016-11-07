

public class StackQueue
{
    
     public static Stack stack2stack(Stack oldS)
    {
       //Initialize the new stack
        Stack s = new Stack(); 
        s = oldS;
        //return the new stack
        return s;
     }
    //queue to stack method "Converts stack to queue"
    public static Queue stack2queue(Stack s)
    {
      //Initialize the new queue
        Queue q = new Queue();
        //While the stack isnt empty enqueue 
        while(!s.isEmpty())
                {
          q.enqueue(s.pop());
                }
        //return the new queue
        return q;
     }
    //queue to stack method "Converts queue to stack"
    public static Stack queue2stack(Queue q)
    {
      //Initialize the new Stack
        Stack s = new Stack();
        //While the queue is not empty push
         while(!q.isEmpty())
         {
           s.push(q.dequeue());
         }
         //return the new stack
        return s;
    }
    
            public static void main(String[] args) 
    {
        
        Queue queue = new Queue();
        System.out.println("This is the Queue\n");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.print();
        
        System.out.println("\n\nDequeue 1 from the queue\n");
        queue.dequeue();
        
        queue.print();
        System.out.println("\n\nPrinting the peek for the Queue");
        System.out.println( "\n"+queue.peek()) ;
        
        
        Stack stack = new Stack();
        System.out.println("\nThis is where the stack begins\n");
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        stack.printBack();
        stack.print();
  System.out.println("Removing the 4 from the list\n");
        stack.pop();
        
        
        
        
        
        stack.print();
        System.out.println("\nThis is the peek of the stack\n");
        System.out.println(stack.peek());
        
        System.out.println("\nNew stack copied over\n");
        Stack s = new Stack();
        s = stack2stack(stack);
        s.print();
        
        System.out.println("\nConverting the stack to a queue\n");
        Queue q = new Queue();
        q = stack2queue(stack);
        q.print();
        
              
        System.out.println("\n\nConverting the original queue to a stack\n");
        Stack oldS = new Stack();
        oldS = queue2stack(queue);
        oldS.print();
        
        
    }   
    
}

