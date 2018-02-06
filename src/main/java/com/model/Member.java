package com.model;

public class Member {
    private Long memberid;

    private String membername;

    private String sex;

    private String age;

    private String tel;

    private String address;

    private String reserve01;

    private String reserve02;

    private String reserve03;

    private String reserve04;

    private String reserve05;

    private String reserve06;

    private String reserve07;

    private String reserve08;

    private String reserve09;

    private String reserve10;

    private Short isdelete;

    public Member(Long memberid, String membername, String sex, String age, String tel, String address, String reserve01, String reserve02, String reserve03, String reserve04, String reserve05, String reserve06, String reserve07, String reserve08, String reserve09, String reserve10, Short isdelete) {
        this.memberid = memberid;
        this.membername = membername;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.address = address;
        this.reserve01 = reserve01;
        this.reserve02 = reserve02;
        this.reserve03 = reserve03;
        this.reserve04 = reserve04;
        this.reserve05 = reserve05;
        this.reserve06 = reserve06;
        this.reserve07 = reserve07;
        this.reserve08 = reserve08;
        this.reserve09 = reserve09;
        this.reserve10 = reserve10;
        this.isdelete = isdelete;
    }

    public Member() {
        super();
    }

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getReserve01() {
        return reserve01;
    }

    public void setReserve01(String reserve01) {
        this.reserve01 = reserve01 == null ? null : reserve01.trim();
    }

    public String getReserve02() {
        return reserve02;
    }

    public void setReserve02(String reserve02) {
        this.reserve02 = reserve02 == null ? null : reserve02.trim();
    }

    public String getReserve03() {
        return reserve03;
    }

    public void setReserve03(String reserve03) {
        this.reserve03 = reserve03 == null ? null : reserve03.trim();
    }

    public String getReserve04() {
        return reserve04;
    }

    public void setReserve04(String reserve04) {
        this.reserve04 = reserve04 == null ? null : reserve04.trim();
    }

    public String getReserve05() {
        return reserve05;
    }

    public void setReserve05(String reserve05) {
        this.reserve05 = reserve05 == null ? null : reserve05.trim();
    }

    public String getReserve06() {
        return reserve06;
    }

    public void setReserve06(String reserve06) {
        this.reserve06 = reserve06 == null ? null : reserve06.trim();
    }

    public String getReserve07() {
        return reserve07;
    }

    public void setReserve07(String reserve07) {
        this.reserve07 = reserve07 == null ? null : reserve07.trim();
    }

    public String getReserve08() {
        return reserve08;
    }

    public void setReserve08(String reserve08) {
        this.reserve08 = reserve08 == null ? null : reserve08.trim();
    }

    public String getReserve09() {
        return reserve09;
    }

    public void setReserve09(String reserve09) {
        this.reserve09 = reserve09 == null ? null : reserve09.trim();
    }

    public String getReserve10() {
        return reserve10;
    }

    public void setReserve10(String reserve10) {
        this.reserve10 = reserve10 == null ? null : reserve10.trim();
    }

    public Short getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }
}