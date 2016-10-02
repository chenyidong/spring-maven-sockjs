package com.turing.websocket;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/**
 * websocket������
 * @author cheny
 *
 */
public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor{

	  @Override
	  public boolean beforeHandshake(ServerHttpRequest request,ServerHttpResponse response, WebSocketHandler wsHandler,
	      Map<String, Object> attributes) throws Exception {
	    System.out.println("��ʼ������");
	    return super.beforeHandshake(request, response, wsHandler, attributes);
	  }

	  @Override
	  public void afterHandshake(ServerHttpRequest request,ServerHttpResponse response, WebSocketHandler wsHandler,
	      Exception ex) {
	    System.out.println("����������");
	    super.afterHandshake(request, response, wsHandler, ex);
	  }

	}