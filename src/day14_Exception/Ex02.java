package day14_Exception;
class BBB {
	public int aaa;}

class AAA extends BBB{
	public void catch1(Object a) {
		System.out.println("������Ʈ : "+a);
	}
}



public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA(); //AAA�� ���� BBB�� �ֱ⿡ �Ѵ� �����ص� �������
		//BBB a = new AAA(); //�̷��Ե� �����ϴ�
		
		//Object a = new AAA(); //�ڹٴ� ��� object�� ��ӹް� ���������, �� ����Ŭ������ object,
		
		//String ss = "Test";   //�ڽĵ��� �θ�Ŭ������ ������ �����ϴ� �ڽ��� test, �θ� ������Ʈ
		Object ss = "test"; // �̰͵� ����
		
		
		
		a.catch1(11);
		a.catch1("aaaa");
		a.catch1(1.111);
		a.catch1('a');
		
	
		
	}

}
