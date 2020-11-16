package B10_DSA.Exercise.LinkedList;

public class LinkedList<E> {
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    // phan tu dau tien cua danh sach lien ket
    private Node head;
    // So luong phan tu trong danh sach
    private int numNode = 0;

    public LinkedList(){

    }
    public void addFirst(E element){
        // khai bao 1 bien la temp tro den gia tri cua head
        Node temp= head;
        // Bien head se nhan gia tri la mot bien Node moi
        head = new Node(element);
        // head.next tro den temp
        head.next = temp;
        numNode++;
    }
    public void addLast(E element){
        // khai bao bien temp tro den head
        Node temp = head;
        // Se cho con tro chay den node cuoi cung cua danh sach
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }
    public void add (int index,E element){
        // Khai bao bien temp tro ve head
        Node temp = head;

        // Khai bao 1 node la holder
        Node holder;
        // cho con tro chi den vi tri index -1
        for(int i =0; i< index -1 && temp.next!= null;i++){
            temp = temp.next;
        }
        // cho holder den vi tri index
        holder = temp.next;
        // node tai vi tri index -1 se tro toi node moi
        temp.next = new Node(element);
        // node moi se tro toi vi tri holder
        temp.next.next = holder;
        // tang so luong phan tu len 1
        numNode++;
    }
    public Object get(int index){
        // khai bao bien temp tro toi head
        Node temp = head;
        for(int i = 0; i <index ; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public int size(){
        return numNode;
    }
    public E remove(int index){
        if(index < 0 || index> numNode){
            throw new IllegalArgumentException("error index: "+ index);
        }
        // khai bao bien temp tro den head
        Node temp = head;
        Object data;

        // Neu index = 0 thi se tra ve data hien tai
        if (index == 0){
            data = temp.data;
            head = head.next;
            numNode--;
        }else {
            for (int i = 0; i <index -1 && temp.next != null; i++){
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNode--;
        }
        return (E) data;
    }
    public boolean remove(E element){
        // remove doi tuong neu element la head
        if(head.data.equals(element)){
            remove(0);
            return true;
        }else {
            // khai bao 1 nnode tro den head
            Node temp = head;
            while(temp.next != null){
                // neu nhu ton tia 1 phan tu co data truyen vao thi se bi remove
                if(temp.next.data.equals((element))){
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
            }
        }
    return false;
    }
    public LinkedList<E> clone(){
        // kiem tra linkedlist co phan tu hay khong
        if(numNode == 0){
            throw new NullPointerException("Linkedlist nay null");
        }
        // khai vao linked list tra ve
        LinkedList<E> returnLinkedList = new LinkedList<>();
        // khai bao 1 temp tro dan toi head
        Node temp = head;
        // add temp vao dau danh sach tra ve de no lam head
        returnLinkedList.addFirst((E) temp);
        temp = temp.next;
        while (temp != null){
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }
}
