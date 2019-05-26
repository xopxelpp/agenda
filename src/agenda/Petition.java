package agenda;

import java.time.LocalDate;

public class Petition implements Cloneable {
	private String activity;
	private String space;
	private LocalDate startDate;
	private LocalDate endDate;
	private String days;
	private String hours;
	
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return "Petition [activity=" + activity + ", space=" + space + ", startDate=" + startDate + ", endDate="
				+ endDate + ", days=" + days + ", hours=" + hours + "]";
	}
	
	public Petition clone()throws CloneNotSupportedException{  
        return (Petition)super.clone();  
    }
	
}
