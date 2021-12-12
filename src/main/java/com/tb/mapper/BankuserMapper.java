package com.tb.mapper;

import com.tb.entity.Bankuser;
import java.util.List;

public interface BankuserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bankuser record);

    Bankuser selectByPrimaryKey(Long id);

    List<Bankuser> selectAll();

    int updateByPrimaryKey(Bankuser record);

    //查询姓名
    String selectByAppkey(String appkey);

    Bankuser selectByPhoneNumber(String phoneNumber);

    Bankuser selectBankUserByAppkey(String appkey);

}