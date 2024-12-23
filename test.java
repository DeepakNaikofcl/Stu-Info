class Student{
	
	int id;
	String name;
	int Year;
	String Branch;
	
	
	
	public Student(int id, String name, int year, String branch) {
		super();
		this.id = id;
		this.name = name;
		Year = year;
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Year=" + Year + ", Branch=" + Branch + "]";
	}
	
}

public class test {

	public static void main(String[] args) {

		Student s1 = new Student(01,"Deepak",3,"CSG");
		System.out.println(s1);
		Student s2 = new Student(02,"Venu",3,"CSG");
		System.out.println(s2);
		Student s3 = new Student(03,"Mani",3,"CSG");
		System.out.println(s3);
		Student s4 = new Student(04,"Lalith",3,"CSG");
		System.out.println(s4);
		
	}

}