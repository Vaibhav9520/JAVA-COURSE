public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty!!!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;

        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
//***************************Merge Sort**************************************
private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow; //mid mode
}
private Node merge(Node head1 , Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while(head1 !=null && head2 !=null){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        temp = temp.next;
    }
    while(head1 != null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }
    while(head2 != null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return mergedLL.next;
}
public Node merseSort(Node head){
    if(head == null || head.next ==null){
        return head;

}
    
    // find mid
    Node mid = getMid(head);

    //Left  && right MS

    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = merseSort(head);
    Node newRight = merseSort(rightHead);
    //Merge
    return merge(newLeft, newRight);
}




    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
        ll.head = ll.merseSort(ll.head);
        ll.print();
       
       











    }
}
