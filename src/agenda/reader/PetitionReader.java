package agenda.reader;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import agenda.Petition;

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
				petition.setStartDate(LocalDate.parse(value[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				petition.setEndDate(LocalDate.parse(value[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
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
