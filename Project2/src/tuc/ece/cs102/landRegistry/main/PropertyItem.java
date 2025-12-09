package tuc.ece.cs102.landRegistry.main;

import tuc.ece.cs102.list.Item;
import tuc.ece.cs102.landRegistry.model.Property;

public class PropertyItem extends Item {
	private Property property;

	public PropertyItem(Property iprop) {
		this.property = iprop;
	}

	public Object key() {
		return property.getKA();

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
		return property.toString();

	}

	public void print() {
		property.print();
	}
	
	public Object getData(){
		return this.property;
	}

}
