package com.company.commons;

import com.company.dao.pojo.Emp;

import java.io.Serializable;

public class RepositoryResult<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    @Override
    public String toString() {
        return "RepositoryResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public RepositoryResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public RepositoryResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RepositoryResult() {
    }
}
