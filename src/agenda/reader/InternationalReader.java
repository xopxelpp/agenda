package agenda.reader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import agenda.International;

public class InternationalReader {
	
	private String ext;
	
	private static final String FILE_NAME = "internacional";
	
	public InternationalReader(String ext) {
		this.ext = ext;
	}

	public List<International> read() {
		File file = new File(FILE_NAME + "." + ext);
		List<International> words = new ArrayList<>(); 
		
		try(Scanner sc = new Scanner(file)) {
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine().trim();
				String[] value = line.split(";");
				
				if(value.length == 2) {
					International word = new International();
					word.setCode(value[0]);
					word.setValue(Arrays.asList(value[1].split(",")));
					
					words.add(word);
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return words;
	}
}
