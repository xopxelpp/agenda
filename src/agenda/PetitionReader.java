package agenda;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetitionReader {
	
	private static final String FILE_NAME = "peticions.txt";
	
	public static List<Petition> read() {
		
		File file = new File(FILE_NAME);
		List<Petition> petitions = new ArrayList<>();
		
		try(Scanner sc = new Scanner(file)) {
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] value = line.split(" ");
				
				Petition petition = new Petition();
				petition.setActivity(value[0]);
				petition.setSpace(value[1]);
				petition.setStartDate(new SimpleDateFormat("dd/MM/yyyy").parse(value[2]));
				petition.setEndDate(new SimpleDateFormat("dd/MM/yyyy").parse(value[3]));
				petition.setDays(value[4]);
				petition.setHours(value[5]);
				
				petitions.add(petition);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return petitions;
	}

}
