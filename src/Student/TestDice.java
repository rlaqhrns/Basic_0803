package Student;


public class TestDice {
	public static void main(String[] args) {
		PairOfDice pod = new PairOfDice();
		Player player1 = new Player();
		Player player2 = new Player();
		pod.roll();
		player1.setTotal(pod);

		System.out.println("선수이름 : " + player1.getName() + "\n\t주사위 1: " + pod.getFacevalue1() + "\n\t주사위 2: "
				+ pod.getFacevalue2() + "\n\t점수: " + player1.getTotal());
	}
}
