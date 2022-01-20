// 다형성 : 다양한 형태의 자식클래스를 부모클래스를 통해서 사용하는 것
public class Exam2 {
	public static void main(String[] args) {
		// 상속된 클래스 사용 : 부모 클래스 기준 사용 
		// 부대 지정
		Unit[] units = new Unit[3];
		
		units[0] = new Army("육군");
		units[1] = new Navy("해군");
		units[2] = new AirForce("공군");
		
		// 부대 일괄 공격
		for(int i=0; i<units.length; i++) {
			units[i].attack();
			// instanceof : 객체 확인 연산자, 객체명 instanceof 클래스명, true : 객체, false : 객체아님
			if(units[i] instanceof Army) {
				Army army = (Army)units[i];
				army.tank();
			} else if(units[i] instanceof Navy){
				Navy navy = (Navy)units[i];
				navy.nucleus();
			} else if(units[i] instanceof AirForce) {
				AirForce af = (AirForce)units[i];
				af.bombing();
			}
			System.out.println("------------------");
		}
		
		
	}
}
