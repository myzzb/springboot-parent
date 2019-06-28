package com.myapp.core.model.pojo;

import java.io.Serializable;

/**
 * @author :zzb
 * @createDate :2019/6/26 17:44
 * @desc :
 */
public class user implements Serializable {
    private String id;
    private String name;
    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
