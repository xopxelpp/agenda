package agenda.html;

public class Td {
	private String value;

	public Td(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "<td>" + value + "</td>";
	}
}
