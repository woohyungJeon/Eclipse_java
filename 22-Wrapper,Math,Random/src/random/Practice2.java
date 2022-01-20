package random;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int number; // 메뉴 번호
		int money = 1000; //돈
		int bat; //배팅 머니
		int computer; //컴퓨터
		int cal; //계산결과
		String com;
		String you;
		String result;

		do {
			System.out.println("1.가위");
			System.out.println("2.바위");
			System.out.println("3.보");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 선택 : ");
			number = sc.nextInt();
			if(number == 0) {
				System.out.println("0번 선택으로 종료합니다.");
				System.exit(0);;
			}
			System.out.print("배팅 금액 : ");
			bat = sc.nextInt();		
			
			System.out.println("결과를 보려면 Enter를 치세요");
			sc.nextLine();
			sc.nextLine();	
		
			computer = random.nextInt(3) + 1;
			
			cal = cal_result(computer, number); //결과 계산
			money = cal_coin(money, bat, cal); //돈계산
			com = com_string(computer); //컴퓨터 문자열
			you = your_string(number); //내 문자열			
			result = result_string(cal); //이기고 진 문자열
			
			switch(cal) {
			case -1:
				System.out.printf("computer : %s you : %s \n%s\n당신의 금액은 %d입니다.\n",com,you,result,money);
				break;
			case 0:
				System.out.printf("computer : %s you : %s \n%s\n당신의 금액은 %d입니다.\n",com,you,result,money);
				break;
			case 1:
				System.out.printf("computer : %s you : %s \n%s\n당신의 금액은 %d입니다.\n",com,you,result,money);
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
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);				
				}else {
					System.out.println("잘못 입력 하셨습니다.");
				}
			}			
			
		}while(true);
}	
	
public static int cal_result(int computer, int number) {
	if(computer == 1) {
		if(computer - number == 0) {
			return 0;//비김
		}else if(computer - number == -1) {
			return -1;//짐
		}else {
			return 1;//이김
		}
	}else if(computer == 2) {
		if(computer - number == 0) {
			return 0; //비김
		}else if(computer - number == -1) {
			return -1;//짐
		}else {
			return 1;//이김
		}	
	}else if(computer == 3) {
		if(computer - number == 0) {
			return 0; //비김
		}else if(computer - number == 2) {
			return -1;//짐
		}else {
			return 1;//이김
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
		return "가위";		
	}else if(number == 2) {
		return "바위";
	}else {
		return "보";
	}
}

public static String com_string(int computer) {
	String a;
	if(computer == 1) {
		return "가위";		
	}else if(computer == 2) {
		return "바위";
	}else {
		return "보";
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


