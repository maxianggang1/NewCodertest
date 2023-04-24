package com.msb.pojo;

public class User {
    private Integer uid;
    private String name;
    private Integer uage;
    private String usex;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public User() {
    }

    public User(Integer uid, String name, Integer uage, String usex) {
        this.uid = uid;
        this.name = name;
        this.uage = uage;
        this.usex = usex;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", uage=" + uage +
                ", usex='" + usex + '\'' +
                '}';
    }
}
