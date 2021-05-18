package com.simple.Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

/**
 * 二叉搜索树中序遍历得到的值序列是递增有序的
 */
class Solute{
    int ans=Integer.MAX_VALUE;
    int pre=-1;
    public int min(TreeNode root){
        dfs(root);
        return ans;
    }

    /**
     * 中序遍历
     * @param root
     */
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        if(pre==-1){
            pre=root.val;
        }else{
            ans=Math.min(ans,root.val-pre);
            pre=root.val;
        }
        dfs(root.right);

    }
}