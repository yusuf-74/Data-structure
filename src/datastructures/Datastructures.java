
package datastructures;

/**
 *
 * @author yusuf
 */
public class Datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mystack_Array_based stack = new mystack_Array_based(5);
        mystack_linked_based <String> st = new mystack_linked_based();
        myqueue <String> q = new myqueue();
        my_doubly_linked_list <Integer> l = new my_doubly_linked_list();
        l.append_back(1);
        l.append_back(2);
        l.append_front(3);
        l.append_back(4);
        l.append_front(5);
        l.append_back(6);
        l.traverse();
        l.append_back(1);
        l.append_back(2);
        l.append_front(3);
        l.append_back(4);
        l.append_front(5);
        l.append_back(6);
        l.traverse();
        l.remove(5);
        l.remove(1);
        l.remove(5);
        l.remove(1);
        l.traverse();
       
        st.push("yusuf");
        st.push("mohammed");
        st.push("ahmed");
        st.push("abdelrahman");
        st.push("ashour");
        st.push("yusuf");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");
        System.out.println("");
        /*System.out.print(st.pop() + " ");
        System.out.print(st.pop() + " ");*/
        
         q.push("yusuf");
        q.push("ashour");
        q.push("abdelrahman");
        q.push("ahmed");
        q.push("mohammed");
        q.push("yusuf");
        System.out.print(q.pop() + " ");
        System.out.print(q.pop() + " ");
        System.out.print(q.pop() + " ");
        System.out.print(q.pop() + " ");
        System.out.print(q.pop() + " ");
        System.out.print(q.pop() + " ");
        System.out.println("");
    }
    
}
