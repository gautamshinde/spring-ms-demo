package com.example.demo.model;

import java.util.List;

public class CodeCatelog {
	private String name;
	private List<Code> codes;
	public CodeCatelog() {
	}	
	public CodeCatelog(String name, List<Code> codes) {		
		this.name = name;
		this.codes = codes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Code> getCodes() {
		return codes;
	}
	public void setCodes(List<Code> codes) {
		this.codes = codes;
	}
	@Override
	public String toString() {
		return "CodeCatelog [name=" + name + ", codes=" + codes + "]";
	}	
}
