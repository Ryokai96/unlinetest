package com.ryoukai.unlinetest.mapper;

import com.ryoukai.unlinetest.pojo.Answertest;
import com.ryoukai.unlinetest.pojo.AnswertestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswertestMapper {
    int countByExample(AnswertestExample example);

    int deleteByExample(AnswertestExample example);

    int deleteByPrimaryKey(Integer answertestId);

    int insert(Answertest record);

    int insertSelective(Answertest record);

    List<Answertest> selectByExample(AnswertestExample example);

    Answertest selectByPrimaryKey(Integer answertestId);

    int updateByExampleSelective(@Param("record") Answertest record, @Param("example") AnswertestExample example);

    int updateByExample(@Param("record") Answertest record, @Param("example") AnswertestExample example);

    int updateByPrimaryKeySelective(Answertest record);

    int updateByPrimaryKey(Answertest record);
}