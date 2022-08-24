public class Solution {
    public static  void  main(String args[]){
        LinkedList list = new LinkedList();


        //Create a linked list of integer for numbers 1 to 10
        for(int i = 1;i<=5;i++){

            list.insert(i);
        }



        Node head = list.getHead();
        //Reversing the linked list

//        1   ->  2   ->  3   ->  4   ->  5

        Node temp1 = head.next;
        Node temp2 = temp1.next;
        System.out.println(list.toString());
        while(temp1!=null || temp2!=null){
            temp1.next = null;
            list.getHead().next = null;
            temp1.next = head;
            list.setHead(temp1);
            temp1 = temp2;
            if(temp2!=null){
                temp2 = temp2.next;
            }

        }

        System.out.println(list.toString());


    }
}
