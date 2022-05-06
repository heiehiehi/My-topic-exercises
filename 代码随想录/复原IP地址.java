package 代码随想录;

import java.util.ArrayList;
import java.util.List;

public class 复原IP地址 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("123456");
        s.insert(3,'.');
        System.out.println(s.toString());
    }
    List<String> result = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        StringBuffer str = new StringBuffer(s);
        backtracking(str,0,0);
        return result;
    }
    public void backtracking(StringBuffer s,int startIndex,int pointNum){
        //pointNum为添加逗号的数量
        if (pointNum == 3){
            if (isValid(s,startIndex,s.length()-1)){
                result.add(s.toString());
            }
            return;
        }
        for (int i = startIndex;i<s.length();i++){
            if (isValid(s,startIndex,i)){
                s.insert(i+1,'.');
                backtracking(s,i+2,pointNum+1);
                s.deleteCharAt(i+1);
            }
        }
    }
    public boolean isValid(StringBuffer s,int start,int end){
        if (start>end){
            return false;
        }
        if (s.charAt(start)=='0'&&start!=end){
            return false;
        }
        int num = 0;
        for (int i = start;i<=end;i++){
            if (s.charAt(i)>'9'||s.charAt(i)<'0'){
                return false;
            }
            num = num*10 + (s.charAt(i)-'0');
            if (num>255){
                return false;
            }
        }
        return true;
    }
}
