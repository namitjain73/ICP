package Day9;

public class remove_duplicates_from_sorted_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		    public ListNode deleteDuplicates(ListNode head) {
		        ListNode temp=head,dummy=temp,prev=head;

		        while(temp!=null&&temp.next!=null){
		            while(temp!=null&&temp.next!=null&&temp.val==temp.next.val){
		                temp.next=temp.next.next;
		            }
		            temp=temp.next;
		        }
		        return dummy;
		    }

}
