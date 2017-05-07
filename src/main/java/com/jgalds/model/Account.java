package com.jgalds.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Admin on 5/7/2017.
 */

@Data
@Entity
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(name = "username", length = 60, unique = true, nullable = false)
    private String username;
    private String password;
    private String name;
    private String email;
    private String status;
    private String[] roles;
    @CreatedDate
    private Date createdOn;

    public Account() {
    }

    public Account(String username, String password, String name, String email, String status, String... roles) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.status = status;
        this.roles = roles;
    }
}
