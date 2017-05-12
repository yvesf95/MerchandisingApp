package com.jgalds.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Admin on 5/7/2017.
 */

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Account {

    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "USERNAME", length = 45, unique = true, nullable = false)
    private String username;

    @Column(name = "PASSWORD", length = 60, nullable = false)
    private String password;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    private boolean active;

    private String role;

    @CreatedDate
    private Date createdOn;

    public Account() {
    }

    public Account(String username, String password, String name, String email, boolean active, String role) {
        this.username = username;
        this.setPassword(password);
        this.name = name;
        this.email = email;
        this.active = active;
        this.role = role;
    }

    public void setPassword(String password){
        this.password = PASSWORD_ENCODER.encode(password);
    }
}
