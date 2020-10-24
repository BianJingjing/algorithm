import java.util.Arrays;
import java.util.Stack;

public class VerifySquenceOfBST {

    /*  剑指offer--二叉搜索树的后序遍历
    *   Q: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
    *   A: 二叉搜索树的中序遍历是排序数组，将此题转化为"栈的压入，弹出序列" ，中序遍历作为栈，后序遍历作为弹出序列
    *       1、将后序序列进行排序，转化为中序序列
    *       2、设置弹出序列的标识符
    *       3、将中序序列压入栈，判断栈顶是否与弹出标识符所标识元素相等
    * */

    public boolean VerifySquenceOfBST(int [] sequence) {
        int[] arr = sequence.clone();
        Arrays.sort(arr);
        return isPopOrder(arr,sequence);
    }

    private boolean isPopOrder(int[] push, int[] pop) {
        if(push.length == 0 || pop.length == 0){
            return false;
        }
        int popIndex = 0;
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i< push.length; i++){
            s.push(push[i]);
            while (!s.isEmpty() && s.peek() == pop[popIndex]){
                s.pop();
                popIndex++;
            }
        }
        return s.isEmpty();
    }
}
