
package Assignment6;

public class Person {

	final String name = "Ketan";

	final int age = 22;

	public String getName() {

		return name;

	}

	public int getAge() {

		return age;

	}

	@Override

	public String toString() {

		return "Person [name=" + name + ", age=" + age + "]";

	}

	public static void main(String[] args) {

		Person person = new Person();

		System.out.println(person.age);

		System.out.println(person.name);

		System.out.println(person.getName());

		System.out.println(person);

	}

}