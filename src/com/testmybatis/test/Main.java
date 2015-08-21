package com.testmybatis.test;

public class Main {

	public static void main(String[] args) {
		
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.testmybatis.mapping.userMapper.getUser";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        db.open();
        User user =db.session.selectOne(statement, 1);
        if(user!=null){
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        }else{
        	 System.out.println("没有查到!");
        }
        System.out.println("Is Ok");
      
    }


}
