package com.lee.spi_10.interface_implements;
/*
 * �ӿ���ͬ���Ե�USB�ӿ�һ����ʹ��֮ǰ�Ҳ���֪��������豸��ʲô
 * ������U�� �������ֻ� �ҵ�����Ҫ�������أ����ǳ���أ�
 * �ӿ���ͬһ���淶 ����ʵ�ֽӿڵ��� �����ʵ���ҵ����з���
 * �����ʹ��������ӿ�
 */
public class Demo {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.sendMsg();
	}
}

/*
 * ����һ���ӿ�:interface
 * �ӿںͼ̳е�����:
 * 1.һ����ֻ�ܼ̳�һ���࣬���ǿ���ʵ�ֶ���ӿڡ�
 * 2.������תԭ�� ������������ӿڣ�����Ҫ������ʵ��
 * 3.�ϳ�/�ۺϸ���ԭ��CARP���� ����ʹ�úϳ�/�ۺϣ������Ǽ̳й�ϵ�ﵽ���õ�Ŀ�ġ�
 * 4.�ӿڴ������˼�ǣ�ӵ��ĳ�ֹ��ܣ��ܸ�����磺Serializable���������л��ġ�
 * 5.�̳д��������˼�ǣ�is-a�����磺è ��һ�� ���è���Ƕ�������ࡣ ��
 */

interface PhoneTalk{
	public void call();
	public void sendMsg();
}

class Phone implements PhoneTalk{
	@Override
	public void call() {
		System.out.println("��绰");
		
	}@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
}

/*
 * ʲôʱ��Ӧ��ʹ�ýӿڶ����ǳ������أ�����
 * ���ϱȽ������� �����ŵ�����
 * 
 * ����open()  close()�������й���
 * ��������һ������Ĺ���  ����alarm()
 * ��ô����������������������ȽϺ����أ�
 * 
 * 1.����һ��������
 * abstract class Door{
 * 		public void open();
 * 		public void close();
 * }
 * �����Ժ����е��Ŷ��ܼ̳���������࣬Ȼ�������Ż���Ҫ����Ĺ���
 * 2.����һ���ӿ�
 * interface Alerm{
 * 		public void alerm();
 * }
 * �����Ϳ���ʹ�����Ŷ�ʵ��Alerm����淶���Ӷ�ʵ��alerm�������
 */