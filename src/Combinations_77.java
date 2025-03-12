import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combinations_77 {
    private  ArrayList<List<Integer>> answers=new ArrayList<List<Integer>>();;
    private void solutionForCombine(int n,int k, int prev,Stack<Integer> storage){
        if(k==0){
    answers.add(new ArrayList<Integer>(storage));
    return;
        }
        for(int i=prev+1;i<=n;i++){
            storage.push(i);
            solutionForCombine(n,k-1,i,storage);
            storage.pop();
        }
    }
    public List<List<Integer>> combine(int n, int k) {

        Stack<Integer> temp=new Stack<>();
    solutionForCombine(n,k,0,temp);
        return answers;
    }
}
