package com.example.javabasedemo.day01;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-08-31 9:22
 */
public class Demo001 {
    public static void main(String[] args) {
//        Integer i1 = new Integer(123);
//        Integer i2 = new Integer(123);
//        System.out.println(i1 == i2);
//
//        System.out.println("-----------------");
//
//        Integer i3 = Integer.valueOf(123);
//        Integer i4 = Integer.valueOf(123);
//
//        System.out.println(i3 == i4);
//
//        System.out.println("--------");
        //new Integer() 每次都会创建新的对象
        //Integer.valueOf() 会先从缓存池中获取数据

//        String str = "123";
////        String intern = str.intern();
////        System.out.println("intern = " + intern);

//        float f =1.1f;
//          short s1 = (short) 99999;
////          s1 =s1+1;
//          s1+=1;

        String s = "a";

        switch (s){
            case "a":
                System.out.println("s = " + s);
             break;
            case "b":
                System.out.println("s = " + s);
              break;



        }

    }

}