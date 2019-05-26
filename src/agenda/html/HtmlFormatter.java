package agenda.html;

public class HtmlFormatter {
	
	public static String h1(String value) {
		return "<h1>" + value + "</h1>";
	}
	
	public static String h2(String value) {
		return "<h2>" + value + "</h2>";
	}
	
	public static String head() {
		return "<head>\r\n" + 
				"  <title>\r\n" + 
				"    Agenda\r\n" + 
				"  </title>\r\n" + 
				"  <style>\r\n" + 
				"    table, th, td {\r\n" + 
				"      border: 1px solid black;\r\n" + 
				"      border-collapse: collapse;\r\n" + 
				"    }\r\n" + 
				"  </style>\r\n" + 
				"</head>";
	}
	
	public static String startHtml() {
		return "<!DOCTYPE html>\r\n" + 
				"<html>";
	}
	
	public static String endHtml() {
		return "</html>";
	}

}
