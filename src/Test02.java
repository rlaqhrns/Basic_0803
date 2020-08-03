
public class Test02 {

	public static void main(String[] args) {
		Person p1 = new Person("A", 10);
		Person p2 = new Person("A", 10);
		Person p3 = new Person();
		Person p4 = new Person();
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p3 == p4);
		System.out.println(p3.equals(p4));
	}

}
