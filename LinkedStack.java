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
    Link1 last=null;
    Link1 first=null;

    public void insertFirst(int x, double y)
      {
        Link1 newLink = new Link1(x,y);
        if(first==null)
          last = newLink;
        newLink.next = first;
        first = newLink;
      }

    public void insertLast(int x, double y)
      {
        Link1 newLink = new Link1(x,y);
        if(first==null)
          first = newLink;
        last.next = newLink;
        last = newLink;
      }

    public Link1 deleteFirst()
      {
        Link1 current=null;
        current = first;
        first = first.next;
        return current;
      }

    public Link1 deleteLast()
      {
        Link1 temp=null;
        temp = last;
        last = last.next;
        return temp;
      }

    public boolean isEmpty()
      {
        return first == null;
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

class LinkStack
{
    LinkedList1 stack = new LinkedList1();

    public void push(int i, double d)
      {
        stack.insertFirst(i,d);
      }

    public Link1 pop()
      {
        return stack.deleteFirst();
      }

    public boolean empty()
      {
        return stack.isEmpty();
      }

    public void displayStack()
      {
        stack.displayAll();
      }
}

class LinkedStack
{

      public static void main(String args[])
      {
        LinkStack obj = new LinkStack();
        obj.push(1, 1.1);
        obj.push(2, 2.2);
        obj.push(3, 3.3);
        obj.push(4, 4.4);
        obj.displayStack();

        Link1 temp1 = obj.pop();
        temp1.displayLink();
        System.out.println("This is the stack after deletion");
        obj.displayStack();
      }

}
