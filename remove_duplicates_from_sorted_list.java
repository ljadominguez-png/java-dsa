
public class remove_duplicates_from_sorted_list {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(1);
        list2.next.next = new ListNode(2);
        list2.next.next.next = new ListNode(3);
        list2.next.next.next.next = new ListNode(3);
        
        remove_duplicates_from_sorted_list myclass = new remove_duplicates_from_sorted_list();
        ListNode result1 = myclass.deleteDups(list2);
        while (result1 != null){
           // System.out.print(result1.val + " -> ");
           System.out.print(result1.val + (result1.next != null ? " -> " : "")); 
           result1 = result1.next;
        }
        System.err.println(" null");
    }

    private ListNode deleteDups(ListNode head){
        ListNode placeholder = head;
        //check if current is not null, and also next should not be null
        while (placeholder != null && placeholder.next != null){
           // if current value is equal to next value = skip it
           //use this method current.next = current.next next
            if(placeholder.val == placeholder.next.val){
                placeholder.next = placeholder.next.next;
            }else{
                placeholder = placeholder.next;
            }
        }
        //puro mali
      /*  while (placeholder != null ){
            if (head.val == head.next.val){
                head.next = head.next.next;
                placeholder.next = head.next;
            }else{
                head.next = head.next;
                placeholder = head.next;
            }
            placeholder = placeholder.next;
        }*/
        //do not return placeholder lol
        return head;
    }
       static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
