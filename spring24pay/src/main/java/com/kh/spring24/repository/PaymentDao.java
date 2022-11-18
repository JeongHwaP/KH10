package com.kh.spring24.repository;

import java.util.List;

import com.kh.spring24.entity.PaymentDetailDto;
import com.kh.spring24.entity.PaymentDto;

public interface PaymentDao {
	int paymentSequence();
	void paymentInsert(PaymentDto paymentDto);
	
	int paymentDetailSequence();
	void paymentDetailInsert(PaymentDetailDto paymentDetailDto);
	
	List<PaymentDto> paymentHistory(String memberId);
	
	PaymentDto findPayment(int paymentNo);
	List<PaymentDetailDto> findPaymentDetail(int paymentNo);
}
