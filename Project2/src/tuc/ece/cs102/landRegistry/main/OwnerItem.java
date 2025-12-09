package tuc.ece.cs102.landRegistry.main;

import tuc.ece.cs102.list.Item;
import tuc.ece.cs102.landRegistry.model.Owner;

public class OwnerItem extends Item {
	private Owner owner;

	public OwnerItem(Owner iown) {
		this.owner = iown;
	}

	public Object key() {
		return owner.getAfm();

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
		return owner.toString();

	}

	public void print() {
		owner.print();
	}
	
	public Object getData(){
		return this.owner;
	}

}
