package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 贪心算法 {
    //遍历所有的广播电台，找到一个覆盖了最多未覆盖的的确的电台(此电台可能覆盖包含一些已覆盖的地区
    //加入ArrayList
    public static void main(String[] args) {
        //创建广播电台，放入到Map
        HashMap<String, HashSet<String>> broadcast = new HashMap<String, HashSet<String>>();
        //将各个电台放入到broadcasts
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("北京");
        hashSet1.add("上海");
        hashSet1.add("天津");

        HashSet<String> hashSet2 = new HashSet<String>();
        hashSet2.add("广州");
        hashSet2.add("北京");
        hashSet2.add("深圳");

        HashSet<String> hashSet3 = new HashSet<String>();
        hashSet3.add("成都");
        hashSet3.add("上海");
        hashSet3.add("杭州");

        HashSet<String> hashSet4 = new HashSet<String>();
        hashSet4.add("天津");
        hashSet4.add("上海");

        HashSet<String> hashSet5 = new HashSet<String>();
        hashSet5.add("杭州");
        hashSet5.add("大连");

        broadcast.put("K1",hashSet1);
        broadcast.put("K2",hashSet2);
        broadcast.put("K3",hashSet3);
        broadcast.put("K4",hashSet4);
        broadcast.put("K5",hashSet5);

        HashSet<String> allAreas = new HashSet<String>();
        for(String i:hashSet1){
            allAreas.add(i);
        }
        for(String i:hashSet2){
            allAreas.add(i);
        }
        for(String i:hashSet3){
            allAreas.add(i);
        }
        for(String i:hashSet4){
            allAreas.add(i);
        }
        for(String i:hashSet5){
            allAreas.add(i);
        }
        for (String i:allAreas){
            System.out.println(i);
        }

        //创建ArrayList 存放选择的电台集合
        ArrayList<String> selects = new ArrayList<String>();
        //定义一个临时集合，在遍历过程中，存放遍历过程中的电台覆盖的地区和当前每页覆盖地区的交集
        HashSet<String> tempset = new HashSet<String>();
        //定义给maxkey，保存在一次遍历过程中，能够覆盖最大未覆盖
        String maxKey = null;
        int max = 0;
        while(allAreas.size()!=0){
            //如果allAreas不为0，表示还没有覆盖到所有地区
            //遍历
            for (String key:broadcast.keySet()){
                //当前整个key覆盖的地区
                tempset.clear();
                HashSet<String> areas = broadcast.get(key);
                tempset.addAll(areas);
                tempset.retainAll(allAreas);
                if (tempset.size()>0&&(maxKey==null||tempset.size()>max)){
                    maxKey = key;
                    max = tempset.size();
                }
            }
            //maxkey！=null，就应该将maxKey加入selects
            if(maxKey!=null){
                selects.add(maxKey);
                //将maxkey指向广播电台覆盖的地区从allAreas去掉
                allAreas.removeAll(broadcast.get(maxKey));
                maxKey = null;
                max = 0;
            }
        }
        for (String i:selects){
            System.out.println(i);
        }


    }
}
