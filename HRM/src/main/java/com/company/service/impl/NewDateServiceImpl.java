package com.company.service.impl;

import com.company.dao.NewDateMapper;
import com.company.dao.pojo.NewDate;
import com.company.service.iservice.NewDateService;
import com.company.vo.DateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Service
public class NewDateServiceImpl implements NewDateService {
    @Autowired
    NewDateMapper newDateMapper;

    @Override
    public List<NewDate> findNewDate(String begin, String end) {
        if (begin != "" || end != "") {
            return newDateMapper.findNewDate(begin, end);
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
            return newDateMapper.findNewDate(begin, end);
        }
    }
}
