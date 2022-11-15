package com.kh.spring23.websocket;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.kh.spring23.vo.channel.Room;
import com.kh.spring23.vo.channel.User;

import lombok.extern.slf4j.Slf4j;

/**
 * 회원들간의 그룹채팅이 가능하도록 구현한 서버
 * - User, Room, Channel 클래스를 활용
 * - 대기실을 구현
 */
@Slf4j
@Service
public class MemberGroupChatServer extends TextWebSocketHandler{
	//대기실
	private Room waitingRoom = new Room();
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		//접속 시 대기실로 입장
		Map<String, Object> attr = session.getAttributes();
		User user = User.builder()
								.memberId((String)attr.get("loginId"))
								.memberNick((String)attr.get("loginNick"))
								.memberGrade((String)attr.get("loginAuth"))
								.session(session)
								.build();
		waitingRoom.enter(user);
		log.debug("대기실 입장 - 현재 {}명", waitingRoom.size());
	}
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		//사용자가 나가면...
		//- 대기실에 있을지 채널에 있을지 알 수 없다
		Map<String, Object> attr = session.getAttributes();
		User user = User.builder()
								.memberId((String)attr.get("loginId"))
								.memberNick((String)attr.get("loginNick"))
								.memberGrade((String)attr.get("loginAuth"))
								.session(session)
								.build();
		waitingRoom.leave(user);
		log.debug("사용자 퇴장");
	}
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

	}
}
