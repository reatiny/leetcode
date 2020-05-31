

package leetcode.editor.cn;

class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Solution solution = new LargestRectangleInHistogram().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestRectangleArea(int[] heights) {
            //单调栈没懂
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
/*
枚举高度的办法：从中间往两边走
class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int mid = 0;mid < heights.length;++mid) {
            int left = mid,right = mid;
            while (left >= 1 && heights[left - 1] >= heights[mid]) --left;
            while (right < heights.length - 1 && heights[right + 1] >= heights[mid]) ++right;
            max = Math.max(max,(right - left + 1) * heights[mid]);
        }
        return max;
    }
}*/
