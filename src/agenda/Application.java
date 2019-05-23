package agenda;

import java.io.IOException;
import java.util.List;

import agenda.reader.ConfigReader;
import agenda.reader.InternationalReader;
import agenda.reader.PetitionReader;
import agenda.writer.SpaceWriter;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException, IOException {
		
		Config conf = ConfigReader.read();
		System.out.println(conf.toString());
		
		List<Petition> petitionList = PetitionReader.read();
		System.out.println(petitionList.toString());
		
		InternationalReader reader = new InternationalReader(conf.getLengIn());
		List<International> wordsList = reader.read();
		System.out.println(wordsList.toString());
		
		
		SpaceWriter.write(petitionList);
	}

}
