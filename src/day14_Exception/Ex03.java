package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y,result;
		System.out.println("수 입력");
		
		try { 
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
			System.out.println("x/y = " +result);
			return;
		}catch (Exception e) { //오류에 대한 부모(exception)로 받을 수도 있다, 보통은 이렇게 처리를 많이 한다
			
			//System.out.println("0으로는 나눌수 없습니다.");
			e.printStackTrace(); //오류 사항에 대한 로그 남기는 것,왜 발생했는지 알려준다
			return;
		}finally {//마지막에 트라이건 캐치건 무조건 마지막에 실행된다
			System.out.println("마지막에 수행할 내용");
		}
		//System.out.println("다음 문장등 실행");
	}
	}


