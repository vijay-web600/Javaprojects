package com.vidvaan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton")
public class Student {
	private Integer sid;
	private String name;
	private Double marks;
	@Autowired
	private Addrass addrass;
	public Student() {
		System.out.println("object created");
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	public void runing() {
		addrass.Aname();
		System.out.println("student running");
	}
	public Addrass getAddrass() {
		return addrass;
	}
	public void setAddrass(Addrass addrass) {
		this.addrass = addrass;
	}
	@Override
	public String toString() {
	
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", addrass=" + addrass + "]";
	}
	

}
