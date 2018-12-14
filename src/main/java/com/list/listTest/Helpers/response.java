package com.list.listTest.Helpers;


import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

public class response {
    public static String data_response_message="请求成功!";
    public static String insert_response_message="创建成功!";
    public static String update_response_message="更新成功!";

    public static Map<String,Object> data_response(Object object){
        LinkedHashMap map=new LinkedHashMap<String,Object>();

        map.put("data",object);
        map.put("message",data_response_message);

        return map;
    }

    public static Map<String,Object> insert_response(Object object){
        Map<String,Object> map=data_response(object);
        map.replace("message",insert_response_message);

        return map;
    }

    public static Map<String,Object> update_response(Object object){
        Map<String,Object> map=data_response(object);
        map.replace("message",update_response_message);

        return map;
    }
}
