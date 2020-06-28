package com.example.mustafa.myapplication;

public class PhonePerson {
    private  String name,phone,detail;

    public PhonePerson(String name,String detail, String phone ) {
        this.name = name;
        this.phone = phone;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
