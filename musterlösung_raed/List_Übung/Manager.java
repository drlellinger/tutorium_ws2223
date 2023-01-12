package v10;
import java.util.*;

import java.util.List;

public class Manager {

	private List<Student> studentList;
	
	public Manager(){
		studentList = new LinkedList<>();
	}
	
	public void addStudent(Student s) {
		studentList.add(s);
	}
	
	/*
	 * for-each loop
	 * for(Datentyp e: Datenstruktur)
	 * do sth with e
	 */
	
	public void print() {
		for(Student s : studentList) {
			System.out.println(s);
		}
	}
	
	public void printWithFilter(List<Student>studentList) {
		for(Student s : studentList) {
			System.out.println(s);
		}
	}
	
	
	
	public List<Student> filterAfterName(String name){
		List <Student> result = new LinkedList<>();
		for(Student s: studentList) {
			if(s.getName().equals(name)) {
				result.add(s);
			}
		}
		return result;
 	}
	
	
}
