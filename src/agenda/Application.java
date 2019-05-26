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
		
		InternationalReader translator = new InternationalReader(conf.getLengOut());

		
		
		SpaceWriter.write(conf, translator, petitionList);
	}

}
