package at.guigu.com;

public class TestClass {
	
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		System.out.println("TestGit");
		return "TestClass [name=" + name + ", age=" + age + "]";
	}
	
	
}
