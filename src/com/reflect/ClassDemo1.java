package com.reflect;

public class ClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Foo��ʵ��������α�ʾ
		Foo foo1 = new Foo();//foo1�ͱ�ʾ������.
		//Foo����� Ҳ��һ��ʵ������,Class���ʵ������,��α�ʾ��
		//�κ�һ���඼��Class��ʵ������,���ʵ�����������ֱ�ʾ��ʽ
		
		//��һ�ֱ�ʾ��ʽ-->ʵ���ڸ��������κ�һ���඼��һ�������ľ�̬��Ա����class
		Class c1 = Foo.class;
		
		//�ڶ��ַ�ʽ �Ѿ�֪������Ķ���ͨ��getClass����
		Class c2 = foo1.getClass();
		
		/*���� c1,c2��ʾ��Foo���������(class type)
		 * ��������Զ���,
		 * ��Ҳ�Ƕ���,��Class���ʵ������
		 * ����������ǳ�Ϊ�����������
		 * */
		
		// ����c1 or c2��������Foo���������,һ����ֻ������Class���һ��ʵ������
		System.out.println(c1 == c2);
		
		//�����ֱ�﷽ʽ
		Class c3 = null;
		try {
			 c3 = Class.forName("com.reflect.Foo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2 == c3);
		
		//������ȫ����ͨ����������ʹ�������Ķ���ʵ��--->ͨ��c1 or c2 or c3����Foo��ʵ��
		try {
			//��Ҫ���޲����Ĺ��췽��
			Foo foo = (Foo) c1.newInstance();
			foo.print();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Foo{
	void print() {
		System.out.println("foo");
	}
}