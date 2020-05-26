package leetcode.editor.cn;//给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i,
//ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 
//
// 说明：你不能倾斜容器，且 n 的值至少为 2。 
//
// 
//
// 
//
// 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。 
//
// 
//
// 示例： 
//
// 输入：[1,8,6,2,5,4,8,3,7]
//输出：49 
// Related Topics 数组 双指针


class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution solution = new ContainerWithMostWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     *2. 左右边界向中间收敛
     */
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0,j = height.length - 1;i < j;) {
            int minHeight = height[i] < height[j] ? height[i++] :height[j--];
            max = Math.max(max,minHeight * (j - i + 1));
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}


/**
 * 1. 枚举法比较大小，二重循环
 */
/*class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0;i < height.length - 1;++i) {
            for (int j = i + 1;j < height.length;++j) {
                int area = (j - i) * Math.min(height[i],height[j]);
                max = Math.max(max,area);
            }
        }
        return max;
    }
}*/