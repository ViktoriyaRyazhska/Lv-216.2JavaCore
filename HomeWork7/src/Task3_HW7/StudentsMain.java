package Task3_HW7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsMain {
	
	private static void printSomeStudents(List<Student> students, Integer course) {
		Iterator<Student> stIterator = students.iterator();
		while(stIterator.hasNext()){
			Student student = (Student) stIterator.next();
			if(course.equals(student.getCourse())){
				System.out.println(student.getName());
			}
		}
	}

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Vasja", 12));
		list.add(new Student("Petja", 8));
		list.add(new Student("Olenka", 12));
		list.add(new Student("Ostap", 16));
		list.add(new Student("Katja", 9));
		list.add(new Student());
		printSomeStudents(list, 12);
		
		System.out.println("Compare by Name");
		list.sort(Student.compareByName());
		for(Student st: list){
			System.out.println(st);
		}
		
		System.out.println("Compare by Course");
		list.sort(Student.compareByCourse());
		for(Student st: list){
			System.out.println(st);
		}
		
		
	}

}
