import java.util.ArrayList;
import java.util.List;

public class Letter_patter_17 {
    private  void solution(String digit,int index,char[] tempanswer){
        if(index==digit.length()){
            // System.out.println(tempanswer);
            answer.add(new String(tempanswer));

            return
                    ;
        }
        char temp=digit.charAt(index);
        int cond=3;
        if(temp=='7'|| temp=='9')
            cond=4;
        int tt=0;
        if(temp>='8'&&temp<='9')
            tt=1;
        for( int i=0;i<cond;i++){
            char value=(char)('a'+3*(temp-'2')+i+tt);
            tempanswer[index]=value;
            solution(digit,index+1,tempanswer);
        }
    }

    List<String> answer= new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        char []ans=new char[digits.length()];
        if(digits.length()==0)return answer;
        solution(digits,0,ans);

        return answer;
    }
}
