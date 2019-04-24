package com.xxx.demo.Repository;

import com.xxx.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    @Transactional
    @Modifying
    @Query (value = "insert into user set password=?2,user_name=?1,registerday=?3",nativeQuery = true)
    public User addUser(String username, String password,Date registerday);

    @Query (value = "SELECT * from user where user_name = ?1",nativeQuery = true)
    public User searchUserByName (String username);

    @Query (value = "SELECT * from user ",nativeQuery = true)
    public List<User> getuserlist();


    @Query(value = "select password from user where user_name = ?1",nativeQuery = true)
    public String getPassword(String username);

    @Transactional
    @Modifying
    @Query (value = "update user set password = ?2 where user_name = ?1",nativeQuery = true)
    public void changePassword(String username,String password);

}
