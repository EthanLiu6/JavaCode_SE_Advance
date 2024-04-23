package doudizhu;

import java.util.*;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/23 20:59
 * @Project JavaCode_SE_Advance
 * @Theme 斗地主案例
 */
public class Test1 {
    public static void main(String[] args) {
        //Map集合: 存储扑克牌的编号和牌面值
        Map<Integer, String> pokerMap = new HashMap<>();
        //List集合: 存储扑克牌编号(用于洗牌等)
        List<Integer> pokerNumber = new ArrayList<>();
        //TreeSet集合: 存储玩家信息和发牌情况(三个后面写)

        //功能1: 准备牌
        //"红星2" "黑桃2" "梅花2" "方片2" ......
        String[] color = {"❤", "♠", "♣", "♦"}; //颜色形状
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};//数值

        int count = 0; //牌数计数(或编号)
        //合并牌
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < color.length; j++) {
                pokerMap.put(count, color[j].concat(number[i])); //合并牌
                pokerNumber.add(count); //添加扑克牌编号
                count++;
            }
        }
        //添加大小王
        if (count < 55) {
            pokerMap.put(count, "小\uD83C\uDCCF");
            pokerNumber.add(count);
            count += 1;
            pokerMap.put(count, "大\uD83C\uDCCF");
            pokerNumber.add(count);
        }

        //功能2: 洗牌
        Collections.shuffle(pokerNumber); //返回前面添加扑克牌编号
        //System.out.println(pokerNumber);

        //功能3: 发牌 发的是扑克牌编号并排序
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>(); //底牌

        for (int idx = 0; idx < pokerNumber.size(); idx++) {
            //保留底牌
            if (idx > 50) /*idx是从0开始的哦*/ {
                dp.add(pokerNumber.get(idx));
                continue;
            }

            if (idx % 3 == 0) /* 玩家1拿牌 */ {
                player1.add(pokerNumber.get(idx));
            } else if (idx % 3 == 1) /* 玩家2拿牌 */ {
                player2.add(pokerNumber.get(idx));
            } else /* 玩家3拿牌 */ {
                player3.add(pokerNumber.get(idx));
            }
        }
        System.out.println(player1.size());
        System.out.println(player2.size());
        System.out.println(player3.size());
        System.out.println(dp);

        //功能4: 看牌(方法定义)
        lookPoker("Ethan", player1, pokerMap);
        lookPoker("Qiu", player2, pokerMap);
        lookPoker("BaoJie", player3, pokerMap);
        lookPoker("底牌", dp, pokerMap);
    }

    /**
     * //功能4: 看牌(方法定义)
     *
     * @param name   玩家名字
     * @param player 玩家牌编号
     * @param pokerMap 存储扑克牌的编号和牌面值
     */
    public static void lookPoker(String name, TreeSet<Integer> player, Map<Integer, String> pokerMap) {
        System.out.print(name + ": ");

        //遍历玩家牌编号
        for (Integer pokerNum : player) {
            //根据编号获取牌的值
            System.out.print(pokerMap.get(pokerNum) + " ");
        }
        System.out.println();
    }
}
