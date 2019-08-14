package com.company.dao.pojo;

import java.util.Date;

public class EmpProbation {
    private Integer eno;

    private Date epstartdate;

    private Date ependdate;

    private String epstate;

    @Override
    public String toString() {
        return "EmpProbation{" +
                "eno=" + eno +
                ", epstartdate=" + epstartdate +
                ", ependdate=" + ependdate +
                ", epstate='" + epstate + '\'' +
                '}';
    }

    public EmpProbation(Date epstartdate, Date ependdate, String epstate) {
        this.epstartdate = epstartdate;
        this.ependdate = ependdate;
        this.epstate = epstate;
    }

    public EmpProbation(Integer eno, Date epstartdate, Date ependdate, String epstate) {
        this.eno = eno;
        this.epstartdate = epstartdate;
        this.ependdate = ependdate;
        this.epstate = epstate;
    }

    public EmpProbation() {
        super();
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public Date getEpstartdate() {
        return epstartdate;
    }

    public void setEpstartdate(Date epstartdate) {
        this.epstartdate = epstartdate;
    }

    public Date getEpenddate() {
        return ependdate;
    }

    public void setEpenddate(Date ependdate) {
        this.ependdate = ependdate;
    }

    public String getEpstate() {
        return epstate;
    }

    public void setEpstate(String epstate) {
        this.epstate = epstate == null ? null : epstate.trim();
    }
}