package com.company.dao.pojo;

import com.company.vo.DateVO;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class NewDate {
    private Integer id;
    private String dname;
    private String jname;
    private String ename;
    private String esex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireday;
    private String eedu;

    @Override
    public String toString() {
        return "NewDate{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                ", jname='" + jname + '\'' +
                ", ename='" + ename + '\'' +
                ", esex='" + esex + '\'' +
                ", hireday=" + hireday +
                ", eedu='" + eedu + '\'' +
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

    public Date getHireday() {
        return hireday;
    }

    public void setHireday(Date hireday) {
        this.hireday = hireday;
    }

    public String getEedu() {
        return eedu;
    }

    public void setEedu(String eedu) {
        this.eedu = eedu;
    }

    public NewDate(String dname, String jname, String ename, String esex, Date hireday, String eedu) {
        this.dname = dname;
        this.jname = jname;
        this.ename = ename;
        this.esex = esex;
        this.hireday = hireday;
        this.eedu = eedu;
    }

    public NewDate(Integer id, String dname, String jname, String ename, String esex, Date hireday, String eedu) {
        this.id = id;
        this.dname = dname;
        this.jname = jname;
        this.ename = ename;
        this.esex = esex;
        this.hireday = hireday;
        this.eedu = eedu;
    }

    public NewDate() {
    }
}
