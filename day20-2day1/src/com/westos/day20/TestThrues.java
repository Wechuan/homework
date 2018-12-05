package com.westos.day20;


import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestThrues {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        //类加载器
        ClassLoader classLoader = new ClassLoader(){
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                try {
                    //将类以二进制的形式写入
                    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\day20-2day1\\src\\com\\westos\\Treasure.class");
                    byte[] bytes = new byte[1024 * 8];
                    int len = fileInputStream.read(bytes);
                    //将二进制的加载成类Class
                    return defineClass(name,bytes,0,len);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
        Class clazz = classLoader.loadClass("com.westos.Treasure");
        //获得私有的构造方法
        Constructor constructor = clazz.getDeclaredConstructor();
        //将私有的构造方法设置成可以访问的，也就是公共的了
        constructor.setAccessible(true);
        //得到class的实例对象
        Object o =  constructor.newInstance();
        //得到所有方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            //找到带有标记的方法
            Resource resource = method.getAnnotation(Resource.class);
            if (resource!=null){
                method.invoke(o);
            }
        }
    }
}
