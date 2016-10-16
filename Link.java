class LinkedList
{
  public int a;
  public double b;
  LinkedList next;

  public LinkedList(int x, double y)
  {
    a = x;
    b = y;
  }

  public void display()
  {
    System.out.println(a);
  }
}

public class Link
{

LinkedList first = null;
LinkedList current;

  public void insertFirst(int x, double y)
  {
    LinkedList newLink = new LinkedList(x,y);
    newLink.next = first;
    first = newLink;
  }

  public void displayList()
  {
    current = first;
    while(current != null)
    {
      current.display();
      current = current.next;

    }
  }
  public void find(int x)
  {
    current = first;
    while(current != null)
    {
      if(current.a==x)
      {
        current.display();
        break;
      }
      else{
        current = current.next;
      }
    }
    System.out.println("Its working");
  }

  public void delete(int x)
  {
    LinkedList temp;
    while(first != null)
    {
      if(first.a==x)
      {
        temp = first;
        first = first.next;
        first.display();
        break;
      }
      else
      {
        first = first.next;
      }
    }
    System.out.println("Delete is working");
  }

  public static void main(String args[])
  {
    Link obj = new Link();
    obj.insertFirst(3, 7.8);
    obj.insertFirst(4, 6.8);
    obj.insertFirst(5, 9.8);
    obj.insertFirst(6, 5.8);
    obj.insertFirst(7, 4.8);
    obj.insertFirst(8, 3.8);
    obj.displayList();
    obj.find(4);
    obj.delete(4);
    obj.displayList();

  }
}
