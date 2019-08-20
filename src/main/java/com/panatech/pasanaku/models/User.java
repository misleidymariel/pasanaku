package com.panatech.pasanaku.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class User {
    private String id;
    private String name;
    private int dni;
    private int phone;
    private String email;
    private String password;
}
