package com.westos.day21;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestHeroes {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Administrator\\IdeaProjects\\day20-2day1\\src\\com\\westos\\heroes.txt"));

        Stream<Heroes> heroesStream = lines.map(str -> str.split("\t")).map(array ->
                new Heroes(
                        Integer.parseInt(array[0]),
                        array[1], array[2], array[3],
                        Integer.parseInt(array[4]),
                        Integer.parseInt(array[5]),
                        Integer.parseInt(array[6]))
        );
        // 1. 找到武将中武力前三的hero对象, 提示流也可以排序
//        heroesStream.sorted((o1,o2)->o2.getLevel()-o1.getLevel()).forEach(s-> System.out.println(s));

        // 2. 按出生地分组
//        Map<String, List<Heroes>> collect = heroesStream.collect(Collectors.groupingBy(s -> s.getLoc()));

        // 3. 找出寿命前三的武将
//        Stream<Heroes> sortedAge = heroesStream.sorted(s -> (s.getDea() - s.getBir()));

        // 4. 女性寿命最高的
//        heroesStream.filter(s->s.getSex().equals("女")).sorted((o1,o2)->o1.getLevel()-o2.getLevel()).forEach(x-> System.out.println(x));

        // 5. 找出武力排名前三  100, 99, 97 97 ==> 4个人 吕布", "张飞", "关羽", "马超

        // 6. 按各个年龄段分组： 0~20, 2140, 41~60, 60以上
 //       Map<Boolean, List<Heroes>> collectAge = heroesStream.collect(Collectors.partitioningBy(s -> (s.getDea() - s.getBir()) >= 60));
        //当为true的时候取得是大于60岁的，false是小于60的
//        List<Heroes> heroesList = collectAge.get(false);
//        Map<Boolean, List<Heroes>> collectAge2 = heroesList.stream().collect(Collectors.partitioningBy(s -> (s.getDea() - s.getBir()) >= 41));
//        collectAge2.get(true);//41-60
//        List<Heroes> heroesList1 = collectAge2.get(false);
//        Map<Boolean, List<Heroes>> collectAge3 = heroesList1.stream().collect(Collectors.partitioningBy(s -> (s.getDea() - s.getBir()) > 21));
//        collectAge3.get(true);//21-40
//        collectAge3.get(false);//0-20
//
// 7. 按武力段分组： >=90， 80~89, 70~79, <70
        Map<Boolean, List<Heroes>> collectLev = heroesStream.collect(Collectors.partitioningBy(s -> s.getLevel()>90));
        //当为true的时候取得是大于60岁的，false是小于60的
        List<Heroes> heroesLevelList = collectLev.get(false);
        Map<Boolean, List<Heroes>> collectLev2 = heroesLevelList.stream().collect(Collectors.partitioningBy(s -> s.getLevel()>80));
        collectLev2.get(true);//41-60
        List<Heroes> heroesLevelList1 = collectLev2.get(false);
        Map<Boolean, List<Heroes>> collectLev3 = heroesLevelList1.stream().collect(Collectors.partitioningBy(s -> s.getLevel()>70));
        collectLev3.get(true);//70-79
        collectLev3.get(false);//0-70

        // 8. 按出生地分组后，统计各组人数
//        heroesStream.collect(Collectors.groupingBy(s->s.getLoc(),Collectors.counting()));
    }
}
