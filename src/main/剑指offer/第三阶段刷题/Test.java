package main.剑指offer.第三阶段刷题;

import java.util.ArrayList;
import java.util.List;

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
//     String str = "\\(这句也要打分)（）((";
//        System.out.println(str. replaceAll("\\{", "")
//                .replaceAll("\\}", "")
//                .replace("\\(","")
//                .replace("\\)","")
//                .replace('(',' ')
//                .replace(')',' ')
//                .replace('（',' ')
//                .replace('）',' ')
//
//        );
//
//        String cnStr = "山不在高，";
//        System.out.println(cnStr.replace("，",""));
//
//        String zzz = "有龙则灵。\r";
//        String ccc = zzz.replace("\r","");
//        System.out.println(zzz.length());
//        System.out.println(ccc.length());
//
//        String ggg = "    示儿";
//        System.out.println(ggg.replace("\r","").replace(" ",""));
//
//
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("1");
//        list.add("1");
//        System.out.println(list.subList(0,1).size());
//        List<String> hhlist = list.subList(0,list.size());
//        System.out.println(hhlist.toString());

        String aa = "句号( 。)问号（ ？）感叹号（ ！）逗号( ，)顿号( 、)分号( ；)冒号( ：)引号（“ ”）括号〔（ ） [ ] { } 〕破折号（ ─略号（……）着重号（ ．）书名号（《 》〈 〉）间隔号（·）连接号（ — ）专名号（ ____ )注释号（ * ）隐讳号×）虚缺号（□）斜线号（ / ）标识号（▲或●）弈秋，通国之善弈者也。使弈秋诲二人弈，其一人专心致志，惟弈秋之为听；一人虽听之，一心以为有鸿鹄将至，思援弓缴而射之。虽与之俱学，弗若之矣。为是其智弗若与？曰：非然也。";
        System.out.println(aa.replaceAll("[^\u4E00-\u9FA5]", ""));
    }
}
