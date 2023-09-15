import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> 	p1_nationalAwards 		= new ArrayList<String>(Arrays.asList("National Award #1", "National Award #2")),
						p1_internationalAwards 	= new ArrayList<String>(Arrays.asList("International Award #1")),
						p2_nationalAwards 		= new ArrayList<String>(Arrays.asList("National Award #3")),
						p2_internationalAwards 	= new ArrayList<String>(Arrays.asList("International Award #2", "International Award #3")),
						p3_nationalAwards 		= new ArrayList<String>(),
						p3_internationalAwards 	= new ArrayList<String>(Arrays.asList("International Award #4")),
						p4_nationalAwards 		= new ArrayList<String>(Arrays.asList("National Award #4", "National Award #5", "National Award #6")),
						p4_internationalAwards 	= new ArrayList<String>(Arrays.asList("International Award #5")),
						p5_nationalAwards 		= new ArrayList<String>(),
						p5_internationalAwards 	= new ArrayList<String>(Arrays.asList("International Award #6")),
						p6_nationalAwards 		= new ArrayList<String>(),
						p6_internationalAwards 	= new ArrayList<String>(),
						p7_nationalAwards 		= new ArrayList<String>(Arrays.asList("National Award #7", "National Award #8")),
						p7_internationalAwards 	= new ArrayList<String>(Arrays.asList("International Award #7", "International Award #8", "International Award #9")),
						p8_nationalAwards 		= new ArrayList<String>(Arrays.asList("National Award #9")),
						p8_internationalAwards 	= new ArrayList<String>(Arrays.asList("International Award #10"));
		
		Participant p1 = new Participant("name1", "surname1", 24, "Basketball", p1_nationalAwards, p1_internationalAwards),
					p2 = new Participant("name2", "surname2", 22, "Basketball", p2_nationalAwards, p2_internationalAwards),
					p3 = new Participant("name3", "surname3", 26, "Basketball", p3_nationalAwards, p3_internationalAwards),
					p4 = new Participant("name4", "surname4", 25, "Football", p4_nationalAwards, p4_internationalAwards),
					p5 = new Participant("name5", "surname5", 25, "Tennis", p5_nationalAwards, p5_internationalAwards),
					p6 = new Participant("name6", "surname6", 26, "Tennis", p6_nationalAwards, p6_internationalAwards),
					p7 = new Participant("name7", "surname7", 21, "Football", p7_nationalAwards, p7_internationalAwards),
					p8 = new Participant("name8", "surname8", 20, "Baseball", p8_nationalAwards, p8_internationalAwards);
		
		Participant[] arr_participants = {p1, p2, p3, p4, p5, p6, p7, p8};
		
		selectParticipantsBySport(arr_participants, "Tennis");
		selectParticipantsBySport(arr_participants, "Basketball");
		
		selectParticipantsByNationalAwards(arr_participants, 1);
		selectParticipantsByNationalAwards(arr_participants, 2);
		
		selectParticipantsByInternationalAwards(arr_participants, 1);
		selectParticipantsByInternationalAwards(arr_participants, 2);
		

				
	}
	
	public static void selectParticipantsBySport(Participant[] arr_participants, String sport) {
		System.out.println("Participants Selected By The Sport: " + sport);
		for (Participant p : arr_participants) {
			if(sport.equals(p.getSport())) {
				System.out.println(p.toString());
			}
		}
		System.out.println();
	}
	
	public static void selectParticipantsByNationalAwards(Participant[] arr_participants, int minAward) {
		System.out.println("Participants Selected By The Minimum Number of National Awards: " + minAward);
		for (Participant p : arr_participants) {
			if(minAward <= p.getNationalAwards().size()) {
				System.out.println(p.toString());
			}
		}
		System.out.println();
	}
	
	public static void selectParticipantsByInternationalAwards(Participant[] arr_participants, int minAward) {
		System.out.println("Participants Selected By The Minimum Number of International Awards: " + minAward);
		for (Participant p : arr_participants) {
			if(minAward <= p.getInternationalAwards().size()) {
				System.out.println(p.toString());
			}
		}
		System.out.println();
	}

}
