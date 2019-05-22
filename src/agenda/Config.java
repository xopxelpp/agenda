package agenda;

public class Config {
	private int year;
	private int month;
	private String lengIn;
	private String lengOut;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getLengIn() {
		return lengIn;
	}
	public void setLengIn(String lengIn) {
		this.lengIn = lengIn;
	}
	public String getLengOut() {
		return lengOut;
	}
	public void setLengOut(String lengOut) {
		this.lengOut = lengOut;
	}
	@Override
	public String toString() {
		return "Config [year=" + year + ", month=" + month + ", lengIn=" + lengIn + ", lengOut=" + lengOut + "]\n";
	}
	
	

}
