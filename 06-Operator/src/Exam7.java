// �� ������
// => ������ ������, ������, �������� ��ɾ�� ���� ��
// || : or ������,  && : and ������,  ! : not ������
// => ���ʰ��� �����ʰ��� �ݵ�� boolean ���̾�� ��
// => ����� �����ؼ� �����
/* ����ǥ
x		y		x||y	x&&y	!x 
true	true	true	true 	false
ture	false	true	false	false
false	true	true	false	true
false 	false	false	false	true
*/
public class Exam7 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		boolean r1 = a>=b && x>=y;
		boolean r2 = a>=b || x>=y;
		boolean r3 = !r2;
		boolean r4 = !(a>=b || x>=y);  // () : �ֿ켱 ������, �Ұ�ȣ ���� ���� ���� �����϶�
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
	}
}
