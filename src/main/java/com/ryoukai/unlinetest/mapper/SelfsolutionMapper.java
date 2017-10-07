package com.ryoukai.unlinetest.mapper;

import com.ryoukai.unlinetest.pojo.Selfsolution;
import com.ryoukai.unlinetest.pojo.SelfsolutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelfsolutionMapper {
    int countByExample(SelfsolutionExample example);

    int deleteByExample(SelfsolutionExample example);

    int deleteByPrimaryKey(Integer selfsolutionId);

    int insert(Selfsolution record);

    int insertSelective(Selfsolution record);

    List<Selfsolution> selectByExample(SelfsolutionExample example);

    Selfsolution selectByPrimaryKey(Integer selfsolutionId);

    int updateByExampleSelective(@Param("record") Selfsolution record, @Param("example") SelfsolutionExample example);

    int updateByExample(@Param("record") Selfsolution record, @Param("example") SelfsolutionExample example);

    int updateByPrimaryKeySelective(Selfsolution record);

    int updateByPrimaryKey(Selfsolution record);
}