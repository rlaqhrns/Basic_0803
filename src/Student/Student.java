package Student;

public class Student {
	String name;
	int assingmentScore;
	int examScore;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAssingmentScore() {
		return assingmentScore;
	}

	public void setAssingmentScore(int assingmentScore) {
		this.assingmentScore = assingmentScore;
	}

	public int getExamScore() {
		return examScore;
	}

	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}

	public String getGrade() {
		double total = getExamScore() * 0.6 + getAssingmentScore() * 0.4;
		String grade;
		if (total > 90) {
			grade = "A";
		} else if (total > 80) {
			grade = "B";
		} else if (total > 70) {
			grade = "C";
		} else if (total > 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
	@Override
	public String toString() {
		String result;
		result = "이름 : "+getName()+"\n과제 점수 : "+getAssingmentScore()+"\n시험점수 : "+getExamScore()+"\n학점 : "+getGrade();
		return result;
	}

}
