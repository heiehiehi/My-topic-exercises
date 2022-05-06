package 代码随想录;

public class 颠倒字符串中的单词 {
    public static void main(String[] args) {
        String s = "  Bob    Loves  Alice   ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        //去除多余的空格
        StringBuilder sb = removeblank(s);
        //把整个字符串反转
        reverse(sb,0,sb.length()-1);
        //把单词一个一个转回去
        reverseword(sb);
        return sb.toString();
    }
    public static StringBuilder removeblank(String s){
        int start = 0;
        int end = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while (s.charAt(start)==' '){
            start++;
        }
        while (s.charAt(end)==' '){
            end--;
        }
        while (start<=end){
            char c = s.charAt(start);
            if (c!=' '||sb.charAt(sb.length()-1)!=' '){//最后一个不等于’ ‘才可以吧’ ‘加进去
                sb.append(c);
            }
            start++;
        }
        return sb;
    }
    public static void reverse(StringBuilder str,int left,int right){
        while (left<right){
            char temp = str.charAt(left);
            str.setCharAt(left,str.charAt(right));
            str.setCharAt(right,temp);
            left++;
            right--;
        }
    }
    public static void reverseword(StringBuilder str){
        int start = 0;
        int end = 0;
        while (end<str.length()){
            while (end<str.length()&&str.charAt(end)!=' '){
                end++;
            }
            reverse(str,start,end-1);
            start = end+1;
            end++;
        }
    }
}
