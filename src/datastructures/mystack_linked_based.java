/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author yusuf
 */

public class mystack_linked_based <T>{
    int size;
    Node <T> top;
    public mystack_linked_based ()
    {
    size = 0;
    top = null;
    }
    public void push (T newValue)
    {
    Node <T> node = new Node<T>(newValue , top);
    top = node;
    size++;
    }
    public T pop ()
    {
        Node<T> oldTop = top;
    if (top == null)
        return null;
    top = top.getnext();
    size--;
    return oldTop.getdata();
    
    }
    public T top()
    {
    return top.getdata();
    }
    public boolean isEmpty ()
    {
    if (size != 0)
        return false;
    else 
        return true;
    }
    
    
}
