package com.company.dao;

import com.company.dao.pojo.DimissionDate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DimissionDateMapper {
    List<DimissionDate> findDimissionDate(@Param("begin") String begin,@Param("end") String end);
}
