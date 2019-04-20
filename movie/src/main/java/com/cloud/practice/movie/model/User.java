package com.cloud.practice.movie.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class User implements Serializable {

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;

}
