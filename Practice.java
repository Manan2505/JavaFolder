package JavaFolder;
import java.util.*;
import java.lang.*;
public class Practice {
    public static void main(String[] args) {
        Stack<Character>st=new Stack<>();
        String s="(())(())";
        String ans="";
        for(int i=0; i<s.length(); i++){
            if(st.isEmpty() || s.charAt(i)=='(' ){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')' && st.peek()=='(' && st.size()>1){
                int count=0;
                while(st.size()!=1){
                    ans+=""+st.pop();
                    count++;
                }
                while(count!=0){
                    ans+=""+s.charAt(i);
                    count--;
                }
            }else {
                st.pop();
            }
        }
        System.out.println(ans);
    }
}
