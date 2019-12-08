package com.vidvaan.demo;

import org.springframework.stereotype.Component;

@Component
public class Addrass {
private	Integer hono;
private	String Street;
public Integer getHono() {
	return hono;
}
public void setHono(Integer hono) {
	this.hono = hono;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
@Override
public String toString() {
	return "Addrass [hono=" + hono + ", Street=" + Street + "]";
}

public void Aname() {
	System.out.println("this addrass class");
	
}
}
