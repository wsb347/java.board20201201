package board;
import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			
		}

		
	}

}
