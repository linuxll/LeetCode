package com.simple.Tree;

public class MarrayTree {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode t1;
        TreeNode t2;
        if(root1==null&&root2==null){
            return null;
        }else if(root1==null&&root2!=null){

            return new TreeNode(root2.val,root2.left,root2.right);
        }else if(root1!=null&&root2==null){

            return new TreeNode(root1.val,root1.left,root1.right);
        }
            t1=mergeTrees(root1.left,root2.left);
            t2=mergeTrees(root1.right,root2.right);
            return new TreeNode(root1.val+ root2.val,t1,t2);
    }

}
