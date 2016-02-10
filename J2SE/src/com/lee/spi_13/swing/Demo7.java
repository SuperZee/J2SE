package com.lee.spi_13.swing;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * JCheckBox ��ѡ����� JRadioButton ��ѡ�����
 * 
 * @author SpiColorPendra
 *
 *         ע�� : ��ѡ��ť �����ȴ���ButtonGroup ��ͬһ�鵥ѡ���������ͬһ��ButtonGroup����
 */
public class Demo7 extends JFrame {
	JPanel jp1, jp2, jp3;
	JLabel jl1, jl2;
	JButton jb1, jb2;
	JCheckBox jcb1, jcb2, jcb3;
	JRadioButton jrb1, jrb2;
	// JRadioButton�������ButtonGroup��
	ButtonGroup bg;

	public static void main(String[] args) {
		Demo7 d = new Demo7();
	}

	public Demo7() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jl1 = new JLabel("��ϲ�����˶�");
		jl2 = new JLabel("����Ա�");
		jb1 = new JButton("ע���û�");
		jb2 = new JButton("ȡ��ע��");
		jcb1 = new JCheckBox("����");
		jcb2 = new JCheckBox("����");
		jcb3 = new JCheckBox("����");
		jrb1 = new JRadioButton("��");
		jrb2 = new JRadioButton("Ů");
		// ��jrb1 jrb2 ���뵽һ��ButtonGroup�й���
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		// ���ò��ֹ���
		this.setLayout(new GridLayout(3, 1));

		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);

		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);

		jp3.add(jb1);
		jp3.add(jb2);

		this.add(jp1);
		this.add(jp2);
		this.add(jp3);

		this.setTitle("ע�����");
		this.setBounds(600, 400, 400, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}