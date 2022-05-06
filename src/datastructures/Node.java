/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author yusuf
 */
public class Node <T>{
     private T data;
     Node <T> next;
     Node <T> prev;
    public Node (T data , Node<T> next)
    {
    this.data=data;
    this.next = next;
    }
    public Node (T data , Node<T> next , Node<T> prev)
    {
    this.data=data;
    this.next = next;
    this.prev = prev;
    }
    public Node<T> getnext()
    {
    return next;
    }
    public Node <T> getprev()
    {
    return prev;
    }
    public T getdata()
    {
    return data;
    }
    
    
}
