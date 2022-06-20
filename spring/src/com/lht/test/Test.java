package com.lht.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lht.mubiao.Mubiao;
import com.lht.qiemian.Qiemian;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContaxt.xml");
		Mubiao m=(Mubiao) context.getBean("mubiao");
		m.chaxun();
		Qiemian q=(Qiemian) context.getBean("qiemian");
		q.anquan();
	}

}
