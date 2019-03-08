package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyList {

	private List<ListItem> myList;

	public MyList() {
		myList = new ArrayList<ListItem>();
	}

	public void add(ListItem item) {
		if (item == null) {
			return;
		}
		myList.add(item);
	}

	public void del(String name) {
		if (name == null) {
			return;
		}
		for (ListItem i : new ArrayList<>(myList)) {
			if (i.getName().equals(name)) {
				myList.remove(i);
				return;
			}
		}
	}
	
	public List<ListItem> viewList()
	{
		return myList;
	}
	
	public void checkOffItem(String name)
	{
		for (ListItem i : new ArrayList<>(myList)) {
			if (i.getName().equals(name)) {
				i.setItemAsChecked(true);
				return;
			}
		}
	}

	public ListItem get(int i) {
		if (i < 0) {
			return null;
		}
		if (i >= myList.size()) {
			return null;
		}
		return myList.get(i);
	}

	public Object size() {
		return myList.size();
	}

	public void sortByItemAscending() {
		myList.sort(new Comparator<ListItem>() {

			@Override
			public int compare(ListItem o1, ListItem o2) {
				return o1.compareName(o2);
			}
		});

	}

	public void sortByItemDescending() {
		myList.sort(new Comparator<ListItem>() {

			@Override
			public int compare(ListItem o1, ListItem o2) {
				return -1 * o1.compareName(o2);
			}
		});

	}

	public void sortByDateAscending() {
		myList.sort(new Comparator<ListItem>() {

			@Override
			public int compare(ListItem o1, ListItem o2) {
				return o1.compareDate(o2);
			}
		});

	}

	public void sortByDateDescending() {
		myList.sort(new Comparator<ListItem>() {

			@Override
			public int compare(ListItem o1, ListItem o2) {
				return -1 * o1.compareDate(o2);
			}
		});
	}

}
