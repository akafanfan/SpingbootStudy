package com.fan.sb2.json.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fan.sb2.json.entity.DataBo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author yangfan
 * @version 1.0
 * @date 2020/5/8 23:54
 * @description JAVA中JSONObject对象和Map对象之间的相互转换
 */
public class JsonMap1 {
    public static void main(String[] args) {
        //json字符串
        String str = "{\n" +
                "  \"code\": \"000\",\n" +
                "  \"msg\": \"succes\",\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"name\": \"Ash\",\n" +
                "      \"age\": 23\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Ying\",\n" +
                "      \"age\": 24\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        JSONObject obj = JSON.parseObject(str);
        //map对象
        Map<String, Object> data = new HashMap<>();
        //循环转换 由json字符串转换成Map对象
        Iterator it = obj.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it.next();
            data.put(entry.getKey(), entry.getValue());
        }
        System.out.println("map对象:" + data.toString());

        // map映射到实体类
        DataBo dataBo = JSONObject.parseObject(JSONObject.toJSONString(data), DataBo.class);
        for (int i = 0; i < dataBo.getData().size(); i++) {
            String name = (String) dataBo.getData().get(i).get("name");
            Integer age = (Integer) dataBo.getData().get(i).get("age");
            System.out.print(name+" "+age);
            System.out.println();
        }
        System.out.println(dataBo.toString());
    }
}
