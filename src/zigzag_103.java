import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class zigzag_103 {
    public class TreeNode {
        int val;
        Maxlevelsum_1161.TreeNode left;
        Maxlevelsum_1161.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Maxlevelsum_1161.TreeNode left, Maxlevelsum_1161.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    List<List<Integer>> answer=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<Maxlevelsum_1161.TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            int tempsum=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode tempnode=queue.removeFirst();
                tempsum+=tempnode.val;
                if(tempnode.left!=null){queue.add(tempnode.left);}
                if(tempnode.right!=null){queue.add(tempnode.right);}
            }
            if(maxsum<tempsum){
                tempsum=maxsum;
                level_max=level;
            }
            level++;
        }
    }
}
