package tuc.ece.cs102.landRegistry.main;

import tuc.ece.cs102.landRegistry.model.Title;
import tuc.ece.cs102.list.Item;
import tuc.ece.cs102.list.Node;

public class OwnerTitlesList extends EnhancedSortedList {
	
	public OwnerTitlesList() {
		super();
	}
	
	public double estimatePropertyValue() {
		Node tmp = head;
		double sum = 0.0;
		while (tmp != null){
			Item item = tmp.getValue();
			sum += ((Title)item.getData()).getProperty().getPropValue();
			tmp = tmp.getNext();
		}
		return sum;
	}
	
	public double estimateOwnerENFIA() {
		Node tmp = head;
		double sum = 0.0;
		while(tmp != null) {
			Item item = tmp.getValue();
			sum += ((Title)item.getData()).estimateTitleENFIA();
			tmp = tmp.getNext();
		}
		return sum;
	}
}
