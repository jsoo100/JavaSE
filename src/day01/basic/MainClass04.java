package day01.basic;

/*
 *  [[ 기본형 ]]
 * 4. 실수형
 *  - 선언하는 방법
 * 	float 변수명;
 * 	double 변수명;
 * 	float(4byte) < double(8byte)
 * 
 */

public class MainClass04 {

	public static void main(String[] args) {
			// 실수형 변수 선언과 동시에 값 대입하기
			float iFloat = 10.1f;
			double iDouble = 10.1d;
			double iDouble2 = 10.1; // double형 d 는 생략가능
			
			System.out.println("florat 형 :" + iFloat);
			System.out.println("double 형" + iDouble);
			System.out.println("double 형" + iDouble2);
			
	}	
}
