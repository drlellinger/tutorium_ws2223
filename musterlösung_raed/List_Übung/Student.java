package v10;

public class Student {
	
	private int age;
	private String name;
	private String fieldOfStudy;
	
	public Student(String name, int age, String fieldOfStudy) {
		this.name = name;
		this.age = age;
		this.fieldOfStudy = fieldOfStudy;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	
	@Override
	public String toString() {
		return name + "," + age + "," + fieldOfStudy;
	}
	
	
	}
