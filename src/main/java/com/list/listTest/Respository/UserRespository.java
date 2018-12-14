package com.list.listTest.Respository;

import com.list.listTest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRespository extends JpaRepository<User,Integer> {

     @Query(value = "select * from users where name=:name",nativeQuery =true )
     public User findByUsername(@Param("name") String name);

     @Query(value = "select * from users as u where u.id=:id",nativeQuery = true)
     public List<User> findUserById (@Param("id") int id);

     @Query(value = "select * from users",nativeQuery = true)
     public List<User> findUserAll();

}
