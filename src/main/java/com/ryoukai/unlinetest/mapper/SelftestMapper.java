package com.ryoukai.unlinetest.mapper;

import com.ryoukai.unlinetest.pojo.Selftest;
import com.ryoukai.unlinetest.pojo.SelftestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelftestMapper {
    int countByExample(SelftestExample example);

    int deleteByExample(SelftestExample example);

    int deleteByPrimaryKey(Integer selftestId);

    int insert(Selftest record);

    int insertSelective(Selftest record);

    List<Selftest> selectByExample(SelftestExample example);

    Selftest selectByPrimaryKey(Integer selftestId);

    int updateByExampleSelective(@Param("record") Selftest record, @Param("example") SelftestExample example);

    int updateByExample(@Param("record") Selftest record, @Param("example") SelftestExample example);

    int updateByPrimaryKeySelective(Selftest record);

    int updateByPrimaryKey(Selftest record);
}