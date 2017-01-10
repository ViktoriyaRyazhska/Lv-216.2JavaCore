package homework6;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Student {
	private String name;
	private int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void printStudents(List<Student> students, Integer course) {
		Iterator<Student> it = students.iterator();
		Student student = new Student();
		while (it.hasNext()) {
			student = it.next();
			if (student.getCourse() == course) {
				System.out.println("Name " + student.getName());
			}
		}
	}

	public static class NameComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return ((Student) o1).name.compareTo(((Student) o2).name);
		}
	}

	public static class CourseComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.course - o2.course;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public static void main(String[] args) {
		Student student = new Student();
		List<Student> list = new ArrayList<Student>();

		list.add(new Student("Vasia", 3));
		list.add(new Student("Dima", 5));
		list.add(new Student("Roma", 3));
		list.add(new Student("Igor", 4));
		list.add(new Student("Andriy", 2));
		System.out.println("Students of course 3");
		student.printStudents(list, 3);

		System.out.println("Sorting by name");
		list.sort(new NameComparator());
		for (Student st : list) {
			System.out.println(st);
		}
		System.out.println("Sorting by course");
		list.sort(new CourseComparator());
		for (Student st : list) {
			System.out.println(st);
		}

	}

}
