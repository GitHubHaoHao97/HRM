package com.company.service.iservice;

import com.company.dao.pojo.DimissionDate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DimissionDateService {
    /**
     * 离职员工报表
     * @param begin
     * @param end
     * @return
     */
    List<DimissionDate> findDimissionDate(@Param("begin") String begin, @Param("end") String end);
}
