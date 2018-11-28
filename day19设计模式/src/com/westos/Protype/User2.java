package com.westos.Protype;

import java.io.*;
import java.util.Date;

public class User2 implements Cloneable,Serializable {
    private String name;
    private int age;
    private Date bir;

    public String getName() { return name;
    }
    public void setName(String name) { this.name = name;
    }
    public int getAge() { return age;
    }
    public void setAge(int age) { this.age = age;
    }
    public Date getBir() { return bir;
    }
    public void setBir(Date bir) { this.bir = bir;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            //当前对象写入输出流
            new ObjectOutputStream(os).writeObject(this);
            //拿到字节数组
            byte[] bytes = os.toByteArray();
            ByteArrayInputStream is = new ByteArrayInputStream(bytes);
            //对象输入流
            ObjectInputStream ois = new ObjectInputStream(is);
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {

        }
        return null;
    }
}
