import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zigzag_103 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    List<List<Integer>> answer=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        boolean turn=false;
        queue.add(root);
        while (!queue.isEmpty()){

            int size=queue.size();
            Integer [] temp=new Integer[size];
            for(int i=0;i<size;i++){
                TreeNode tempnode=queue.removeFirst();
                if(turn)temp[size-1-i]=tempnode.val;
                else{temp[i]=tempnode.val;}
                if(tempnode.left!=null){queue.add(tempnode.left);}
                if(tempnode.right!=null){queue.add(tempnode.right);}
            }
            answer.add(Arrays.asList(temp));
            turn=!turn;
        }
        return answer;
    }
}
