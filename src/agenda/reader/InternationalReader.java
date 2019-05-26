package agenda.reader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import agenda.International;

public class InternationalReader {
	
	private String ext;
	private List<International> words;
	
	private static final String FILE_NAME = "internacional";
	
	public InternationalReader(String ext) {
		this.ext = ext;
		read();
	}
	
	public String getMonth(int month) {
		for(International word : words) {
			if("004".equals(word.getCode())) {
				return word.getValue().get(month-1);
			}
		}
		return "";
	}
	
	public String getError() {
		for(International word : words) {
			if("008".equals(word.getCode())) {
				return word.getValue().get(0);
			}
		}
		return "";
	}

	private void read() {
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
		
		this.words = words;
	}
	
	
}
