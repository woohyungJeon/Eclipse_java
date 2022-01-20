// ������ : �پ��� ������ �ڽ�Ŭ������ �θ�Ŭ������ ���ؼ� ����ϴ� ��
public class Exam2 {
	public static void main(String[] args) {
		// ��ӵ� Ŭ���� ��� : �θ� Ŭ���� ���� ��� 
		// �δ� ����
		Unit[] units = new Unit[3];
		
		units[0] = new Army("����");
		units[1] = new Navy("�ر�");
		units[2] = new AirForce("����");
		
		// �δ� �ϰ� ����
		for(int i=0; i<units.length; i++) {
			units[i].attack();
			// instanceof : ��ü Ȯ�� ������, ��ü�� instanceof Ŭ������, true : ��ü, false : ��ü�ƴ�
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
