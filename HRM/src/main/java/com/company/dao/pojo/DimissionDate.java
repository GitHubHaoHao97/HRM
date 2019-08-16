package com.company.dao.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DimissionDate {
    private Integer id;
    private String dname;
    private String jname;
    private String ename;
    private String esex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date eddate;
    private String edtype;

    @Override
    public String toString() {
        return "DimissionDate{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                ", jname='" + jname + '\'' +
                ", ename='" + ename + '\'' +
                ", esex='" + esex + '\'' +
                ", eddate=" + eddate +
                ", edtype='" + edtype + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
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
        this.edtype = edtype;
    }

    public DimissionDate(String dname, String jname, String ename, String esex, Date eddate, String edtype) {
        this.dname = dname;
        this.jname = jname;
        this.ename = ename;
        this.esex = esex;
        this.eddate = eddate;
        this.edtype = edtype;
    }

    public DimissionDate(Integer id, String dname, String jname, String ename, String esex, Date eddate, String edtype) {
        this.id = id;
        this.dname = dname;
        this.jname = jname;
        this.ename = ename;
        this.esex = esex;
        this.eddate = eddate;
        this.edtype = edtype;
    }

    public DimissionDate() {
    }
}
