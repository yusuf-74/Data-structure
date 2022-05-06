/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author yusuf
 */
public class myqueue <T> {
    private int size;
    Node <T> front ;
    Node <T> back;
    public myqueue()
    {
    this.size = 0;
    this.front = null;
    this.back = null;
    }
    public void push(T val)
    {
        
    Node <T> node = new Node<T>(val , null);
    if (size == 0)
    {
    front = back = node;
    
    size++;
    }
    else 
    {
    back.next = node;
    back = node;
    size++;
    }
    
    }
    public T pop()
    {
    Node <T> oldfront = front;
    front = front.next;
    size--;
    return oldfront.getdata();
    }
    public boolean isEmpty()
    {
    if(size == 0)
        return true;
    else 
        return false;
    }
    public T front ()
    {
     return front.getdata();
    }
    
}
