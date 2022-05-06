/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author yusuf
 */
public class my_doubly_linked_list <T> {
    private int size ;
    Node <T> head;
    Node <T> tail;
    public my_doubly_linked_list()
    {
    size = 0;
    head = null;
    tail = null;
    }
    public void append_front (T val)
    {
        Node <T> node = new Node <T>(val , null , null);
    if (size == 0 )
    {
    head = tail =node;
    size++;
    }
    else 
    {
    head.next = node;
    node.prev = head;
    head = node;
    size++;
    }
    }
     public void append_back (T val)
    {
        Node <T> node = new Node <T>(val , null , null);
    if (size == 0 )
    {
    head = tail =node;
    size++;
    }
    else 
    {
    tail.prev = node;
    node.next = head;
    tail = node;
    size++;
    }
    }
     public void traverse ()
     {
         Node <T> temphead = new Node<T>(head.getdata() , head.getnext() , head.getprev());
     while (temphead != null)
     {
         System.out.print(temphead.getdata() + " ");
         temphead = temphead.prev;
     }
         System.out.println("");
     }
     public void remove(T key)
     {
      Node <T> temphead = head;
      Node <T> tempprev = null;
      if (temphead != null && temphead.getdata() == key)
      {
      head = temphead.prev;
      return;
      }
      else
      {
      while (temphead != null && temphead.getdata() != key)
      {
       tempprev = temphead;
       temphead = temphead.prev;
      }
      if (temphead == null)
          return;
      else 
      {
      tempprev.prev = temphead.prev;
      }
      }
     }
    
}
