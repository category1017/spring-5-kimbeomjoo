package kr.or.test;

public class InterfaceApp {

	public static void main(String[] args) {
		// 항상 자바프로그램은 main()진입점에서 실행해야함. 단, 웹프로그램은 해당 없음.
		AllCalc allCalc = new AllCalc();//실행 오브젝트 변수 allCalc 생성
		allCalc.add(5, 5);//메서드를 호출할때, 5,5
		allCalc.sub(5, 5);
		allCalc.mul(5, 5);
		allCalc.div(5, 5);
		
	}

}

//인터페이스 실습(아래) 명세표만-메서드명만 있고, 구현내용이 없는 구조
interface CalcAddSub {
	void add(double dx, double dy);
	void sub(double dx, double dy);	
}
interface CalcMulDiv extends CalcAddSub {
	void mul(double dx, double dy);
	void div(double dx, double dy);
}
class AllCalc implements CalcAddSub, CalcMulDiv {

	@Override
	public void mul(double dx, double dy) {
		// 구현내용
		System.out.println("곱하기 결과는"+ dx * dy);
	}

	@Override
	public void div(double dx, double dy) {
		// 구현내용
		System.out.println("나누기 결과는" + dx/dy );
	}

	@Override
	public void add(double dx, double dy) {
		// 구현내용
		System.out.println("더하기 결과는" + (dx+dy) );
	}

	@Override
	public void sub(double dx, double dy) {
		// 구현내용
		System.out.println("빼기 결과는 " + (dx-dy) );
	}//임플리먼트: 구현하다 의미 뒤에 있는 클래스명세표 기준 구현한다. 
	
}