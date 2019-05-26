package agenda.html;

import java.util.ArrayList;
import java.util.List;

public class Tr {
	private List<Td> tds = new ArrayList<>();
	
	public void addTd(Td td) {
		tds.add(td);
	}
	
	@Override
	public String toString() {
		String result = "";
		for(Td td : tds) {
			result = result + td.toString();
		}
		return "<tr>" + result + "</tr>";
	}

}
