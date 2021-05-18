package com.simple.Tree;

public class DepthTree {
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int res;
        res=Math.max(maxDepth(root.right),maxDepth(root.left));
        return res+1;
    }
}
