
public class Exam1 {
	public static void main(String[] args) {
		// 자식 클래스 기준
		Army army = new Army("육군");
        Navy navy = new Navy("해군");
        AirForce airForce = new AirForce("공군");
        
        army.move();
        army.attack();
        
        navy.move();
        navy.attack();
        
        airForce.move();
        airForce.attack();
        System.out.println("--------------------------");

		// 부모 클래스 기준 : 객체 배열
        Unit[] unit = new Unit[3];
        unit[0] = new Army("육군");
        unit[1] = new Navy("해군");
        unit[2] = new AirForce("공군");
        
        for (int i = 0; i < unit.length; i++) {
            unit[i].move();
            unit[i].attack();
        }
	}
}
