//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) —— 将元素 x 推入栈中。 
// pop() —— 删除栈顶的元素。 
// top() —— 获取栈顶元素。 
// getMin() —— 检索栈中的最小元素。 
// 
//
// 
//
// 示例: 
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// pop、top 和 getMin 操作总是在 非空栈 上调用。 
// 
// Related Topics 栈 设计


package leetcode.editor.cn;

import java.util.Stack;

class MinStackDemo {
    public static void main(String[] args) {
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {
        /**
         * initialize your data structure here.
         */
        private Stack<Integer> stack;
        private Stack<Integer> min_stack;

        public MinStack() {
            stack = new Stack<>();
            min_stack = new Stack<>();
        }

        /**
         *push()方法： 每当push()新值进来时，如果 小于等于 min_stack栈顶值，则一起push()到min_stack，即更新了栈顶最小值；
         */
        public void push(int x) {
            stack.push(x);
            if (min_stack.empty() || x <= min_stack.peek()) min_stack.push(x); //如果写成小于，java.util.EmptyStackException
        }

        /**
         * pop()方法： 判断将pop()出去的元素值是否是min_stack栈顶元素值（即最小值），如果是,
         * 则将min_stack栈顶元素一起pop()，这样可以保证min_stack栈顶元素始终是stack中的最小值。
         */
        public void pop() {
            if (stack.pop().equals(min_stack.peek())) min_stack.pop();
            //此处stack.pop()在if里，仍会执行。
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min_stack.peek();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
/**
 * 辅助栈的思想
 * 用栈实现队列或者用队列实现栈通常用这种思想
 */
