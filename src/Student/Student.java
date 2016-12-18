package Student;

public class Student implements Comparable<Student> {
	private int age;

	public Student() {
		super();
	}

	public Student(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}

	// return 0 两者相等
	// return >0 a>b
	// return <0 a<b
	@Override
	public int compareTo(Student o) {
		return age - o.getAge();
	}
}
