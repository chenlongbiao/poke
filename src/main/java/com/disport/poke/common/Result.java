package com.disport.poke.common;

import java.io.Serializable;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/11/15
 */
public class Result<T> implements Serializable {

    public T Data;

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
