package v10;


public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Alex",20,"MI");
		Student s2 = new Student("Klara",19,"BWL");
		Student s3 = new Student("Alex",19,"BWL");
		Student s4 = new Student("Klara",20,"Informatik");
		Student s5 = new Student("Sebastian",18,"MI");
		Student s6 = new Student("Anna",20,"WI");
		Student s7 = new Student("Alex",23,"WI");
//
//		Student[] students = {s1,s2,s3,s4,s5,s6,s7};
		
		
		Manager m = new Manager();
		m.addStudent(s1);
		m.addStudent(s2);
		m.addStudent(s3);
		m.addStudent(s4);
		m.addStudent(s5);
		m.addStudent(s6);
		m.addStudent(s7);
		
		
		m.printWithFilter(m.filterAfterName("Alex"));
		
	}

}
