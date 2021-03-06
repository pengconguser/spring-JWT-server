package com.list.listTest.Respository;

import com.list.listTest.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {
    @Query(value = "select * from articles where title=:title",nativeQuery = true)
    public Article fingArticleByTitle(String title);

    @Query(value = "select * from articles",nativeQuery = true)
    public List<Article> all();
}
