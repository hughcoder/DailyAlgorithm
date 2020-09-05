package main.剑指offer.牛客第一轮错题;

import java.util.LinkedList;
import java.util.Queue;


public class JZ61 {
    //序列化和反序列化
    String Serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null) {
                sb.append("," + cur.left.val);
                queue.add(cur.left);
            } else {
                sb.append(",");
                sb.append("#");
            }

            if (cur.right != null) {
                sb.append("," + cur.right.val);
                queue.add(cur.right);
            } else {
                sb.append(",");
                sb.append("#");
            }
        }
        return sb.toString();
    }

    //牛客用例输入{8,6,10,5,7,9,11}
    TreeNode Deserialize(String aaa) {
        if (aaa.equals("") || aaa.equals("#")) {
            return null;
        }
        String str[] = aaa.split(",");

        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(str[index]));
        queue.add(root);
        while (!queue.isEmpty()) {
            if (index == str.length - 1) {
                break;
            }
            index++;
            TreeNode cur = queue.poll();
            if (str[index].equals("#")) {
                cur.left = null;
            } else {
                cur.left = new TreeNode(Integer.parseInt(str[index]));
                queue.add(cur.left);
            }
            if (index == str.length - 1) {
                break;
            }
            index++;
            if (str[index].equals("#")) {
                cur.right = null;
            } else {
                cur.right = new TreeNode(Integer.parseInt(str[index]));
                queue.add(cur.right);
            }
        }

        return root;
    }

    public static void main(String args[]) {
        JZ61 jz61 = new JZ61();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        right.left = new TreeNode(4);
        right.right = new TreeNode(5);
        node.right = right;
        TreeNode cur = jz61.Deserialize("8,6,10,5,7,9,11");
        System.out.println(jz61.Serialize(cur));
//        TreeNode cur = jz61.Deserialize("5,4,#,3,#,2");
//        System.out.println(jz61.Serialize(cur));
    }
}
