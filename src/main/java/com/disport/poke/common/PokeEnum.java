package com.disport.poke.common;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/11/14
 */
public enum PokeEnum {
    spades(1,"spades"),
    hearts(2,"hearts"),
    diamonds (3,"diamonds"),
    clubs(4,"clubs"),
    joker(5,"joker");

    private int sort;
    private String value;

    PokeEnum(int sort,String value){
        this.sort = sort;
        this.value = value;
    }

    public int getsort() {
        return sort;
    }

    public String getValue() {
        return value;
    }
}
