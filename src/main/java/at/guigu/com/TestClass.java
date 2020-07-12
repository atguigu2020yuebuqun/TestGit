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
		System.out.println("TestGit3");
		System.out.println("TestGit");
		System.out.println("hot_fix");
		return "TestClass [name=" + name + ", age=" + age + "]";
	}
	
	
}
