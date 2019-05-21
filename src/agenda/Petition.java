package agenda;

import java.util.Date;

public class Petition {
	private String activity;
	private String space;
	private Date startDate;
	private Date endDate;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
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
				+ endDate + ", days=" + days + ", hours=" + hours + "]\n";
	}
	
}
