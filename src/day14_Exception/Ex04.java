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
		test(); //위의 예외전가된 test를 쓰고있기 때문에 얘도 예외전가처리 해야함
	}
}
public class Ex04 {

	public static void main(String[] args) {//예외전가
		ProcessBuilder b = new ProcessBuilder("calc1111");
		A a = new A();
		a.display();
		System.out.println("다음 문장들 실행");
	}
}
//예외전가는 문제발생하면 바로 프로그램이 종료된다, 전 연산이 후 연산에도 영향을 미친다면 예외전가로 해준다
//예외처리는 문제발생해도 다음문장으로 넘어간다, 전 연산이 후 연산에 영향을 미치지 않는다면 프로그램종료되면 안돼서 예외처리 해준다