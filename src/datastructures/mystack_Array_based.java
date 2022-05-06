package datastructures;

/**
 *
 * @author yusuf ashour
 */
public class mystack_Array_based  {
    private int stack_size ;
    private int top = 0 ;
    private int [] stack ;
    Exception e;
    public mystack_Array_based(int stack_size)
    {
       this.stack_size = stack_size;
       this.stack = new int [stack_size];
    }
    void push (int number)
    {
    if (this.top >= this.stack_size)
    {
        System.out.println("stack is full");
    }
    else 
    {
    this.stack[top] = number;
    top++;
    }
    }
    public boolean isEmpty ()
    {
      if (top == 0)
          return true;
      else 
          return false;
    }
            
    void disply ()
    {
    if (this.isEmpty())
            System.out.println("empty!");
    else 
    {
    for (int i = 0 ; i < this.top ; i++)
    {
        System.out.println("index "+i+" is : "+this.stack[i]);
    }
    }
    }
    int pop ()
    {
       try{
    return this.stack[--top];
       }
       catch (Exception e)
       {
           System.out.print("out of bounds ");
       }
        
        return 0;
        
    }
    
    
    
    
}
