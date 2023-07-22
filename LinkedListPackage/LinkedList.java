package LinkedListPackage;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data){
        //Create New Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //newNode points to head
        newNode.next = head;//Link

        //head = newNode
        head = newNode;
    }
    public void addLast(int data){
        //Create New Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void add_at_index(int data,int index){
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node temp = head;
        size++;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        //now temp is equal to previous
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removefirst()
    {
        if (size == 0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size = size -1;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp = temp.next;
        }
        Node prev = temp;
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size = size -1;
        return val;
    }
    public int itrSearch(int data){
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if(temp.data == data){
                return index;
            }
            temp = temp.next;
            index = index+1;
        }
        return -1;
    }
    public int helper(Node head,int key)
    {
        if(head == null)
            return -1;
        if(head.data == key)
            return 1;
        int index = helper(head.next,key);
        if(index == -1){
            return -1;
        }else
            return 1+index;
    }
    public int recSearch(int key)
    {
        return helper(head,key);
    }
    public void reverse_a_linked_list()
    {
        if(size !=0 && size!= 1)
        {
            Node prev = head;
            Node curr = head.next;
            prev.next = null;
            while(curr.next != null)
            {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            curr.next = prev;
            head = curr;
        }
    }
    public void reverse()
    {
        //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public int find_and_remove_nth_node_from_end(int n)
    {
        int index = 0;
        int size=0;
        int val = Integer.MIN_VALUE;
        Node temp = head;
        while (temp != null)
        {
            temp = temp.next;
            size++;
        }
        if(n == size){
            val = head.data;
            head = head.next; //remove first
            return val;
        }

        //size - n
        Node prev= null;
        Node curr=head;
        while (index <= size-n){
            prev = curr;
            index++;
        }
        val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean check_palindrome(){
        if(head == null || head.next == null)
            return true;
        //find mid node
        Node mid = findMid(head);
        //reverse the second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right_half_head = prev;
        Node left_half_head = head;
        //check if first half = second half
        while (right_half_head.data == left_half_head.data)
        {
            right_half_head = right_half_head.next;
            left_half_head = left_half_head.next;
            if(right_half_head == null || left_half_head == null)
            {
                return true;
            }
        }
        return false;
    }
    public boolean check_if_palindrome(){
        if(head == null || head.next == null)
            return true;
        //find mid node
        Node mid = findMid(head);
        //reverse the second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right_half_head = prev;
        Node left_half_head = head;
        //check if first half = second half
        while (right_half_head != null)
        {
            if (left_half_head.data != right_half_head.data) {
                return false;
            }
            left_half_head = left_half_head.next;
            right_half_head = right_half_head.next;
        }
        return true;
    }
    public static boolean is_loop_present(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;//cycle exists
            }
        }
        return false;//cycle does not exist
    }
    public static void remove_cycle(){
        //detect cycle
        Node slow,fast;
        slow = fast = head;
        boolean cycle = false;
        while(fast != null && fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false)
            return;

        //finding meeting point
        slow = head;
        Node prev = null;
        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //last.next = null
        prev.next = null;
    }

    public Node merge(Node right_head,Node left_head)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (right_head != null && left_head != null)
        {
            if (right_head.data < left_head.data)
            {
                temp.next = right_head;
                right_head = right_head.next;
                temp = temp.next;
            }
            else {
                temp.next = left_head;
                left_head = left_head.next;
                temp = temp.next;
            }
        }
        while (right_head != null)
        {
            temp.next = right_head;
            right_head = right_head.next;
            temp = temp.next;
        }
        while (left_head != null)
        {
            temp.next = left_head;
            left_head = left_head.next;
            temp = temp.next;
        }
//        temp.next = null;
        return mergedLL.next;
    }
    public Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        Node mid = null;
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null)
            mid = prev;
        else
            mid = slow;
        return mid;
    }
    public Node getMid1(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid1(head);
//        System.out.println("Mid data"+mid.data);
//        if (getMid(head) == getMid1(head)){
//            System.out.println("True");
//        }
        Node right_head = mid.next;
        mid.next = null;
        Node left_head = mergeSort(head);
        right_head = mergeSort(right_head);

        return merge(left_head,right_head);
    }
    public Node zig_zag(Node head){
        Node mid = getMid(head);
        Node right_half_head = mid.next;
        mid.next = null;
        Node prev = null;
        Node curr = right_half_head;
        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right_half_tail_now_head = prev;
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        Node left_half_head=head;
        System.out.println(left_half_head.next.data);

        while (left_half_head!=null && right_half_tail_now_head!=null)
        {
            temp.next = left_half_head;
            left_half_head = left_half_head.next;
            temp = temp.next;
            temp.next = right_half_tail_now_head;
            right_half_tail_now_head = right_half_tail_now_head.next;
            temp = temp.next;
        }
        if (left_half_head!=null)
        {
            temp.next = left_half_head;
        }

        return mergedLL.next;
    }
    public void ZigZag()
    {
//        Node mid = getMid(head);
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node right_head = mid.next;
        Node prev = null;
        mid.next = null;
        Node curr = right_head;
        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        while (left != null && right != null)
        {
            Node nextL,nextR;
            nextL = left.next;
            nextR = right.next;
            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        System.out.println(ll.itrSearch(2));
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(1);
//        ll.addLast(2);
//
//        ll.add_at_index(3,2);
//        ll.print();
//        System.out.println(size);
//
//        ll.removefirst();
//        ll.print();
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.itrSearch(4));
//        System.out.println(ll.recSearch(3));
//        System.out.println(ll.recSearch(55));
//        ll.reverse_a_linked_list();
//        ll.print();
//        ll.reverse();
//        ll.print();
//        ll.find_and_remove_nth_node_from_end(3);
//        ll.print();

//        LinkedList ll1 = new LinkedList();
//        ll1.addFirst(2);
//        ll1.addFirst(1);
//        ll1.addLast(2);
//        ll1.addLast(1);
//        ll1.print();
//        System.out.println(ll1.check_if_palindrome());
//        ll1.print();
//
//        head = new Node(1);
//        Node temp = new Node(2);
//
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        if(is_loop_present()){
//            System.out.println("Cycle Present");
//
//        }else{
//            System.out.println("Cycle Not Present");
//        }
//        remove_cycle();
//        if(is_loop_present()){
//            System.out.println("Cycle Present");
//
//        }else{
//            System.out.println("Cycle Not Present");
//        }

        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(6);
        //5->4->3->2->1
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        ll.head = ll.zig_zag(ll.head);
        ll.print();

        ll.ZigZag();
        ll.print();
    }
}
