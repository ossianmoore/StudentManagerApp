package ie.gmit.studentmanager;

public class StudentManager {
	private static final int INITIAL_CAPACITY = 10;
	private Student[] students = null;

	public StudentManager() {
		students = new Student[INITIAL_CAPACITY];
	}

	public boolean add(Student student) {
		return false;
	}

	public boolean delete(String studentId) {
		return false;
	}

	public Student[] getStudentByFirstName(String firstName) {
		return null;
	}

	public int findTotalStudents() {
		return -1;
	}

}
