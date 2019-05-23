package agenda.reader;

import java.io.File;
import java.util.Scanner;

import agenda.Config;

public class ConfigReader {
	
	private static final String FILE_NAME = "config.txt";
	
	public static Config read() {
		
		File file = new File(FILE_NAME);
		Config conf = new Config();
		
		try(Scanner sc = new Scanner(file)) {
			
			String[] line1 = sc.nextLine().split(" ");
			conf.setYear(Integer.parseInt(line1[0]));
			conf.setMonth(Integer.parseInt(line1[1]));
			
			String[] line2 = sc.nextLine().split(" ");
			conf.setLengIn(line2[0]);
			conf.setLengOut(line2[1]);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conf;
	}

}
