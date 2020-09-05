package main.剑指offer.牛客第一轮刷题;

public class JZ2 {
    //请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，
    // 当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public static String replaceSpace(StringBuffer str) {
        if(str.length() == 0){
            return "";
        }

        String newStr ="";
        StringBuffer str2 = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                str2.append("%20");
            }else {
                str2.append(str.charAt(i));
            }
        }

        return str2.toString();
    }

    public static void main(String args[]) {
        StringBuffer buffer = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(buffer));
    }
}
