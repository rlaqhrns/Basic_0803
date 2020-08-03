package Student;

public class PairOfDice {
	int faceValue1;
	int faceValue2;
	
	PairOfDice(){
		this(1,1);
	}
	PairOfDice(int faceValue1,int faceValue2){
		this.faceValue1 = faceValue1;
		this.faceValue2 = faceValue2;
	}
	public void roll() {
		this.faceValue1 = (int)(Math.random()*6+1);
		this.faceValue2 = (int)(Math.random()*6+1);
	}
	public int getFacevalue1() {
		return this.faceValue1;
	}
	public int getFacevalue2() {
		return this.faceValue2;
	}
}
