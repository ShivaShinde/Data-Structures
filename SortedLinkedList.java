class SortLink
{
  int i;
  double d;
  SortLink next;
  public SortLink(int d)
  {
  i=d;
  }
  public void display()
  {
    System.out.println(i);
  }
}


class SortedLinkList
{
  SortLink first=null;
  public void insertFirst(int key)
  {
    SortLink newLink = new SortLink(key);
    SortLink current = first;
    SortLink previous = null;
    while(current != null && key>current.i)
    {
        previous = current;
        current = current.next;
    }
    if(previous==null)
      first = newLink;
    else
      previous.next = newLink;
    newLink.next = current;

  }

  public void displayAll()
  {
    SortLink current;
    current = first;
    while(current!=null)
    {
      current.display();
      current = current.next;
    }
  }
}


class SortedLinkedList
{
  public static void main(String args[])
  {
    SortedLinkList obj = new SortedLinkList();
    obj.insertFirst(56);
    obj.insertFirst(2);
    obj.insertFirst(96);
    obj.displayAll();
  }
}
