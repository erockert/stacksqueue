
public class Stack
{
    Node head;
    Node cur;
    Node temp;
    
    public boolean isEmpty()
    {
        return this.head == null;
    }

    public void push(int lol)
    {
       Node node1 = new Node(lol);
       
       
         if(this.isEmpty())         //checks if list is empty and if it is, starts assinging at head
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
   
    public void printBack()
    {
        cur = null;
        temp = head;
        
       while(temp != null)
        {     
           Node next = temp.next;
           temp.next = cur;
           cur = temp;
           temp = next;  
        }
        head = cur;
       
    }

    public void pop()
     {
         head = head.next;     
     }

    public int peek()
    {
        return head.lol;
    }

    public void print()
    {
        
       cur = this.head;
        while(cur != null)
        {     
            System.out.println( cur.lol + "\n-");
            cur = cur.next;
        } 
    }
}
