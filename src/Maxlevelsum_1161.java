import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Maxlevelsum_1161 {
    public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  /*
    public int maxLevelSum(TreeNode root) {
        // PriorityQueue<TreeNode> =new PriorityQueue<TreeNode>();
        int maxsum=Integer.MIN_VALUE,level=1,level_max=0;
        LinkedList<TreeNode> queue = new LinkedList<>();

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
        return level_max;

    }*/
}
