package com.checker.code.foroffer;

import com.checker.structure.TreeNode;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Offer55 {
    public int maxDepth(TreeNode root) {
        //递归
//        if(root==null){
//            return 0;
//        }
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        return Math.max(left + 1, right + 1);

        //非递归
        LinkedList<TreeNode> list = new LinkedList<>();
        int result = 0;
        list.add(root);
        while (!list.isEmpty()) {
            LinkedList<TreeNode> temp = new LinkedList<TreeNode>();
            for (TreeNode treeNode : list) {
                if (treeNode.left != null) {
                    temp.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    temp.add(treeNode.right);
                }
            }
            list = temp;
            result++;
        }
        return result;

    }
}
