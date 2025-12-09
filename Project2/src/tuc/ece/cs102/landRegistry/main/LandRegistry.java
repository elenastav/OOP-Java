package tuc.ece.cs102.landRegistry.main;

import tuc.ece.cs102.landRegistry.model.Property;
import tuc.ece.cs102.landRegistry.model.Title;
import tuc.ece.cs102.landRegistry.model.Owner;
import tuc.ece.cs102.landRegistry.model.Lot;
import tuc.ece.cs102.landRegistry.model.Flat;
import tuc.ece.cs102.landRegistry.model.DetachedHouse;
import tuc.ece.cs102.landRegistry.model.Business;
import tuc.ece.cs102.landRegistry.model.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class LandRegistry {
	private String name;
	private String URL;
	private EnhancedSortedList properties;
	private EnhancedSortedList owners;
	private EnhancedSortedList titles;
	
	public LandRegistry() {
		name = "LR";
		URL = "http://courses.ece.tuc.gr/";
		properties = new EnhancedSortedList();
		owners = new EnhancedSortedList();
		titles = new EnhancedSortedList();	
		
		properties.insert(new PropertyItem(new Lot(1000020010, "Αττικής", "Αθηναίων", 800, 180000, 0.5, "building lot", 600)));
		properties.insert(new PropertyItem(new Lot(1000020011, "Χανίων", "Χανίων", 700, 1100000, 0.5, "building lot", 400)));
		properties.insert(new PropertyItem(new Lot(1000020012, "Χανίων", "Ακρωτηρίου", 1100, 500000, 0.4, "parcel", 0)));
		properties.insert(new PropertyItem(new Flat(1000030030, "Ρεθύμνου", "Ρεθύμνου", 90, 170000, 2, "Κουντουριότου 3", 1977, "house", 2, 4)));
		properties.insert(new PropertyItem(new Flat(1000030031, "Αττικής", "Αθηναίων", 105, 180000, 2.5, "Πανόρμου 20", 2015, "house", 4, 5)));
		properties.insert(new PropertyItem(new Flat(1000030032, "Ηρακλείου", "Ηρακλείου", 150, 250000, 1.5, "Κνωσσού 12", 1990, "business", 0, 6)));
		properties.insert(new PropertyItem(new DetachedHouse(1000040040, "Λασιθίου", "Σητείας", 80, 100000, 1.7, "4ης Σεπτεμβρίου 2", 1991, "house", 1, 0)));
		properties.insert(new PropertyItem(new DetachedHouse(1000040041, "Χανίων", "Χανίων", 600, 500000, 1.5, "Προφήτη Ηλία 13", 2017, "house", 2, 100)));
	    properties.insert(new PropertyItem(new DetachedHouse(1000040042, "Αττικής", "Χαλανδρίου", 200, 300000, 1, "Αγίου Γεωργίου 15", 1980, "business", 1, 0)));
		
		try {
			owners.insert(new OwnerItem(new Person(123456789, "Νικόλαος Αραμπατζής", "Παπαφλέσσσα 2", new SimpleDateFormat("dd/MM/yyyy").parse("12/05/1978"))));
		} catch(ParseException e) {
			e.printStackTrace();
		}
		try {
			owners.insert(new OwnerItem(new Person(987456321, "Γεώργιος Μιχαήλ", "Μάνου 10", new SimpleDateFormat("dd/MM/yyyy").parse("15/01/1985"))));
		} catch(ParseException e) {
			e.printStackTrace();
		}
		try {
			owners.insert(new OwnerItem(new Person(741258963, "Ιοκάστη Μάνου", "Κτιστάκη 1", new SimpleDateFormat("dd/MM/yyyy").parse("13/11/1970"))));
		} catch(ParseException e) {
			e.printStackTrace();
		}
		try {
			owners.insert(new OwnerItem(new Person(236716384, "’ννα Κατράκη", "Τσόχα 7", new SimpleDateFormat("dd/MM/yyyy").parse("28/07/1990"))));
		} catch(ParseException e) {
			e.printStackTrace();
		}
		owners.insert(new OwnerItem(new Business(341345657, "Informix", "Παπαναστασίου 10", "Ελένη Δήμου")));
		owners.insert(new OwnerItem(new Business(423451241, "Superfood", "Σούτσου 20", "Μαρία Παππά")));
		
		Property p = searchForProperty(1000020010);
		Owner o = searchForOwner(123456789);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2000"), p, o, 50.0, "full");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000020010);
		o = searchForOwner(987456321);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2000"), p, o, 50, "full");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000020011);
		o = searchForOwner(123456789);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("01/06/2001"), p, o, 100, "full");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000020012);
		o = searchForOwner(741258963);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("20/09/2003"), p, o, 100, "full");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000030030);
		o = searchForOwner(236716384);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("24/11/2010"), p, o, 100, "full");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000030031);
		o = searchForOwner(236716384);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("26/08/2013"), p, o, 50, "bare");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000030032);
		o = searchForOwner(423451241);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("02/04/2017"), p, o, 100, "full");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000040040);
		o = searchForOwner(741258963);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("03/07/2016"), p, o, 100, "full");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000040041);
		o = searchForOwner(741258963);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("13/03/2005"), p, o, 100, "usufruct");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		p = searchForProperty(1000040042);
		o = searchForOwner(341345657);
		try {	
			Title t = new Title(new SimpleDateFormat("dd/MM/yyyy").parse("03/07/2016"), p, o, 100, "full");
			setRandomKT(t);
			addTitle(t);
			p.addPropertyTitle(t);
			o.addOwnerTitle(t);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
	
	public EnhancedSortedList getProperties() {
		return properties;
	}

	public void setProperties(EnhancedSortedList properties) {
		this.properties = properties;
	}

	public EnhancedSortedList getOwners() {
		return owners;
	}

	public void setOwners(EnhancedSortedList owners) {
		this.owners = owners;
	}

	public EnhancedSortedList getTitles() {
		return titles;
	}

	public void setTitles(EnhancedSortedList titles) {
		this.titles = titles;
	}

	public Property searchForProperty(int KA) {
		PropertyItem pItem = (PropertyItem)properties.search(KA);
		if(pItem != null) {
			return (Property)pItem.getData();
		} else {
			System.out.println("Property not found.");
			return null;
		}
	}
	
	public Owner searchForOwner(int afm) {
		OwnerItem oItem = (OwnerItem)owners.search(afm);
		if(oItem != null) {
			return (Owner)oItem.getData();
		} else {
			System.out.println("Owner not found.");
			return null;
		}
	}
	
	public void printPropertiesByCategory(String catClass) {
		properties.printItemsInHierarchy(catClass);
	}
	
	public void printPropertyTitles(int KA) {
		Property prop = searchForProperty(KA);
		if (prop != null) {
    	    prop.getPropertyTitles().printAllItems();
		} else {
			System.out.println("Couldn't print any titles");
		}
	}
	
	public void printOwnerTitles(int afm) {
		Owner own = searchForOwner(afm);
		if (own != null) {
    	    own.getOwnerTitles().printAllItems();
		} else {
			System.out.println("Couldn't print any titles");
		}
	}

	public void addProperty(Property prop) {
		properties.insert(new PropertyItem(prop));
	}
	
	public void addOwner(Owner own) {
		owners.insert(new OwnerItem(own));
	}
	
	public void addTitle(Title tit) {
		titles.insert(new TitleItem(tit));
	}
	
	public void addNewTitle(int afm, int KA, double percent, String type) {
		Owner own = searchForOwner(afm);
		Property prop = searchForProperty(KA);
		if (own != null && prop != null) {
			Title title = new Title(prop, own, percent, type);
			Date dateOfAcquirement = new Date();
			title.setDateOfAcquirement(dateOfAcquirement);
			this.setRandomKT(title);
			this.addTitle(title);
			prop.addPropertyTitle(title);
			own.addOwnerTitle(title);
		} else {
			System.out.println("Couldn't add title.");
		}
	}
	
	public void setRandomKT(Title t) {
		Random rand = new Random();
		int randInt = rand.nextInt(900) + 100;
		t.setKT(randInt);
	}
	
	public void estimateTotalValue(int afm) {
		Owner own = searchForOwner(afm);
		double tValue = own.getOwnerTitles().estimatePropertyValue();
		System.out.println("The total value of the properties of the owner " +own.getOwnerName() +" is: " +tValue);
	}

	public void estimateOwnENFIA(int afm) {
		Owner own = searchForOwner(afm);
		int enfia = (int) Math.round(own.getOwnerTitles().estimateOwnerENFIA());
		System.out.println("The ENFIA of the owner " +own.getOwnerName() +" is: " +enfia);
	}
}
