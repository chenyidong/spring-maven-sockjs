package com.turing.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * websocket������
 * @author cheny
 *
 */
public class WebsocketEndPoint extends TextWebSocketHandler {

	  @Override
	  protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
	    super.handleTextMessage(session, message);
	    System.out.println("�����˹�����");
	    TextMessage returnMessage = new TextMessage(message.getPayload()+" ��̨����Ϣ");
	    session.sendMessage(returnMessage);
	  }
}