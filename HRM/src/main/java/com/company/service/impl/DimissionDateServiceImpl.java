package com.company.service.impl;

import com.company.dao.DimissionDateMapper;
import com.company.dao.pojo.DimissionDate;
import com.company.service.iservice.DimissionDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Service
public class DimissionDateServiceImpl implements DimissionDateService {

    @Autowired
    DimissionDateMapper dimissionDateMapper;
    @Override
    public List<DimissionDate> findDimissionDate(String begin, String end) {

        if (begin != "" || end != "") {
            return dimissionDateMapper.findDimissionDate(begin, end);
        } else {
            // 获取当前年份、月份、日期
            Calendar cale = null;
            cale = Calendar.getInstance();
            // 获取当月第一天和最后一天
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            // 获取前月的第一天
            cale = Calendar.getInstance();
            cale.add(Calendar.MONTH, 0);
            cale.set(Calendar.DAY_OF_MONTH, 1);
            begin = format.format(cale.getTime());
            // 获取前月的最后一天
            cale = Calendar.getInstance();
            cale.add(Calendar.MONTH, 1);
            cale.set(Calendar.DAY_OF_MONTH, 0);
            end = format.format(cale.getTime());
            return dimissionDateMapper.findDimissionDate(begin, end);
        }
    }
}
