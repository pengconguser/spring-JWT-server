package com.list.listTest.Controller;


import com.list.listTest.model.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @GetMapping
    public Map<String,Object> index(){
        Article articles=new Article();

        LinkedHashMap map=new LinkedHashMap<String,Object>();

        map.put("data",articles);
        map.put("message","请求成功!");

        return map;
    }
}
