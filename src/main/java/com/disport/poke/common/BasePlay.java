package com.disport.poke.common;

import com.disport.poke.domain.Poke;

import java.util.List;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/11/15
 */
public interface BasePlay {

    Object play(List<Poke> pokeList);
}
