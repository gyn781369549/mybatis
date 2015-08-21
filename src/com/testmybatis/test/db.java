package com.testmybatis.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class db {
	public static SqlSession session;
	public static void open() {
			//mybatis的配置文件
			String resource = "conf.xml";
		    //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
		    InputStream is = Main.class.getClassLoader().getResourceAsStream(resource);
		    //构建sqlSession的工厂
		    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		    //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
		    //创建能执行映射文件中sql的sqlSession
		    SqlSession session = sessionFactory.openSession();
		    db.session=session;
		
	}
	
	
	 
   
}
