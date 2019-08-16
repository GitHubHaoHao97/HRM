package com.company.dao;

import com.company.dao.pojo.NewDate;
import com.company.vo.DateVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewDateMapper {
    List<NewDate> findNewDate(@Param("begin")String begin,@Param("end")String end);
}
