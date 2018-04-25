package com.hzhiping.model;

import java.util.Date;

/**
 * 
 * @title:Item的pojo类
 * @description:
 * @author:hzhiping
 * @since:2018年4月25日 下午8:17:22
 */
public class Item {
	private int id;
	private String name;
	private double price;
	private Date createtime;
	private String detail;

	public Item() {
		super();
	}

	public Item(int id, String name, double price, Date createtime, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.createtime = createtime;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
