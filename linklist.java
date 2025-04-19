class node{

    public int data;
    public node next;
    public node previous;

public node(int data){
    this.data = data;
    this.next = null;
    this.previous = previous;

    }
}
class linklist{
    node head;
    public void insert(int x){
        node newNode = new node(x);
        if(head == null){
            head = newNode;
            return;
        }
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void delete() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;

            temp.previous.next = null;
            temp.previous = null;
        }
    }
    public void print(){
        node temp = head;
        while (temp != null){
            System.out.print("" + temp.data);
            temp = temp.next;
        }

    }

    public boolean search(int x) {
        node temp = head;
        while (temp != null) {
            if (temp.data == x)
                return true;
            temp = temp.next;
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        linklist l = new linklist();

        l.insert(10);
        l.insert(20);
        l.insert(30);

        l.print();
        System.out.print("\n");
        boolean found = l.search(40);
        System.out.println("Tìm 10 trong danh sách: " + (found ? "Tìm thấy" : "Không tìm thấy"));

        l.delete();
    }
}
