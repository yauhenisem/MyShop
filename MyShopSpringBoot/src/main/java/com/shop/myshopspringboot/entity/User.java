package com.shop.myshopspringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_first_name")
    private String userFirstName;

    @Column(name = "user_age")
    private int userAge;

    @Column(name = "user_date_registration")
    @Temporal(TemporalType.DATE)
    private Date userDateRegistration;

    @Column(name = "user_age")
    @Enumerated(EnumType.STRING)
    private Sex sex;

}
