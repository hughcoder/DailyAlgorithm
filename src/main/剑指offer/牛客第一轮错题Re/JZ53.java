package main.剑指offer.牛客第一轮错题Re;

public class JZ53 {
    public boolean isNumeric(char[] str) {
        boolean isHasNum = false;
        boolean isHasDot = false;
        boolean isHaseOrE = false;
        boolean isHasSymbol = false;

        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9') {
                isHasNum = true;
            } else if (str[i] == '.') {
                if (isHasDot) {
                    return false;
                }
                if (isHaseOrE) {
                    return false;
                }
                isHasDot = true;
            } else if (str[i] == 'e' || str[i] == 'E') {
                if(i == str.length-1){
                    return false;
                }
                isHaseOrE = true;
            } else if (str[i] == '+' || str[i] == '-') {
                if (i!=0 && !isHaseOrE) {
                    return false;
                }
                if (i > 0 && (str[i - 1] == '+' || str[i - 1] == '-')) {
                    return false;
                }
                isHasSymbol = true;
            } else {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String a = "+-5";

        JZ53 jz52 = new JZ53();
        System.out.println(jz52.isNumeric(a.toCharArray() ));
    }
}
