package com.company.dao.pojo;

import java.util.Date;

public class EmpDimission {
    private Integer eno;

    private Date eddate;

    private String edtype;

    private String edtalent;

    @Override
    public String toString() {
        return "EmpDimission{" +
                "eno=" + eno +
                ", eddate=" + eddate +
                ", edtype='" + edtype + '\'' +
                ", edtalent='" + edtalent + '\'' +
                '}';
    }

    public EmpDimission(Date eddate, String edtype, String edtalent) {
        this.eddate = eddate;
        this.edtype = edtype;
        this.edtalent = edtalent;
    }

    public EmpDimission(Integer eno, Date eddate, String edtype, String edtalent) {
        this.eno = eno;
        this.eddate = eddate;
        this.edtype = edtype;
        this.edtalent = edtalent;
    }

    public EmpDimission() {
        super();
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Date getEddate() {
        return eddate;
    }

    public void setEddate(Date eddate) {
        this.eddate = eddate;
    }

    public String getEdtype() {
        return edtype;
    }

    public void setEdtype(String edtype) {
        this.edtype = edtype == null ? null : edtype.trim();
    }

    public String getEdtalent() {
        return edtalent;
    }

    public void setEdtalent(String edtalent) {
        this.edtalent = edtalent == null ? null : edtalent.trim();
    }
}