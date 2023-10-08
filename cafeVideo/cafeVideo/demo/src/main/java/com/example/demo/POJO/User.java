package com.example.demo.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;


@NamedQuery(name = "User.findByEmailId",query = "select u from User u where u.email =: email")
@NamedQuery(name = "User.getAllUser",query = "select new com.example.demo.Wrapper(u.id,u.name,u.email,u.contactNumber,u.status) from User u where u.role='user'")


@Entity
@DynamicUpdate
@DynamicInsert
@Data
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "contactNumber")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private String status;

    @Column(name = "role")
    private String role;

}