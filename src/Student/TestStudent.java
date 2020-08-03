package Student;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 입력 :");
		int N = sc.nextInt();
		sc.nextLine();
		Student[] stu = new Student[N];

		for (int i = 0; i < N; i++) {
			stu[i] = new Student();
			System.out.println(i + 1 + "번째 학생");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			stu[i].setName(name);
			System.out.print("과제 : ");
//			int homework =  Integer.parseInt(sc.nextLine());
			int homework =  sc.nextInt();
			stu[i].setAssingmentScore(homework);
			System.out.print("시험 : ");
//			int test =  Integer.parseInt(sc.nextLine());
			int test =  sc.nextInt();
			stu[i].setExamScore(test);
			sc.nextLine();

		}
		for (Student i : stu) {
			System.out.println(i);
		}
		sc.close();
	}

}
