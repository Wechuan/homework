package com.westos.Singleton;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spider1 {
    public static void main(String[] args) throws IOException {
        HttpURLConnection connection =(HttpURLConnection)
                new URL("https://tieba.baidu.com/f?ie=utf-8&kw=%E9%A3%8E%E6%99%AF%E5%9B%BE&fr=search").openConnection();
//        InputStream in = connection.getInputStream();
//        BufferedReader reader;
//        reader = new BufferedReader(new FileReader(String.valueOf(in)));
        String html = Spider1.getHtml(connection);//返回一个字符串的html对象
        ArrayList pictureUrl = getPictureUrl(html);
        getPicture(pictureUrl);//直接存在C:\Users\Administrator\IdeaProjects\homework\picture中

        return;
    }

    private static void getPicture(ArrayList pictureUrl) throws IOException {
        for (Object p : pictureUrl) {
           HttpURLConnection conn = (HttpURLConnection) new URL((String)p).openConnection();
            InputStream in = conn.getInputStream();
            UUID uuid = UUID.randomUUID();
            FileOutputStream out = new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\homework\\picture\\"+uuid+".png");//直接用网址命名
            while (true){
                byte[] bytes = new byte[1024];
                int len = in.read(bytes);
                if(len == -1){
                    break;
                }
                out.write(bytes,0,len);
            }
            out.close();
        }
    }
    private static ArrayList getPictureUrl(String html) {
        Pattern patternRegex = Pattern.compile("bpic=\"(.*?)\"");//匹配图片地址的正则
        Matcher matcher = patternRegex.matcher(html);
        String htmlUrl=null;

        ArrayList<String> listUrl = new ArrayList<>();
        while (matcher.find()){
            htmlUrl = matcher.group();
            String[] split = htmlUrl.split("=\"");
            String[] split1 = split[1].split("\"");//切出来了标准的URL
            listUrl.add(split1[0]);//将图片的url存入数组中
        }
        return listUrl;
    }
    /*
          获得html页面，写入本地。
     */
    private static String getHtml(HttpURLConnection connection) throws IOException {
        InputStream in = connection.getInputStream();//拿到html字节流
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuffer stringBuffer1 = new StringBuffer();//定义一个stringbuffer,将html转换为字符串对象
        while (true) {
            String s = reader.readLine();//读取html
            if (s == null) {
                break;
            }
            stringBuffer1.append(s).append("\n");//存为字符串对象
        }
        return stringBuffer1.toString();
    }


    }


