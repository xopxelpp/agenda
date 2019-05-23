package agenda.writer;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import agenda.Petition;

public class SpaceWriter {
	
	
	public static void write(List<Petition> petitionList) 
			throws CloneNotSupportedException, IOException {
		
		Map<String, List<String>> spaceMap = collect(petitionList);
		
		List<String> lines = new ArrayList<>();
		lines.add("hello");
		
		for(Map.Entry<String, List<String>> entry : spaceMap.entrySet()) {
			Path file = Paths.get(entry.getKey() + ".html");
			Files.write(file, entry.getValue(), Charset.forName("UTF-8"));
		}
	}

	private static Map<String, List<String>> collect(List<Petition> petitionList)
			throws CloneNotSupportedException {
		
		List<Petition> petitions = clonePetitions(petitionList);
		Map<String, List<String>> spaceMap = new HashMap<>();
		
		for(Petition petition : petitions) {
			String key = petition.getSpace();
			List<String> spaces = new ArrayList<>();
					
			for(Petition p : petitions) {
				if(key.equals(p.getSpace())) {
					spaces.add(p.toString());
				}
			}
			spaceMap.put(key, spaces);
		}
		return spaceMap;
	}
	
	private static List<Petition> clonePetitions(final List<Petition> petitions) 
			throws CloneNotSupportedException {
		
		List<Petition> clone = new ArrayList<>();
		for(Petition petition : petitions) {
			clone.add(petition.clone());
		}
		return clone;
	}

}
