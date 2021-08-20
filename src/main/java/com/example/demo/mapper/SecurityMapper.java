package com.example.demo.mapper;

import com.example.demo.entity.Security;
import com.example.demo.entity.SecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityMapper {
    long countByExample(SecurityExample example);

    int deleteByExample(SecurityExample example);

    int deleteByPrimaryKey(Integer securityId);

    int insert(Security record);

    int insertSelective(Security record);

    List<Security> selectByExample(SecurityExample example);

    Security selectByPrimaryKey(Integer securityId);

    int updateByExampleSelective(@Param("record") Security record, @Param("example") SecurityExample example);

    int updateByExample(@Param("record") Security record, @Param("example") SecurityExample example);

    int updateByPrimaryKeySelective(Security record);

    int updateByPrimaryKey(Security record);
}