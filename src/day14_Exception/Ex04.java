package day14_Exception;

import java.io.IOException;
class A{
	public void test()  {
		ProcessBuilder b = new ProcessBuilder("calc111");
		try {
			b.start();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void display()  {
		test(); //���� ���������� test�� �����ֱ� ������ �굵 ��������ó�� �ؾ���
	}
}
public class Ex04 {

	public static void main(String[] args) {//��������
		ProcessBuilder b = new ProcessBuilder("calc1111");
		A a = new A();
		a.display();
		System.out.println("���� ����� ����");
	}
}
//���������� �����߻��ϸ� �ٷ� ���α׷��� ����ȴ�, �� ������ �� ���꿡�� ������ ��ģ�ٸ� ���������� ���ش�
//����ó���� �����߻��ص� ������������ �Ѿ��, �� ������ �� ���꿡 ������ ��ġ�� �ʴ´ٸ� ���α׷�����Ǹ� �ȵż� ����ó�� ���ش�