public class VarParameterExercise {
	public static void main(String[] args) {
	
		HspMethod hm = new HspMethod();
		System.out.println(hm.showScore("milan" , 90.1, 80.0));
	}
}

class HspMethod {
	public String showScore(String name ,double... scores ) {
		
		double totalScore = 0;
		for(int i = 0; i < scores.length;i++) {
			totalScore += scores[i];
		}
		return name + "有" + scores.length + "门课" + "成绩总分为=" + totalScore;
	}
}