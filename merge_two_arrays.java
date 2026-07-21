public class merge_two_arrays {
    public static void main(String[]args){
        //list1 = 1->2->3
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);

        //List2 = 1->3->4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        //create obj
        merge_two_arrays solution =  new merge_two_arrays();
        solution.mergetwoarr(list1, list2);


    }
    public ListNode mergetwoarr (ListNode list1, ListNode list2){
        ListNode converted = new ListNode();
        ListNode placeHolder = converted;

        //as long as list1 or 2 is not empty the programm will keep running
        while (list1 != null && list2 != null){

        }
        return null;
    }   
}

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}