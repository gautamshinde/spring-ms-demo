package com.example.demo.model;

public class Code {
	private String id;
	private String desc;
		
	public Code(String id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Code [id=" + id + ", desc=" + desc + "]";
	}
}
