package kr.or.test;
//오리지널 자바프로그램 형식 : 자바이론공부 -->스프링 웹프로그램과는 형식이 다름.
public class ClassApp {

	public static void main(String[] args) {
		// 이 클래스의 진입메서드 main
		/* circle c 클래스 이름 + c (값) = new 클래스네임(반지름값)
		new 키워드는 메모리에 프로그램 실행공간을 메모리에 새로 할당한다는 뜻*/
		
		Circle c = new Circle(5);//c라는 인스턴스(오브젝트 클래스)변수 c 생성 new 키워드 생성자circle(반지름값5)
		Circle c2 = new Circle(10);
		//Circle클래스를 c 이름으로 prefix해서 사용
		//자바프로그램의 특징은 OOP프로그래밍의 대표적인 사례, Object=위에서 new키워드로 생성한 c 오브젝트,
		//자바에서 OOP (Object Oriented Programming) 를 사용방식을 설명하는예
		//스프링에서는 new키워드 대신 @inject를 주로 사용.
		double print_result = c.getBeomjoo();
		//System.out.println("첫번째 원의 넓이는 " + print_result + " 입니다.");
		double print_result2 = c2.getBeomjoo();
		//System.out.println("두번째 원의 넓이는 " + print_result2 + " 입니다.");
		//아래 new 키워드 생성자를 이용해서 오브젝트를 2개 만들었음.
		Employee employee = new Employee();
		Salesman salesman = new Salesman(); 
		Development development = new Development();
		//employee.dojob();
		//salesman.dojob();
		//development.dojob();
		GraphicObject graphicObject = new Triangle();
		graphicObject.draw();//클래스형 변수명을 지정할때, 카멜표기법 적용(문자가 겹칠때 두번째글자를 대문자로 하는것) .
	}

}

//메서드 오버라이드(메서드 이름이 같은 것을 실행-상속관계) 와
//오버로드(메서드 이름은 고유값이라서 중복해서 사용할 수는 없음, 단 매개변수(인자값)가 다르면 가능합니다.)

//추상클래스에 대한 연습(아래)
//추상클래스 또는 인터페이스를 사용하는 목적은 두꺼운책에서 목차를 만드는 것과 똑같은 역할.
abstract class GraphicObject {
	int x, y;//그래픽오브젝트 클래스 멤버변수 선언
	abstract void draw();//명세표만 있고 구현내용이 없는 추상 메서드 선언
	// 해석하면, 책에서 목차만 있고 내용이 없는 구조. 내용은 별도의 클래스에 있음.
	
}
class Triangle extends GraphicObject {
	//메서드 오버라이드(메서드 이름이 같은 것을 실행-상속관계)
	@Override//메서드 재정의
	void draw() {
		System.out.println("  *");
		System.out.println(" * * ");
		System.out.println("*****");		
	}
			
}

//클래스 상속에 대한 연습(아래)
class Employee {//회사의 모든 직원들 
	int nSalary; //회사 직원 봉급 멤버변수
	String szDept;//회사직원의 부서명 멤버변수
	public void dojob() {
		System.out.println("환영합니다. 직원분들!");
	}
}
class Salesman extends Employee {
	public Salesman() {//클래스명과 똑같은 메서드를 생성자 메서드 입니다.
		szDept = "판매 부서"; //부모클래스 Employee의 szDept멤버변수를 자식클래스에서도 사용가능
	}
	public void dojob() {
		System.out.println("환영합니다. " + szDept + "입니다!");
	}
}

	class Development extends Employee {
		public Development() {szDept= "개발부서";}
		public void doJob() {
		System.out.println("환영합니다. " + szDept + "입니다!");
		}
	}



//오브젝트생성과 new 키워드 사용 연습(아래)
class Circle {
	private int r;//멤버변수 반지름 이클래스에서 전역변수
	public Circle(int a) {//생성자 메서드 a인자=매개변수=파라미터 값은 new키워드로 오브젝트 만들어질때 발생
		r = a;
	}
	public double getBeomjoo() {
		return r*r*3.14;//원의 넓이를 반환
	}
}
