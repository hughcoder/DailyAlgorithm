package main.剑指offer.第三阶段刷题;

public class Test {

    private int getRealIndex(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    public static void main(String args[]) {
     String str = "\\(这句也要打分)（）((";
        System.out.println(str. replaceAll("\\{", "")
                .replaceAll("\\}", "")
                .replace("\\(","")
                .replace("\\)","")
                .replace('(',' ')
                .replace(')',' ')
                .replace('（',' ')
                .replace('）',' ')

        );

        String cnStr = "山不在高，";
        System.out.println(cnStr.replace("，",""));

        String zzz = "有龙则灵。\r";
        String ccc = zzz.replace("\r","");
        System.out.println(zzz.length());
        System.out.println(ccc.length());

        String ggg = "    示儿";
        System.out.println(ggg.replace("\r","").replace(" ",""));
    }
}
