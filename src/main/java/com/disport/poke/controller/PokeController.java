package com.disport.poke.controller;

import org.springframework.stereotype.Component;

import javax.websocket.server.ServerEndpoint;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/11/20
 */
@ServerEndpoint(value = "/poke")
@Component
public class PokeController {
    private static int onlineCount = 0;
}
