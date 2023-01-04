package SchoolManagementSystem;


public class Student {
	int id;
	String name;
	String className;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Student(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}
	
	public Student()
	{
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cls=" + className + "]";
	}	
}
