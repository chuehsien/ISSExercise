package test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.ListItem;
import main.MyList;

public class ISSTest {

	public static MyList myList;
	
	@Before
	public void before() {
		myList = new MyList();
	}
	
	@After
	public void after() {}
	
	@Test
	public void addToList() {
		myList.add(new ListItem("a"));
		assertEquals(myList.get(0).getName(),"a");
		
		myList.add(new ListItem("b"));
		assertEquals(myList.get(0).getName(),"a");
		assertEquals(myList.get(1).getName(),"b");
		System.out.print("hi");
		
		
	}
	
	@Test
	public void delFromList() {
		myList.add(new ListItem("a"));
		myList.add(new ListItem("b"));
		
		myList.del("a");
		assertEquals(myList.get(0).getName(),"b");
		myList.del("b");
		assertNull(myList.get(0));
	}
	
	@Test
	public void delFromEmptyList() {
		myList.del("a");
		assertEquals(myList.size(),0);
	}
	
	@Test
	public void viewListItem()
	{
		myList.add(new ListItem("a"));
		myList.add(new ListItem("b"));
		
		assertEquals(myList.viewList().get(0).getName(), "a");
		assertEquals(myList.viewList().get(1).getName(), "b");
	}
	
	public void checkOffItem()
	{
		myList.add(new ListItem("a"));
		myList.add(new ListItem("b"));
		
		myList.checkOffItem("a");
		
		assertEquals(myList.get(0).getItemAsChecked(), true);
		assertEquals(myList.get(1).getItemAsChecked(), false);
	}
	
	@Test
	public void sortListByItemAscending() {
		myList.add(new ListItem("a"));
		myList.add(new ListItem("c"));
		myList.add(new ListItem("d"));
		myList.add(new ListItem("b"));
		

		myList.sortByItemAscending();
		assertEquals(myList.get(0).getName(),"a");
		assertEquals(myList.get(1).getName(),"b");
		assertEquals(myList.get(2).getName(),"c");
		assertEquals(myList.get(3).getName(),"d");
	}
	@Test
	public void sortListByItemDescending() {
		myList.add(new ListItem("a"));
		myList.add(new ListItem("c"));
		myList.add(new ListItem("d"));
		myList.add(new ListItem("b"));
		

		myList.sortByItemDescending();
		assertEquals(myList.get(0).getName(),"d");
		assertEquals(myList.get(1).getName(),"c");
		assertEquals(myList.get(2).getName(),"b");
		assertEquals(myList.get(3).getName(),"a");
	}
	
	@Test
	public void sortListByDateAscending() {
		myList.add(new ListItem("d"));
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		myList.add(new ListItem("b"));
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myList.add(new ListItem("c"));
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myList.add(new ListItem("a"));
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myList.del("b");
		myList.add(new ListItem("b"));

		myList.sortByDateAscending();
		
		assertEquals(myList.get(0).getName(),"d");
		assertEquals(myList.get(1).getName(),"c");
		assertEquals(myList.get(2).getName(),"a");
		assertEquals(myList.get(3).getName(),"b");
		
	}
	@Test
	public void sortListByDateDescending() {
		myList.add(new ListItem("d"));
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		myList.add(new ListItem("b"));
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myList.add(new ListItem("c"));
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myList.add(new ListItem("a"));
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myList.del("b");
		myList.add(new ListItem("b"));

		myList.sortByDateDescending();
		
		assertEquals(myList.get(0).getName(),"b");
		assertEquals(myList.get(1).getName(),"a");
		assertEquals(myList.get(2).getName(),"c");
		assertEquals(myList.get(3).getName(),"d");
	}

}
