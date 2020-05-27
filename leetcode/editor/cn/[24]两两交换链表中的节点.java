//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表


package leetcode.editor.cn;

class SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode cur = dummy; // 0
            while (cur.next != null && cur.next.next !=null) {
                ListNode first = cur.next; // 1
                ListNode second = cur.next.next; // 2
                cur.next = second; // 0 to 2
                first.next = second.next; // 1 to new1
                second.next = first; // 2 to 1
                cur = first; // 1 become new0
            }
            //return head; why is this missing the first number ?
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}