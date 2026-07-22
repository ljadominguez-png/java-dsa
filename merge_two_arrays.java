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
       // System.out.println(solution.mergetwoarr(list1, list2));
        ListNode result = solution.mergetwoarr(list1, list2);
        while (result != null){
            System.err.print(result.data + " -> ");
            result = result.next;
        }
        System.out.print("null");

    }
    public ListNode mergetwoarr (ListNode list1, ListNode list2){
        ListNode converted = new ListNode();
        ListNode placeHolder = converted;

        //as long as list1 or 2 is not empty the programm will keep running
        while (list1 != null && list2 != null){
            //compare the values 
            if(list1.data < list2.data){
                placeHolder.next = list1;
                list1 = list1.next;
            }else{
                placeHolder.next = list2;
                list2 = list2.next;
            }
            placeHolder = placeHolder.next;
        }
        //incase either of the list has remaining elements while the other list is empty
        // just dump it in since the list is already sorted
        if (list1 != null){
            placeHolder.next = list1;
        }else{
            placeHolder.next = list2;
        }

        return converted.next;
    }   
}

class ListNode{
    int data;
    ListNode next;
    ListNode(){}
    ListNode(int data){this.data = data;}
    ListNode(int data, ListNode next) { this.data = data; this.next = next; }
}