package domains;

public class UnavailableLecturePeriod {

	private String teacher;
	private Period period;
	
	public String getTeacher() {
		return teacher;
	}
	public Period getPeriod() {
		return period;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return teacher + "@" + period;
	}
}
