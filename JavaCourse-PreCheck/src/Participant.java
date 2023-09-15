import java.util.ArrayList;
import java.util.List;

public class Participant {

	String name;
	String surname;
	int age;
	String sport;
	List<String> nationalAwards;
	List<String> internationalAwards;
	
	public Participant() {
		name = "";
		surname = "";
		age = 0;
		sport = "";
		nationalAwards = new ArrayList<String>();
		internationalAwards = new ArrayList<String>();
	}
	
	public Participant(String name, String surname, int age, String sport, List<String> nationalAwards, List<String> internationalAwards) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sport = sport;
		this.nationalAwards = nationalAwards;
		this.internationalAwards = internationalAwards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public List<String> getNationalAwards() {
		return nationalAwards;
	}

	public void setNationalAwards(List<String> nationalAwards) {
		this.nationalAwards = nationalAwards;
	}

	public List<String> getInternationalAwards() {
		return internationalAwards;
	}

	public void setInternationalAwards(List<String> internationalAwards) {
		this.internationalAwards = internationalAwards;
	}

	@Override
	public String toString() {
		// <name> <surname> (<age>) - <sport> Awards: <nationalAwards> - <internationalAwards>
		return this.name + " " + this.surname + " (" + this.age + ")" + " - " + sport + " Awards: " + this.nationalAwards.size() + " - " + this.internationalAwards.size();
	}
	
	
}
