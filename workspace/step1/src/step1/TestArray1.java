package step1;

public class TestArray1 {

	public static void main(String[] args) {
		// 1. 배열 선언
		// int []ages;
		// 2. 배열 생성
		int[] ages = new int[3];
		// ages=new int[3];
		System.out.println(ages); // 배열 객체 주소값
		System.out.println(ages[0]); // 기본 초기값 0-> String 선언시는null
		System.out.println(ages.length); // 3
		// 3. 할당 : 인덱스는 0부터 시작
		ages[0] = 12;
		ages[1] = 22;
		ages[2] = 32;
		System.out.println(ages[2]);// 32
		System.out.println("for 이용 전체 나이 출력");
		// for loop를 이용하여 배열 요소의 나이를 모두 출력
		// 총길이는 ages.length로 구할수있다.
		// system.out.println(ages[3]);
		// -->범위 초과로 Exception 발생(0~2까지만 배열 존재)
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println("ages 배열에서 20대 이상만 출력");
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] >= 20) {
				System.out.println(ages[i]);
			} // if
		} // for
	}// main
}// class

// int[] ages =new int[3];
//
// sysout (ages);
// sysout (ages[0];
// sysout (ages.length);
//
// ages[0]=12;
// ages[1]=22;
// ages[2]=32;
// sysout ages[2];
// sysout for "이용 전체 나이 출력"
//
// for ( int i=0; i< ages.length; i++){
// sysout ages[i]
// }
// sysout "ages 배열에서 20대 이상만 출력"
// for (int i=0; i < ages.length; i++){
// if (ages[i]>=20){
// sysout ages[i]
