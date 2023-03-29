import java.util.Scanner;
public class beijing {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
	    double totalScore = 0;
	    int passNum = 0;
		
		for( int i = 1; i <= 3; i++) {
		double sum1 = 0;
		for(int j = 1; j <= 5; j++) {
			System.out.println("请输入第" +i+ "个班学生的第" +j+ "个学生的成绩");
			double score = myScanner.nextDouble(); 
			if (score >= 60) {
				passNum++;
			}
			sum1 += score;
			System.out.println("成绩为" + score);
		}
		System.out.println("成绩总和为" + sum1 + " 成绩平均值为" + sum1 / 5);
		totalScore += sum1;
	    }
		System.out.println("三个班的总分是" + totalScore + "三个班的平均分是" + totalScore / 15);
		System.out.println("及格的人数为" +passNum+ "人");
   }
}