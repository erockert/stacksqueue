

public class StackQueue
{
    
     public static Stack stack2stack(Stack oldStack)
    {
        Stack newStack = new Stack();
        newStack = oldStack;
        
        return newStack;
     }
    
   /*  public static Queue stack2queue(Stack oldStack)
    {
        Queue newQueue = new Queue();
        newQueue = Queue;
        
        return newQueue;
     }*/
    
            public static void main(String[] args) 
    {
        
        Queue queue = new Queue();
        System.out.println("This is the Queue");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        

        queue.print();
        
        queue.dequeue();
        
        queue.print();
        
        System.out.println( queue.peek()) ;
        
        
        Stack stack = new Stack();
        System.out.println("");
        System.out.println("This is where the stack begins");
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        stack.printBack();
        stack.print();
  System.out.println("Removing the 4 from the list");
        stack.pop();
        
        
        
        
        
        stack.print();

        System.out.println(stack.peek());
        
        System.out.println("New stack copied over");
        Stack newStack = new Stack();
        newStack = stack2stack(stack);
        newStack.print();
        
    }   
    
}

