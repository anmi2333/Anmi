public class MiGong {
	public static void main(String[] args) {
	//先创建迷宫用二维数组表示 int[][] map = new int [8][7]
	//先规定 map 数组的元素值: 0 表示可以走 1 :表示障碍物
		int[][] map = new int [8][7];
	//将最上面的一行最下面的一行，全部设置为1
		for(int i = 0; i < 7; i++) {
			map[0][i] = 1;  
			map[7][i] = 1;
		}
		for(int i = 0; i < 8; i++) {	
			map[i][0] = 1;
			map[i][6] = 1;
		}
			map[3][1] = 1;
			map[3][2] = 1;
			
		//输出当前地图
		System.out.println("=====当前地图情况=====");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
			//使用findway给老鼠找路
		Abb t1 = new Abb();
		t1.findway(map, 1, 1);
			
		System.out.println("\n=====找路的情况如下=====");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
				System.out.println();
			}
		}
	}


class Abb{
	//1,使用递归回溯思想来解决老鼠走迷宫
	//2,findway方法就是专门找出迷宫的路径
	//3,如果找到，就返回true，否则就返回false
	//4,map就是二维数组,即表示迷宫 i，j是老鼠的位置 初始化位置为 (1,1)
	//5,因为我们是递归找路，所以我先规定 map数组的各个值的含义
	//6,0表示可以走 1 表示障碍物 2表示可以走 3表示走过 走不桶是死路
	//7.当map[6][5]=2就说明找到通路就退出 否则就继续找
	//8.确定老鼠找路的策略下 ＞ 右　＞　上　＞ 左
 	public boolean findway(int[][] map, int i, int j) {
 		if(map[6][5] == 2) {//说明已经找到路了
 			return true;
 		} else {
 			if(map[i][j] == 0) {//当前位置0，说明
 				//假定可以走通
 				map[i][j] = 2;
 				//使用找路策略,来确定该位置是否真的可以走通
 				//策略下 ＞ 右　＞　上　＞ 左
 				if(findway(map, i + 1, j)) {//先走下
 					return true;
 				}else if(findway(map, i, j + 1)) {//向右
 					return true;
 				}else if(findway(map, i - 1, j)) {//向上
 					return true;
 				}else if(findway(map, i, j - 1)) {//向左
 					return true;
 				}else {
 					map[i][j] = 3;
 					return false;
 				}
 			} else { //map[i][j] = 1,2,3  		
 				return false;
 			}
 		}
 	}
}


 


