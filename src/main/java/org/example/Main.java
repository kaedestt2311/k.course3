package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       Map<String,String> userMap = new HashMap();
       userMap.put("春","春は出会いが多い！花粉が飛びまくるのでそれどころではありませんが");
       userMap.put("夏","最近の夏は灼熱ですが、極寒よりはマシなので嫌いではないです");
       userMap.put("秋","秋は短く儚い感じであっという間に過ぎ去りますが１番好きな季節です");
       userMap.put("冬","冬はやる気を失うので嫌いですね");

        System.out.println("私なりに春夏秋冬を一言、二言にしてみました！");
        System.out.println(userMap.get("春"));
        System.out.println(userMap.get("夏"));
        System.out.println(userMap.get("秋"));
        System.out.println(userMap.get("冬"));


        System.out.println("-----------------------");
        try {
            String name = null;
            int length = name.length();
            System.out.println("可愛い名前ですね");
        }catch(Exception e){
            System.out.println("エラー発生！nameがnullです");
            e.printStackTrace();
        }finally {
            System.out.println("処理を終了します");
        }
    }
}