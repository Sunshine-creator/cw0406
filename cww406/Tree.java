package cww406;
import cww405.Node;

import java.util.Stack;

public class Tree {
    static class TreeNode1 {
        public int val;
        public TreeNode1 left;
        public TreeNode1 right;
        public TreeNode1(int val)
        {
            this.val = val;
        }
    }
//    public  static TreeNode1 build(){
//        Node a = new Node(1);
//        Node.TreeNode b = new Node.TreeNode(2);
//        Node.TreeNode c = new Node.TreeNode(3);
//        Node.TreeNode d = new Node.TreeNode(4);
//        Node.TreeNode e = new Node.TreeNode(5);
//        Node.TreeNode f = new Node.TreeNode(6);
//        Node g = new Node(7);
//        a.left=b;
//        a.right=c;
//        b.left=d;
//        b.right=e;
//        c.right=f;
//        d.left=g;
//        return a;
//    }
    public static void postOrder(TreeNode1 root){   //后序遍历非递归
        if(root==null){
            return;
        }
        Stack<TreeNode1> stack = new Stack <>();
        TreeNode1 cur =  root;
        TreeNode1 pre = null;   //当前已经访问过的上一个节点
        while (true){
            while (cur!=null){          //一路向左找
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()){
                break;
            }
            TreeNode1 top = stack.peek();  //取出栈顶元素并不删除
            if (top==null || pre==top.right){
                stack.push(top);
                System.out.println(top.val + " ");
                 pre = top;    //在这里它指向遍历完的最后一个
            }else {
                pre = top.right;
            }
        }
    }
}
