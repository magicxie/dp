package domains;

public class Day {

	private int code;
	private String day;
	
	public int getCode() {
		return code;
	}
	public String getDay() {
		return day;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day;
	}
}
