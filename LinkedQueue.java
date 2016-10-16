class Link1
{
    public Link1 next;
    private int i;
    private double d;

    public Link1(int x,double y)
      {
        i=x;
        d=y;
      }

    public void displayLink()
      {
        System.out.println(d);
      }

}

class LinkedList1
{
    Link1 last;
    Link1 first;


    public LinkedList1()
    {
      last = null;
      first = null;
    }


    public void insertLast(int x, double y)
      {
        Link1 newLink = new Link1(x,y);
        if(last==null)
          {
          last = newLink;
          first = newLink;
          }
        else
          {
        last.next = newLink;
        last = newLink;
          }
      }

      public Link1 deleteFirst()
      {
        Link1 current=null;
        current = first;
        first = first.next;
        return current;
      }

    public boolean isEmpty()
      {
        return last == null;
      }

    public void displayAll()
      {
        Link1 current;
        current = first;
        while (current!=null)
          {
            current.displayLink();
            current=current.next;
          }
      }
}

class LinkQueue
{
    LinkedList1 queue = new LinkedList1();

    public void insertQueue(int i, double d)
      {
        queue.insertLast(i,d);
      }

    public Link1 removeQueue()
      {
        return queue.deleteFirst();
      }

    public boolean empty()
      {
        return queue.isEmpty();
      }

    public void displayQueue()
      {
        queue.displayAll();
      }
}

class LinkedQueue
{

      public static void main(String args[])
      {
        LinkQueue obj = new LinkQueue();
        obj.insertQueue(1, 1.1);
        obj.insertQueue(2, 2.2);
        obj.insertQueue(3, 3.3);
        obj.insertQueue(4, 4.4);
        obj.displayQueue();

        Link1 temp1 = obj.removeQueue();
        temp1.displayLink();
        System.out.println("This is the stack after deletion");
        obj.displayQueue();
      }

}
