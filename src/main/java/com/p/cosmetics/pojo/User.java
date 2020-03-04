package com.p.cosmetics.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String userName;
    private String pwd;
    private String id;
}
