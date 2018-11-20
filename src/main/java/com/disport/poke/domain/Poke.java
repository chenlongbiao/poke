package com.disport.poke.domain;

import lombok.Data;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title: 牌对象
 * @date 2018/11/14
 */
public class Poke {

    /**
     * 花色
     */
    private Integer color;
    /**
     * 数字
     */
    private String pokeNum;

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getPokeNum() {
        return pokeNum;
    }

    public void setPokeNum(String pokeNum) {
        this.pokeNum = pokeNum;
    }

    @Override
    public String toString() {
        return "Poke{" +
                "color='" + color + '\'' +
                ", pokeNum='" + pokeNum + '\'' +
                '}';
    }
}
