package main;

import java.util.Date;
import java.util.List;

public class ListItem {
	private String name;
	private Date date;
	
	private boolean checked;
	
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
	
	public void setItemAsChecked(boolean checked)
	{
		this.checked = checked;
	}
	
	public boolean getItemAsChecked()
	{
		return checked;
	}
	
	public int compareName(ListItem other) {
		return this.getName().compareTo(other.getName());
	}
	
	public int compareDate(ListItem other) {
		return this.getDate().compareTo(other.getDate());
	}
	
}
