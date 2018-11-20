package com.disport.poke.Play;

import com.disport.poke.common.BasePlay;
import com.disport.poke.domain.Poke;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/11/15
 */
public class Doudizhu implements BasePlay {



    @Override
    public Object play(List<Poke> pokeList) {
        Map map = new HashMap();
        List<Poke> player1 = new ArrayList<>();
        List<Poke> player2 = new ArrayList<>();
        List<Poke> player3 = new ArrayList<>();
        List<Poke> more = new ArrayList<>();
        for (int i=0;i<3;i++){
            Poke remove = pokeList.remove(pokeList.size()-1);
            more.add(remove);
        }
        for (int k=0; k <pokeList.size() ;k+=3){
            int size = pokeList.size();
            player1.add(pokeList.get(k));
            if(k+1<size){
                player2.add(pokeList.get(k+1));
            }
            if(k+2<size){
                player3.add(pokeList.get(k+2));
            }
        }
        map.put("player1",player1);
        map.put("player2",player2);
        map.put("player3",player3);
        map.put("more",more);
        return map;
    }
}
