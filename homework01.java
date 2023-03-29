public class homework01 {
	public static void main(String[] args) {
		
		double money = 100000;
		int count1 = 0;
		int count2 =0;
		if(money >= 50000) {
		while(money >= 50000) { 
			money = money - money * 0.05;
			System.out.println("剩余金钱为" + money);
			count1++;
					
					double money1 = money;
					if(money1 <= 50000) { 
					while(money1 >=1000) {
					money1 = money1 - 1000;
					System.out.println("剩余金钱为" + money1);
					count2++;
						}
					}
				}
			}
		int count = count1 + count2;
		System.out.println("已经过" + count + "次");
		}
	}