package com.model;

public class Account {
    private Long accountId;

    private String loginAccount;

    private String password;

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

    private Short idDelete;

    public Account(Long accountId, String loginAccount, String password, String reserve01, String reserve02, String reserve03, String reserve04, String reserve05, String reserve06, String reserve07, String reserve08, String reserve09, String reserve10, Short idDelete) {
        this.accountId = accountId;
        this.loginAccount = loginAccount;
        this.password = password;
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
        this.idDelete = idDelete;
    }

    public Account() {
        super();
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    public Short getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(Short idDelete) {
        this.idDelete = idDelete;
    }
}