package tuc.ece.cs102.landRegistry.main;

import tuc.ece.cs102.list.Item;
import tuc.ece.cs102.landRegistry.model.Title;

public class TitleItem extends Item {
	private Title title;

	public TitleItem(Title itit) {
		this.title = itit;
	}

	public Object key() {
		return title.getKT();

	}

	public boolean equals(Item o) {
		return key().equals(o.key());

	}

	public boolean less(Item o) {
		if (((Integer) key()).compareTo((Integer) o.key()) < 0)
			return true;
		return false;

	}

	public String toString() {
		return title.toString();

	}

	public void print() {
		title.print();
	}
	
	public Object getData(){
		return this.title;
	}


}
