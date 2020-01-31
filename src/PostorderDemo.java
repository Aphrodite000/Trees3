import java.util.Stack;

public class PostorderDemo {
    //非递归后序遍历，没写完
    public static void postorderNotR(TreeNode root){
        Stack<TreeNode> stack=new Stack();
        TreeNode cur=root;
        TreeNode last=null;
        while(!stack.empty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode top=stack.peek();
        }
    }
    //判断是否为同一个二叉树
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.val==q.val&&isSameTree(p.left,q.left)
                &&isSameTree(p.right,q.right);
    }
}
