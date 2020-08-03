package Student;

import java.util.Scanner;

public class Player {
	String name;
	int total;
	
	Scanner sc = new Scanner(System.in);
	
	Player(){
		System.out.print("선수 이름 입력 : ");
		setName(sc.next());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.total = 0;
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(PairOfDice pod) {
		this.total = pod.faceValue1 + pod.faceValue2;
	}
}
