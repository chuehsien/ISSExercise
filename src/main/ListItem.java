package main;

import java.util.Date;

public class ListItem {
	private String name;
	private Date date;
	
	public ListItem(String name){		
		this.name = name;
		this.date = new Date();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int compareName(ListItem other) {
		return this.getName().compareTo(other.getName());
	}
	
	public int compareDate(ListItem other) {
		return this.getDate().compareTo(other.getDate());
	}
	
}
