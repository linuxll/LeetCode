package com.simple.Tree;

import java.util.*;

//101.对称二叉树
public class TwoTree {
    /**
     * 暴力法，未解决
     */
    public static List<String> li =new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        mid(root);
        boolean flag=true;
        for(int i=0;i<li.size();i++){
            if(!li.get(i).equals(li.get(li.size()-i-1))){
                flag=false;
                break;
            }
        }

        return flag;
    }
    public static void mid(TreeNode root){
        if(root==null){
            return ;
        }else {
        mid(root.left);
        li.add(String.valueOf(root.val));
        mid(root.right);
        }
    }

    /**
     * 迭代法
     * @param root
     * @return
     */
    public boolean dieDai(TreeNode root){
        return check(root,root);
    }
    public boolean check(TreeNode p,TreeNode q){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(p);
        queue.offer(q);
        while(!queue.isEmpty()){
            p=queue.poll();
            q=queue.poll();
            if(p==null&&q==null){
                continue;
            }
            if((p==null||q==null)||p.val!=q.val){
                return false;
            }
            queue.offer(p.left);
            queue.offer(q.right);

            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }

    /**
     *
     */
}
