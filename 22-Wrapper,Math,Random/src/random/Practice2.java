package random;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int number; // �޴� ��ȣ
		int money = 1000; //��
		int bat; //���� �Ӵ�
		int computer; //��ǻ��
		int cal; //�����
		String com;
		String you;
		String result;

		do {
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.��");
			System.out.println("0.���α׷� ����");
			System.out.print("�޴� ���� : ");
			number = sc.nextInt();
			if(number == 0) {
				System.out.println("0�� �������� �����մϴ�.");
				System.exit(0);;
			}
			System.out.print("���� �ݾ� : ");
			bat = sc.nextInt();		
			
			System.out.println("����� ������ Enter�� ġ����");
			sc.nextLine();
			sc.nextLine();	
		
			computer = random.nextInt(3) + 1;
			
			cal = cal_result(computer, number); //��� ���
			money = cal_coin(money, bat, cal); //�����
			com = com_string(computer); //��ǻ�� ���ڿ�
			you = your_string(number); //�� ���ڿ�			
			result = result_string(cal); //�̱�� �� ���ڿ�
			
			switch(cal) {
			case -1:
				System.out.printf("computer : %s you : %s \n%s\n����� �ݾ��� %d�Դϴ�.\n",com,you,result,money);
				break;
			case 0:
				System.out.printf("computer : %s you : %s \n%s\n����� �ݾ��� %d�Դϴ�.\n",com,you,result,money);
				break;
			case 1:
				System.out.printf("computer : %s you : %s \n%s\n����� �ݾ��� %d�Դϴ�.\n",com,you,result,money);
				break;			

			}
			
			while(true) {
				System.out.print("continue(y/n) : ");
				String con = sc.next();
				if(con.equals("y")) {
					System.out.print("insert coin : ");
					int plus = sc.nextInt();
					money += plus;
					break;
				}else if(con.equals("n")) {
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);				
				}else {
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				}
			}			
			
		}while(true);
}	
	
public static int cal_result(int computer, int number) {
	if(computer == 1) {
		if(computer - number == 0) {
			return 0;//���
		}else if(computer - number == -1) {
			return -1;//��
		}else {
			return 1;//�̱�
		}
	}else if(computer == 2) {
		if(computer - number == 0) {
			return 0; //���
		}else if(computer - number == -1) {
			return -1;//��
		}else {
			return 1;//�̱�
		}	
	}else if(computer == 3) {
		if(computer - number == 0) {
			return 0; //���
		}else if(computer - number == 2) {
			return -1;//��
		}else {
			return 1;//�̱�
		}	
	}
	return number;
}

public static int cal_coin(int money,int bat, int result) {
	int cal_money;
	if(result == 1) {
		cal_money = money + bat;
		return cal_money;
	}else if(result == 0){
		return money;
	}else {
		cal_money = money - bat;
		return cal_money;
	}
}

public static String your_string(int number) {
	String a;
	if(number == 1) {
		return "����";		
	}else if(number == 2) {
		return "����";
	}else {
		return "��";
	}
}

public static String com_string(int computer) {
	String a;
	if(computer == 1) {
		return "����";		
	}else if(computer == 2) {
		return "����";
	}else {
		return "��";
	}
}

public static String result_string(int cal) {
	String a;
	if(cal == 1) {
		return "you Win!!";		
	}else if(cal == 0) {
		return "you Draw!!";
	}else {
		return "you Lose!!";
	}
}



}


