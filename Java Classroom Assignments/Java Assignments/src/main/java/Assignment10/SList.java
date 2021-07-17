package Assignment10;

public class SList<T>
{
    Node head;
     public SListIterator<T> iterator()
    {
SListIterator<T> listIterator=new SListIterator<T>(head);
return listIterator;
    }
    public String toString()
    {
        if(head==null)
        {
            return"";
        }
SListIterator<T> sli= iterator();
        String result="";
while(sli.hasNext())
{
    result+= sli.currentNode.data;
    sli.next();
}
return result;
    }

    public static void main(String[] args)
    {
        SList<Integer> sl = new SList<Integer>();
        SListIterator<Integer> slIter = sl.iterator();
        slIter.insert(12);
        slIter.insert(21);
        slIter.insert(34);
        slIter.insert(35);
        slIter.insert(44);
        System.out.println(sl);

        SListIterator<Integer> slIter2 = sl.iterator();
        slIter2.remove(35);
        System.out.println(sl);
        SListIterator<Integer> slIter3 = sl.iterator();
        slIter3.remove(44);
        System.out.println(sl);
    }

}
class Node<T>
{
Node next;
T data;
Node(T data,Node n)
{
    this.data=data;
    next=n;
}
}

class SListIterator<T>
{ Node currentNode;
    SListIterator(Node h)
    {
    currentNode=h;
    }
        public boolean hasNext()
        {
           return currentNode.next!=null;
        }
        public Node<T> next()
        {
            currentNode=currentNode.next;
            return currentNode;
        }
    public void insert(T e)
    {
        currentNode.next=new Node<T>(e,currentNode.next);
        currentNode=currentNode.next;
    }
    public void remove(T data)
    {
        Node<T> temp1=currentNode;
        Node<T> temp2;
        if(currentNode.data==data)
        {
            currentNode=currentNode.next;
            return;
        }
        while(currentNode.next!=null)
        {
            temp2=currentNode;
            currentNode=currentNode.next;
            if(currentNode.data==data)
            {
                temp2.next=currentNode.next;
               // currentNode=temp2.next;
                currentNode=temp1;
                break;
            }

        }
    }

    }


