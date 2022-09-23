-- 게시판
CREATE TABLE board (
	board_no number primary key,
	board_writer references member(member_id) on delete set null,
	board_title varchar2(300) not null,
	board_content varchar2(4000) not null,
	board_writetime date default sysdate not null,
	board_updatetime date,
	board_read number default 0 not null check(board_read >= 0),
	board_like number default 0 not null check(board_like >= 0),
	board_head varchar2(6) check(board_head in('정보', '유머', '공지'))
);
CREATE SEQUENCE board_seq;

-- 테이블에 계층형 게시판 항목을 추가
alter table board add board_group number;
alter table board add board_parent references board(board_no);
alter table board add board_depth number;

update board set board_group = board_no;
update board set board_depth = 0;
commit;

alter table board modify board_group not null;
alter table board modify board_depth not null;

-- 계층형 더미 데이터 구문
truncate table board;
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(1, null, '첫 번째 글', 'hello1234', '테스트', 1, null, 0);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(2, null, '두 번째 글', 'hello1234', '테스트', 2, null, 0);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(3, null, '세 번째 글', 'hello1234', '테스트', 3, null, 0);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(4, null, '네 번째 글', 'hello1234', '테스트', 4, null, 0);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(5, null, '다섯 번째 글', 'hello1234', '테스트', 3, 3, 1);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(6, null, '여섯 번째 글', 'hello1234', '테스트', 3, 3, 1);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(7, null, '일곱 번째 글', 'hello1234', '테스트', 3, 5, 2);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(8, null, '여덟 번째 글', 'hello1234', '테스트', 3, 6, 2);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(9, null, '아홉 번째 글', 'hello1234', '테스트', 9, null, 0);
insert into board(board_no, board_head, board_title, board_writer, board_content, board_group, board_parent, board_depth) values(10, null, '열 번째 글', 'hello1234', '테스트', 9, 9, 1);
commit;

select*from board;

drop table board;

rollback;

/*
    테이블 제약조건(table constraint)
    - 데이터 저장, 수정 등에 반영할 특이사항에 대한 조건
    - Not Null : 필수 데이터를 지정하는 조건
    - Unique : 중복을 금지하는 조건
    - Check : 원하는 값의 형태를 지정하는 조건
*/

-- 기본키 (primary key)
-- 테이블 대표하는 항목
-- not null + unique 항목 중에서만 설정 가능
-- 테이블 당 하나만 존재

/*
    날짜(Date)
    - 데이터에 시간을 설정할 때 사용하는 형태
    - 연월일시분초.0까지 저장 가능
    - 더 자세한 형태로는 timestamp가 있음
    - 문자열과 변환이 가능(to_char(), to_date() 함수)
    - 현재 시각을 자동 계산해주는 객체가 존재한다.(sysdate)
    - date는 계산이 가능하다.(+1은 하루를 더한다.)
*/