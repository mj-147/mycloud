package com.mj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class sys_user implements Serializable {
    private String id;
    private String uname;
    private String upassword;
    private String uaccount;
}
