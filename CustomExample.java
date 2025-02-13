package javacollection;

import java.util.ArrayList;

public class CustomExample {

	public static void main(String[] args) {
		ArrayList<student> students = new ArrayList<student>();
		students.add(new student("Tushar-Kumar",1,"MCA"));
		students.add(new student("Vikas-Singh",2,"MCA"));
		students.add(new student("Vaibhav",3,"MCA"));
		students.add(new student("Sneha",4,"MCA"));
		students.add(new student("Ayushi",5,"MCA"));
		`
		for(student s:students) {
			System.out.println(s);
		}
	}

}
//create class
class student{
	String name;
	int roll_no;
	String course;
	
	public student(String name, int roll_no, String course) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.course = course;
	}
	// Encapsulation generate getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	//tostringmethod
	@Override
	public String toString() {
		return "student [name=" + name + ", roll_no=" + roll_no + ", course=" + course + "]";
	}
	
}
