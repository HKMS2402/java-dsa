public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public Node getHead(){
        return this.head;
    }

    public void setHead(Node n){
        this.head = n;
    }
    public boolean search(int data){
        boolean flag = false;
        return  flag;
    }

//    public void insertAtHead(int data){
//
//    }
//
//    public void insertAfter(int existingData, int newData){
//
//    }
//
//    public void insertAtEnd(int existingData, int newData){
//
//    }

    public void insert(int data){
            Node newNode =  new Node(data);
            if(this.head == null){
                this.head =newNode;
            }
            else{
                Node temp =this.head;

                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
    }


    public void delete(int data){

    }

    public String toString(){
        String result = "";

        Node temp = this.head;
        while(temp!=null){

            result+=temp.data+" ";
            temp = temp.next;
        }
        return result;
    }
}
