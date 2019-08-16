package com.company.service.iservice;

import com.company.dao.pojo.NewDate;
import com.company.vo.DateVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewDateService {
    /**
     * 新聘员工报表
     * @param begin
     * @param end
     * @return
     */
    List<NewDate> findNewDate(@Param("begin") String begin,@Param("end") String end);
}
