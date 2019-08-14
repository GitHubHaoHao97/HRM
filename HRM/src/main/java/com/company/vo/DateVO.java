package com.company.vo;

public class DateVO {
    private String begin;
    private String end;

    @Override
    public String toString() {
        return "DateVO{" +
                "begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                '}';
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public DateVO(String begin, String end) {
        this.begin = begin;
        this.end = end;
    }

    public DateVO() {
    }
}
