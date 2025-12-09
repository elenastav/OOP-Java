package tuc.ece.cs102.landRegistry.model;

import tuc.ece.cs102.landRegistry.main.OwnerTitlesList;
import tuc.ece.cs102.landRegistry.main.TitleItem;

public abstract class Owner {
	protected int afm;
	protected String ownerName;
	protected OwnerTitlesList ownerTitles;
	
	public Owner(int afm, String name) {
		this.afm = afm;
		ownerName = name;
		ownerTitles = new OwnerTitlesList();
	}

	public int getAfm() {
		return afm;
	}

	public void setAfm(int afm) {
		this.afm = afm;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public OwnerTitlesList getOwnerTitles() {
		return ownerTitles;
	}

	public abstract void print();

    public abstract String toString();
    
    public void addOwnerTitle(Title tit) {
    	if (tit != null) {
    		ownerTitles.insert(new TitleItem(tit));
    	} else {
    		System.out.println("Title not found.");
    	}
	}
    
}
