package com.simple.Tree;


public class InvertTree {
    public TreeNode sol(TreeNode root){
        if(root==null){
            return root;
        }
        if(root.left==null&&root.right==null){
            return root;
        }else{
            TreeNode temp=root.right;
            root.right=sol(root.left);
            root.left=sol(temp);
        }
        return root;
    }

}
