package agenda.writer;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import agenda.Config;
import agenda.Petition;
import agenda.html.HtmlFormatter;
import agenda.html.HtmlTable;
import agenda.html.Td;
import agenda.html.Tr;
import agenda.reader.InternationalReader;

public class SpaceWriter {
	
	
	public static void write(Config conf, InternationalReader translator, List<Petition> petitionList) 
			throws CloneNotSupportedException, IOException {
		
		Map<String, List<Petition>> spaceMap = collect(petitionList);

		LocalDate dateConf = LocalDate.of(conf.getYear(), conf.getMonth(), 1);
		
		for(Map.Entry<String, List<Petition>> entry : spaceMap.entrySet()) {
			String fileName = entry.getKey() + ".html";
			
			try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
				
				writer.println(HtmlFormatter.startHtml());
				writer.println(HtmlFormatter.head());
				writer.println(HtmlFormatter.h1(entry.getKey()));
				writer.println(HtmlFormatter.h2(
						translator.getMonth(dateConf.getMonthValue())
						+ " " + dateConf.getYear()));
				
				HtmlTable table = new HtmlTable();
				
				for(Petition petition : entry.getValue()) {
					
					if (petition.getStartDate().getMonth().equals(dateConf.getMonth())
							|| petition.getEndDate().getMonth().equals(dateConf.getMonth())) {
						

						Tr tr = new Tr();
						tr.addTd(new Td(petition.getActivity()));
						tr.addTd(new Td(petition.getSpace()));
						tr.addTd(new Td(petition.getStartDate().toString()));
						tr.addTd(new Td(petition.getEndDate().toString()));
						tr.addTd(new Td(petition.getDays()));
						tr.addTd(new Td(petition.getHours()));
						
						table.addTr(tr);
					}
				}
				writer.println(table.toString());
				writer.println(HtmlFormatter.endHtml());
			}
		}
	}
	
	
	

	private static Map<String, List<Petition>> collect(List<Petition> petitionList)
			throws CloneNotSupportedException {
		
		List<Petition> petitions = clonePetitions(petitionList);
		Map<String, List<Petition>> spaceMap = new HashMap<>();
		
		for(Petition petition : petitions) {
			String key = petition.getSpace();
			List<Petition> spaces = new ArrayList<>();
					
			for(Petition p : petitions) {
				if(key.equals(p.getSpace())) {
					spaces.add(p);
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
