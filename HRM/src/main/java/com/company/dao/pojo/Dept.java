package com.company.dao.pojo;

import java.util.Date;

public class Dept {
    private Integer dno;

    private String dname;

    private String dtype;

    private Integer dphone;

    private Date dfounddate;

    private Integer superdno;

    @Override
    public String toString() {
        return "Dept{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", dtype='" + dtype + '\'' +
                ", dphone=" + dphone +
                ", dfounddate=" + dfounddate +
                ", superdno=" + superdno +
                '}';
    }

    public Dept(String dname, String dtype, Integer dphone, Date dfounddate, Integer superdno) {
        this.dname = dname;
        this.dtype = dtype;
        this.dphone = dphone;
        this.dfounddate = dfounddate;
        this.superdno = superdno;
    }

    public Dept(Integer dno, String dname, String dtype, Integer dphone, Date dfounddate, Integer superdno) {
        this.dno = dno;
        this.dname = dname;
        this.dtype = dtype;
        this.dphone = dphone;
        this.dfounddate = dfounddate;
        this.superdno = superdno;
    }

    public Dept() {
        super();
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype == null ? null : dtype.trim();
    }

    public Integer getDphone() {
        return dphone;
    }

    public void setDphone(Integer dphone) {
        this.dphone = dphone;
    }

    public Date getDfounddate() {
        return dfounddate;
    }

    public void setDfounddate(Date dfounddate) {
        this.dfounddate = dfounddate;
    }

    public Integer getSuperdno() {
        return superdno;
    }

    public void setSuperdno(Integer superdno) {
        this.superdno = superdno;
    }
}