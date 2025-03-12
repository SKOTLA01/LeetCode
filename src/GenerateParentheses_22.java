import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses_22 {
    private List<String> answers=new ArrayList<String>();
    public  void solution(int n, int index, int open,int closed ,Stack<Character>storage){
       if(index==2*n){
           StringBuilder temp2=new StringBuilder();
           storage.forEach(x->temp2.append(x));

           answers.add(temp2.toString());
       }
        if(open<n){
           storage.add('(');
           solution(n,index+1,open+1,closed,storage);
           storage.pop();
       }
        if(open>closed){
            storage.push(')');
            solution(n,index+1,open,closed+1,storage);
            storage.pop();
        }

    }
    public List<String> generateParenthesis(int n) {
        solution(n,0,0,0,new Stack<>());
return  answers;

    }
}
