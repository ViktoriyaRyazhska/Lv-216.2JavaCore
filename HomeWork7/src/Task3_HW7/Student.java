package Task3_HW7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Student {
	private String name;
	private Integer course;
	
	Student(){
		Random random = new Random();
		this.name = "Name_"+ Integer.toString(random.nextInt(100));
		this.course = random.nextInt(100);
	}
	
	Student(String name, Integer course){
		this.name = name;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(Integer course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [name = " + name + " , course = " + course + "]";
	}

	public void printStudentsOfCourse(List<Student> students, Integer course){
		Iterator<Student> stIterator = students.iterator();
		while(stIterator.hasNext()){
			Student student = (Student) stIterator.next();
			if(course.equals(student.getCourse())){
				System.out.println(student.getName());
			}
		}
	}
	
	public static Comparator<Student> compareByName() {
		NameComparator name_comparator = new NameComparator();
		return name_comparator;
	}
	
	public static Comparator<Student> compareByCourse() {
		CourseComparator course_comparator = new CourseComparator();
		return course_comparator;
	}
	
}
