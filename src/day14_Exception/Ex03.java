package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y,result;
		System.out.println("�� �Է�");
		
		try { 
			x = input.nextInt();
			y = input.nextInt();
			result = x/y;
			System.out.println("x/y = " +result);
			return;
		}catch (Exception e) { //������ ���� �θ�(exception)�� ���� ���� �ִ�, ������ �̷��� ó���� ���� �Ѵ�
			
			//System.out.println("0���δ� ������ �����ϴ�.");
			e.printStackTrace(); //���� ���׿� ���� �α� ����� ��,�� �߻��ߴ��� �˷��ش�
			return;
		}finally {//�������� Ʈ���̰� ĳġ�� ������ �������� ����ȴ�
			System.out.println("�������� ������ ����");
		}
		//System.out.println("���� ����� ����");
	}
	}


