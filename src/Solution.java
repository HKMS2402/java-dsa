public class Solution {
    public static  void  main(String args[]){
        LinkedList list = new LinkedList();


        //Create a linked list of integer for numbers 1 to 10
        for(int i = 1;i<=10;i++){

            list.insert(i);
        }

        System.out.println(list.toString());

    }
}
