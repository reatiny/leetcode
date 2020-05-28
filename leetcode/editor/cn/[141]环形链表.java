//给定一个链表，判断链表中是否有环。 
//
// 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。 
//
// 
//
// 示例 1： 
//
// 输入：head = [3,2,0,-4], pos = 1
//输出：true
//解释：链表中有一个环，其尾部连接到第二个节点。
// 
//
// 
//
// 示例 2： 
//
// 输入：head = [1,2], pos = 0
//输出：true
//解释：链表中有一个环，其尾部连接到第一个节点。
// 
//
// 
//
// 示例 3： 
//
// 输入：head = [1], pos = -1
//输出：false
//解释：链表中没有环。
// 
//
// 
//
// 
//
// 进阶： 
//
// 你能用 O(1)（即，常量）内存解决此问题吗？ 
// Related Topics 链表 双指针


package leetcode.editor.cn;

class LinkedListCycle {
    public static void main(String[] args) {
        Solution solution = new LinkedListCycle().new Solution();
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
        //leetcode submit region begin(Prohibit modification and deletion)

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next != null && fast.next.next!=null) {  //while(slow.next != null && fast.next.next!=null) why this wrong?
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

/*
1. 给定一个时间（比如1s），遍历链表，若遍历到null则无环。
2. Set 遍历一个标记下，看看有没有节点二次标记。
3. 快慢指针，快指针追上慢指针则有环。*/

//容易出现空指针的问题 循环条件里fast写成slow就空指针；头指针判空不写也空指针。
