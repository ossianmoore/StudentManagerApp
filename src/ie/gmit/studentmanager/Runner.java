package ie.gmit.studentmanager;

public class Runner {

	public static void main(String[] args) {
		// create a menu object
		Menu menuObj1 = new Menu();
		// run the tart method of the menu object
		menuObj1.start();
	
		Student ex1 = new Student("student1", "nameMaybe");
		System.out.println(ex1.getStudentName() + " " + ex1.getStudentId());
		

	}// end main

 }// end class runner

// git commit test 2