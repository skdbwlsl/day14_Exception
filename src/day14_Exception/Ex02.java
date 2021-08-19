package day14_Exception;
class BBB {
	public int aaa;}

class AAA extends BBB{
	public void catch1(Object a) {
		System.out.println("오브젝트 : "+a);
	}
}



public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA(); //AAA를 만들어도 BBB가 있기에 둘다 저장해도 상관없다
		//BBB a = new AAA(); //이렇게도 가능하다
		
		//Object a = new AAA(); //자바는 모든 object를 상속받게 만들어진다, 즉 조상클래스가 object,
		
		//String ss = "Test";   //자식들은 부모클래스에 저장이 가능하다 자식이 test, 부모가 오브젝트
		Object ss = "test"; // 이것도 가능
		
		
		
		a.catch1(11);
		a.catch1("aaaa");
		a.catch1(1.111);
		a.catch1('a');
		
	
		
	}

}
