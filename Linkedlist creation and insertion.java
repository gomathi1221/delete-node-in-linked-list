class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
}
class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        
    }
}