package agenda.html;

import java.util.ArrayList;
import java.util.List;

public class HtmlTable {
	
	private List<Tr> trs = new ArrayList<>();
	
	public void addTr(Tr tr) {
		trs.add(tr);
	}
	
	public String toString() {
		String resultTr = "";
		for(Tr tr : trs) {
			resultTr = resultTr + tr.toString();
		}
		return "<table>" + resultTr + "</table>";
	}
}
