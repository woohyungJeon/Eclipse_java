
public class Exam1 {
	public static void main(String[] args) {
		// �ڽ� Ŭ���� ����
		Army army = new Army("����");
        Navy navy = new Navy("�ر�");
        AirForce airForce = new AirForce("����");
        
        army.move();
        army.attack();
        
        navy.move();
        navy.attack();
        
        airForce.move();
        airForce.attack();
        System.out.println("--------------------------");

		// �θ� Ŭ���� ���� : ��ü �迭
        Unit[] unit = new Unit[3];
        unit[0] = new Army("����");
        unit[1] = new Navy("�ر�");
        unit[2] = new AirForce("����");
        
        for (int i = 0; i < unit.length; i++) {
            unit[i].move();
            unit[i].attack();
        }
	}
}
