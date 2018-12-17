package com.list.listTest.Controller;


import com.list.listTest.Respository.ArticleRepository;
import com.list.listTest.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping
    public Map<String,Object> index(){
        LinkedHashMap map=new LinkedHashMap<String,Object>();
        List<Article> articles=articleRepository.all();

        map.put("data",articles);
        map.put("message","请求成功!");

        return map;
    }

    @PostMapping
    public Map<String,Object> stroe(@RequestBody Article article){

        LinkedHashMap map=new LinkedHashMap<String,Object>();

        articleRepository.save(article);
        map.put("data",article);
        map.put("message","请求成功!");
        return map;
    }
}
