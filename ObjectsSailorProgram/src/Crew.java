import java.util.ArrayList;

public class Crew {

	private ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

	public Crew() {

	}

	public void addCrewMember(Sailor sailor) {

		sailorList.add(sailor);

	}

	public String toString() {
		
		String list = "";
		
		for (Sailor sailorObject : sailorList) {

		list += sailorObject.getName() + " (" + sailorObject.getEmail() + ") \n" ;
		
		}
		
		return list;
	}

}
