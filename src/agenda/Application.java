package agenda;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Config conf = ConfigReader.read();
		System.out.println(conf.toString());
		
		List<Petition> petitionList = PetitionReader.read();
		System.out.println(petitionList.toString());
		
		InternationalReader reader = new InternationalReader(conf.getLengIn());
		List<International> wordsList = reader.read();
		System.out.println(wordsList.toString());
		
	}

}
