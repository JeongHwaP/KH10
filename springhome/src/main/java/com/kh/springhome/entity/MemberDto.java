package com.kh.springhome.entity;

public class MemberDto {
	private String memberId, memberPw, memberNick, memberBirth;
	private int memberTel;
	private String memberEmail, memberPost, memberBaseAddress;
	private String memberDetailAddress;
	private int memberPoint;
	private int memberGrade, memberJoin, memberLogin;
	public MemberDto() {
		super();
	}
	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberPw=" + memberPw + ", memberNick=" + memberNick
				+ ", memberBirth=" + memberBirth + ", memberTel=" + memberTel + ", memberEmail=" + memberEmail
				+ ", memberPost=" + memberPost + ", memberBaseAddress=" + memberBaseAddress + ", memberDetailAddress="
				+ memberDetailAddress + ", memberPoint=" + memberPoint + ", memberGrade=" + memberGrade
				+ ", memberJoin=" + memberJoin + ", memberLogin=" + memberLogin + "]";
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberNick() {
		return memberNick;
	}
	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}
	public String getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}
	public int getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(int memberTel) {
		this.memberTel = memberTel;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPost() {
		return memberPost;
	}
	public void setMemberPost(String memberPost) {
		this.memberPost = memberPost;
	}
	public String getMemberBaseAddress() {
		return memberBaseAddress;
	}
	public void setMemberBaseAddress(String memberBaseAddress) {
		this.memberBaseAddress = memberBaseAddress;
	}
	public String getMemberDetailAddress() {
		return memberDetailAddress;
	}
	public void setMemberDetailAddress(String memberDetailAddress) {
		this.memberDetailAddress = memberDetailAddress;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	public int getMemberGrade() {
		return memberGrade;
	}
	public void setMemberGrade(int memberGrade) {
		this.memberGrade = memberGrade;
	}
	public int getMemberJoin() {
		return memberJoin;
	}
	public void setMemberJoin(int memberJoin) {
		this.memberJoin = memberJoin;
	}
	public int getMemberLogin() {
		return memberLogin;
	}
	public void setMemberLogin(int memberLogin) {
		this.memberLogin = memberLogin;
	}
	
}
