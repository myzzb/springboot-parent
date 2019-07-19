package com.myapp.core.model.pojo;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author :zzb
 * @createDate :2019/7/19 8:54
 * @desc :
 */
public class Blog implements Serializable {

    private Integer bid; //id

    private String name;//姓名

    private String pwd;//密码

    private Timestamp createTime;//创建时间

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
