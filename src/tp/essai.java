package tp;



public class essai {
 private String name ;
 private int age;
 private int salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "essai [name=" + name + ", age=" + age + ", salary=" + salary + "]";
}

}
