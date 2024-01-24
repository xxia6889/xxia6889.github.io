package com.e;

import com.e.pojo.Person;
import com.e.pojo.User;

/**
 * @author CCC
 * @ClassName HelloTest
 * @return String：返回的结果，是字符串形式
 * @date 2024/1/23 21:57
 */


public class HelloTest {

    public int age;
    private String sex;
    private String name;

    public static void main(String[] args) {

        User user = new User();

        Person p = new Person();
        user.setAge(10);
        user.setName("张三");
        p.setAge(20);

        System.out.println(user.getAge());

        System.out.println("Hello");
        System.out.println("你好");

        System.out.println(user.getAge()+" + "+user.getName() );


    }


    public void test(Object object) {
        object.toString();
    }




}


