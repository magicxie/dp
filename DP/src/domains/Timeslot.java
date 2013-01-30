package domains;

public class Timeslot {

	private int code;
	private String name;
	
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
