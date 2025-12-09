package tuc.ece.cs102.landRegistry.main;

import tuc.ece.cs102.list.Item;
import tuc.ece.cs102.list.Node;
import tuc.ece.cs102.list.SortedList;

public class EnhancedSortedList extends SortedList {
	
	public EnhancedSortedList() {
		super();
	}
	
	public Item search(int key){
		Node tmpNode = head;
		while (tmpNode != null){
			if (tmpNode.getValue().key().equals(new Integer(key))){
				return tmpNode.getValue();
			}
			tmpNode = tmpNode.getNext();
		}
		return null;
	}
	
	public void printItemsInHierarchy(String className){
		Node tmp = head;
		try{
			while (tmp!=null){
				Item item = tmp.getValue();				
				if (Class.forName(className).isInstance(item.getData())){
					item.print();
				}
				tmp = tmp.getNext();
			}
		}catch (ClassNotFoundException ex){
			System.out.println("This class "+className+" does not exist...");
		}		
	}
	
	public void printAllItems() {
		Node tmp = head;
		while (tmp!=null){
			Item item = tmp.getValue();				
			item.print();
			tmp = tmp.getNext();
		}
	}
}
