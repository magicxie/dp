package domains;

import java.util.List;

public class Course {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return courseName + "{" + teacher + "}";
	}
	
	private String courseName;
	private int totalHours;
	private int hoursPerWeek;
	private List<Lecture> lecturs;
	private int studentSize;
	private String teacher;
	
	public int getTotalHours() {
		return totalHours;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public List<Lecture> getLecturs() {
		return lecturs;
	}
	public int getStudentSize() {
		return studentSize;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public void setLecturs(List<Lecture> lecturs) {
		this.lecturs = lecturs;
	}
	public void setStudentSize(int studentSize) {
		this.studentSize = studentSize;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
