package collection_test;

public class Student {
	String Name;
	int Age;
	int ID;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Age=" + Age + ", ID=" + ID + "]";
	}


}
	


