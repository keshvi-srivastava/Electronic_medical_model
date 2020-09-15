package com.ask.be.configuration;

public class trustedContacts {

	String name;
	String relation;
	String number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "trustedContacts [name=" + name + ", relation=" + relation + ", number=" + number + "]";
	}
	
}
