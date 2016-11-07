
public class Queue 
{
    Node head;
    Node cur;
    Node temp;     
    
    
    public boolean isEmpty()
    {
        return this.head == null;
    }
    
    public void enqueue(int lol)
    {
        Node node1 = new Node(lol);
       
       
         if(this.isEmpty())     
       {
          this.head = node1;      
       } 
        else                       
       {
           cur = this.head;
           
           while(cur.next != null)           
          {
               cur = cur.next;
    
          }
           cur.next = node1;
           node1.next = null;
       }
    }
    
    public void dequeue()
     {      
         this.head = head.next;   
     }
    
    public int peek()
    {
        return this.head.lol; 
    }
    
    public void print()
    { 
       cur = this.head;
        while(cur != null)
        {     
            System.out.print(cur.lol);
            cur = cur.next;
        } 
    }
}
