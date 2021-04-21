package com.checker.code.foroffer;

import com.checker.structure.TreeNode;

import java.util.Stack;

public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        //递归
//        if (root == null){
//            return null;
//        }
//        TreeNode treeNode = root.left;
//        root.left=root.right;
//        root.right=treeNode;
//
//        mirrorTree(root.left);
//        mirrorTree(root.right);
//        return root;

        //非递归；
        if (root==null){
            return null;
        }
        TreeNode node;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            node=stack.pop();
            if (node.left!=null){
                stack.push(node.left);
            }
            if (node.right!=null){
                stack.push(node.right);
            }
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
        }
        return root;
    }
}
