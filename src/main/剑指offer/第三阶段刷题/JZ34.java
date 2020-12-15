package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;
import java.util.List;

public class JZ34 {
    List<List<Integer>> allPath;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return new ArrayList<>();
        }
        allPath = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        recur(root, tempList, sum);
        return allPath;
    }

    public void recur(TreeNode root, List<Integer> list, int sum) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (getAll(list) == sum) {
            allPath.add(new ArrayList<>(list));
        }
        recur(root.left, list, sum);
        recur(root.right, list, sum);
        list.remove(list.size() - 1);
    }

    private int getAll(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;

    }
}
