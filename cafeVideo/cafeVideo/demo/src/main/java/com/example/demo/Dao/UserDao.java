package com.example.demo.Dao;

import com.example.demo.POJO.User;
import com.example.demo.Wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    User findByEmailId(@Param("email") String email);

    List<UserWrapper> getAllUser();

    @Modifying
    @Transactional
    Integer updateStatus(String status,Integer id);

    List<String> getAllAdmin();
}
