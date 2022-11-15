package com.kh.spring23.vo.channel;
/**
 * 방들을 관리할 수 있는 채널 클래스
 * - 방을 관리할 수 있는 필드와 메소드가 필요
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Channel {
	//방들을 이름으로 관리할 수 있는 저장소
	//Map<String, Room> rooms = new HashMap<>();
	Map<String, Room> rooms = Collections.synchronizedMap(new HashMap<>());
	
	//입장
	public void join(User user, String name) {
		if(!rooms.containsKey(name)) {//방이 없으면
			rooms.put(name, new Room());//만드세요
		}
		//입장시키세요
		rooms.get(name).enter(user);
	}
	//퇴장
	//검색
}
