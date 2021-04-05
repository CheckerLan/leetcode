package com.checker.util;

import com.checker.structure.TreeNode;

import java.util.ArrayList;


public class MapUtil {
    public static TreeNode arrayToTree(String str) {
        String[] array = stringsToArray(str);
        ArrayList<TreeNode> list = new ArrayList<>();
        TreeNode root = null;
        TreeNode node;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                root = new TreeNode(Integer.parseInt(array[0]));
                list.add(root);
                node = root;
            } else {
                node = list.get(i);
            }
            if (node == null) {
                //list.add(null);
                continue;
            }
            if (list.size() < array.length) {
                if (array[list.size()] != null) {
                    node.left = new TreeNode(Integer.parseInt(array[list.size()]));
                }

                list.add(node.left);
            }
            if (list.size() < array.length) {
                if (array[list.size()] != null) {
                    node.right = new TreeNode(Integer.parseInt(array[list.size()]));
                }
                list.add(node.right);
            }

        }
        return root;
    }

    public static String[] stringsToArray(String str) {
        String[] strings = str.split(",");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("null")) {
                strings[i] = null;
            }
        }
        return strings;
    }
}
