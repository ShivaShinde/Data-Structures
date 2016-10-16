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
Link1 first=null;
Link1 last=null;
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
class LinkList1
{
  public static void main(String args[])
  {
    LinkedList1 obj = new LinkedList1();
    obj.insertFirst(2, 2.2);
    obj.insertFirst(3, 3.3);
    obj.insertFirst(4, 4.4);
    obj.insertFirst(5, 5.5);
    obj.insertLast(6, 6.6);
    obj.insertLast(7, 7.7);
    obj.insertLast(8, 8.8);
    obj.insertLast(9, 9.9);
    obj.insertLast(10, 10.10);
    obj.displayAll();
    Link1 dummy = obj.deleteFirst();
    dummy.displayLink();
    Link1 dummy1 = obj.deleteLast();
    dummy1.displayLink();



  }

}
