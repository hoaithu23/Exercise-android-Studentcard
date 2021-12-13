package com.n2n.StudentCard.Module;

public class User {
    public int imageId;
    public String name;
    public String mssv;
    public String phone;
    String ns;
    String khoa;
    String lop;

    public User(String phone, String name, String mssv, int imageId, String ns, String khoa, String lop) {
        this.imageId = imageId;
        this.name = name;
        this.mssv = mssv;
        this.phone = phone;
        this.ns = ns;
        this.khoa = khoa;
        this.lop = lop;
    }
}
