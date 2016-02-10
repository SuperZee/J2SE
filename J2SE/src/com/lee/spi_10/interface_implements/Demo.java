package com.lee.spi_10.interface_implements;
/*
 * 接口如同电脑的USB接口一样，使用之前我并不知道接入的设备是什么
 * 可能是U盘 可能是手机 我到底是要传数据呢？还是充电呢？
 * 接口如同一个规范 告诉实现接口的类 你必须实现我的所有方法
 * 你才能使用我这个接口
 */
public class Demo {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.sendMsg();
	}
}

/*
 * 定义一个接口:interface
 * 接口和继承的区别:
 * 1.一个类只能继承一个类，但是可以实现多个接口。
 * 2.依赖倒转原则： 依赖抽象（例如接口），不要依赖于实现
 * 3.合成/聚合复用原则（CARP）： 尽量使用合成/聚合，而不是继承关系达到复用的目的。
 * 4.接口传达的意思是：拥有某种功能，能干嘛，比如：Serializable代表可序列化的。
 * 5.继承传达的是意思是：is-a，比如：猫 是一个 动物，猫就是动物的子类。 。
 */

interface PhoneTalk{
	public void call();
	public void sendMsg();
}

class Phone implements PhoneTalk{
	@Override
	public void call() {
		System.out.println("打电话");
		
	}@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("发短信");
	}
}

/*
 * 什么时候应该使用接口而不是抽象类呢？？？
 * 网上比较有名的 报警门的例子
 * 
 * 门有open()  close()两个固有功能
 * 报警们有一个特殊的功能  报警alarm()
 * 那么如何来设计这个报警门这个类比较合理呢？
 * 
 * 1.定义一个抽象类
 * abstract class Door{
 * 		public void open();
 * 		public void close();
 * }
 * 这样以后所有的门都能继承这个抽象类，然而报警门还需要特殊的功能
 * 2.定义一个接口
 * interface Alerm{
 * 		public void alerm();
 * }
 * 这样就可以使报警门都实现Alerm这个规范！从而实现alerm这个功能
 */
