package ie.gmit.studentmanager;

public class Student {
	private String studentName;
	private int studentAge;
	private String studentId;
	
	
	// getter and setters
	public void setStudentName(String name) {
		name = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentAge(int age) {
		age = studentAge;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	// constructor methods
	public Student(String sid) {
		this.studentId = sid;
	}
	public Student(String name,String sid) {
		this.studentId = sid;
		this.studentName = name;
	}
	public Student(String name, String sid, int age) {
		this.studentName = name;
		this.studentId = sid;
		this.studentAge = age;
		
	}

}// end Student class
