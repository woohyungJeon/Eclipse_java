import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   // ����
	   String name = "";// �̸�
	   int base = 0;	// �⺻��
	   int tax = 0;		// ����
	   int salary =  0;	// ����
	   
	   // �Է�
	   System.out.print("�̸� �Է� : ");
	   name = sc.next();
	   System.out.print("�⺻�� �Է� : ");
	   base = sc.nextInt();
	   
	   // ����
	   tax = (int)(base * 0.033);
	   salary = base - tax;
	   
	   // ���
	   System.out.printf("*** %s�� ���� ***\n", name);
	   System.out.println("�⺻�� : " + base + "��");
	   System.out.println("����   : " + tax + "��");
	   System.out.println("����   : " + salary + "��");
	}
}