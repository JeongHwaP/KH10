package com.kh.spring22.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class ProductDto {
	private int no;
	private String name, type;
	private int price;
	private Date made, expire;
}