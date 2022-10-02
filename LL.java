public class LL{
    private int size;
    LL(){this.size=0;}
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;

    public  void Addfirst(String data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void Addlast(String data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currnode = head;
        while(currnode!=null){
            System.out.print(currnode.data+"->");
            currnode = currnode.next;
        }
        System.out.print("null");
        System.out.println("");
    }
    public void Deletefirst(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;

    }
    public void Deletelast(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node lastnode = head.next;
        Node secondlast = head;
        while(lastnode.next!=null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
    }
    public int getsize(){
        return size;
    }
    public static void main(String args[]){
        LL list = new LL();
        list.Addfirst("this");
        list.Addfirst("hi");
        list.Addlast("is saradhi");
        list.printlist();
       System.out.println(list.getsize());
        list.Deletelast();
        list.Deletelast();
        list.printlist();
       System.out.println(list.getsize());
        list.Deletefirst();
        list.printlist();
        System.out.println(list.getsize());
    }
}