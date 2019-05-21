package agenda;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Petition> petitionList = PetitionReader.read();
		
		System.out.println(petitionList.toString());

	}

}
