class Link
{
  public int i;
  public Link next;
  public Link previous;
  public Link(int x)
  {
    i=x;
  }
  public void display()
  {
    System.out.println(i);
  }

}

class DoubleLinked
{
  Link first;
  Link last;
  public DoubleLinked()
  {
    first = null;
    last = null;
  }

  public boolean isEmpty()
  {
      return first==null;
  }

  public void insertFirst(int x)
  {
    Link newLink = new Link(x);
    if(isEmpty())
      last = newLink;
    else
      first.previous = newLink;
    newLink.next = first;
    first = newLink;
  }

  public void insertLast(int x)
  {
    Link newLink = new Link(x);
    if(isEmpty())
      first = newLink;
    else
    {
      newLink.previous = last;
      last.next = newLink;
    }
    last = newLink;
  }

  public Link deleteFirst()
  {
    Link temp = first;
    if(first.next == null)
      last = null;
    else
      first.next.previous = null;
    first = first.next;
    return temp;
  }

  public Link deleteLast()
  {
    Link temp1 = last;
    if(last.previous == null)
      first = null;
    else
      last.previous.next = null;
    last = first.previous;
    return temp1;
  }

  public void displayForward()
  {
    Link current1 = first;
    System.out.println("This will print from forward");
    while(current1 != null)
    {
      current1.display();
      current1 = current1.next;
    }
  }

  public void displayBackward()
  {
    Link current2 = last;
    System.out.println("This is print from backwards");
    while(current2 != null)
    {
      current2.display();
      current2 = current2.previous;
    }
  }

  public boolean insertAfter(int key, int i)
  {
    Link current3 = first;
    while(current3.i != key)
    {
      current3 = current3.next;
      if(current3==null)
        return false;
    }
    Link newLink = new Link(i);
    if(current3==last)
    {
      newLink.next = null;
      last = newLink;
    }
    else
    {
      newLink.next = current3.next;
      current3.next.previous = newLink;
    }
    newLink.previous = current3;
    current3.next = newLink;
  return true;
  }

}

class DoubleLinkedList
{
  public static void main(String[] args)
  {
    DoubleLinked obj = new DoubleLinked();
    obj.insertFirst(22);
    obj.insertFirst(23);
    obj.insertFirst(24);

    obj.insertLast(55);
    obj.insertLast(45);
    obj.insertLast(65);

    obj.displayForward();
    obj.displayBackward();

    obj.deleteFirst();
    obj.deleteLast();

    obj.displayForward();
    obj.displayBackward();

  }
}
