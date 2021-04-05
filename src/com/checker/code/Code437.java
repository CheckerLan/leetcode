package com.checker.code;

import com.checker.structure.TreeNode;
import com.checker.util.MapUtil;

import java.util.ArrayList;

public class Code437 {
    ArrayList<Integer> list = new ArrayList<>();
    int result = 0;
    public static void main(String[] args) {
        TreeNode root = MapUtil.arrayToTree("10,5,-3,3,2,null,11,3,-2,null,1");
        System.out.println(new Code437().pathSum(root, 8));
    }
    public int pathSum(TreeNode root, int sum) {
        postOrder(root,sum);
        return result;

    }
    void postOrder(TreeNode node,int sum){

        if(node == null){
            return ;
        }

        list.add(node.val);

        postOrder(node.left,sum);

        postOrder(node.right,sum);

        int tempSum = 0;
        for(int i=1;i <= list.size();i++){
            tempSum += list.get(list.size()-i);
            if(tempSum == sum){
                result++;
            }
        }
        list.remove(list.size()-1);

    }


}
