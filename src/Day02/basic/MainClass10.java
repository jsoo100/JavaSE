package Day02.basic;
/*
 * 		switch ~ case 문 사용하기
 * 
 */
public class MainClass10 {
		public static void main(String[] args) {
				int num=1;
				switch(num) {
				case 0 :
						System.out.println("0 입니다.");
					break;
				case 1 :	
						System.out.println("1 입니다.");
						break;
				case 2 :
						System.out.println("2 입니다.");
						break;
				case 3 :	
						System.out.println("3 입니다.");
					break;
				default :
					System.out.println("0,1,2,3, 이 아닙니다.");
				break;
				}
				
		}
}