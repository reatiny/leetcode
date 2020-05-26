//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针


package leetcode.editor.cn;
class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        int[] a = {1,3,0,7,9};
        solution.moveZeroes(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int num : nums) {
            if (num != 0)
                nums[j++] = num;
        }

        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}