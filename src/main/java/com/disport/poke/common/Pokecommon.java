package com.disport.poke.common;

import com.disport.poke.Play.Doudizhu;
import com.disport.poke.domain.Poke;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/11/14
 */
public class Pokecommon {

    private static List<Poke> pokeList;

    //性感荷官在线初始化
    public static void initPoke(){
        List<Poke> list = new ArrayList<>();
        for (int i =1;i<=5;i++){
            for (int k =1;k<=13;k++){
                String x ="";
                if (i != 5){
                    switch (k){
                        case 1:
                            x = "A";
                            break;
                        case 11:
                            x = "J";
                            break;
                        case 12:
                            x = "Q";
                            break;
                        case 13:
                            x = "K";
                            break;
                        default:
                            x = k+ "";
                    }
                }else {
                    x = k+ "";
                }
                Poke poke = new Poke();
                switch(i){
                    case 1 :
                        poke.setColor(PokeEnum.spades.getsort());
                        poke.setPokeNum(x);
                        list.add(poke);
                        break;
                    case 2 :
                        poke.setColor(PokeEnum.hearts.getsort());
                        poke.setPokeNum(x);
                        list.add(poke);
                        break;
                    case 3 :
                        poke.setColor(PokeEnum.diamonds.getsort());
                        poke.setPokeNum(x);
                        list.add(poke);
                        break;
                    case 4 :
                        poke.setColor(PokeEnum.clubs.getsort());
                        poke.setPokeNum(x);
                        list.add(poke);
                        break;
                    case 5:
                        if (k >2){
                            break;
                        }
                        poke.setColor(PokeEnum.joker.getsort());
                        poke.setPokeNum(x);
                        list.add(poke);
                }
            }
        }
        pokeList = list;
    }
    // 性感荷官在线洗牌
    public static List<Poke> riffle(){
        Collections.shuffle(pokeList);
        List<Poke> pokes = pokeList;
        return pokes;
    }
    // 性感荷官在线发牌
    public static Result deal(List<Poke> pokeList, BasePlay basePlay) throws NoSuchMethodException {
        Result result =new Result();
        Object play = basePlay.play(pokeList);
        result.setData(play);
        return result;
    }


    public static void main(String[] args) {
        initPoke();
        System.out.println("--------初始化---------");
        System.out.println(pokeList.size());
        System.out.println(pokeList);
        System.out.println("--------初始化---------");
        List<Poke> riffle = riffle();
        System.out.println("--------洗牌---------");
        System.out.println(pokeList);
        System.out.println("--------洗牌---------");
        try {
            System.out.println("--------发牌---------");
            Result deal = deal(riffle, new Doudizhu());
            Map<String,List<Poke>> data = (Map)deal.getData();
            List<Poke> list = data.get("player1");
            List<Poke> list1 = data.get("player2");
            List<Poke> list2 = data.get("player3");
            List<Poke> list3 = data.get("more");
            System.out.println(list);
            System.out.println(list1);
            System.out.println(list2);
            System.out.println(list3);
            System.out.println("--------发牌---------");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
