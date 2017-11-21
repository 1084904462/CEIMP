package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.AwardExample;

import java.util.List;

public interface AwardMapper {
    Long selectAwardIdBySubNameAndYearScope(@Param("subName") String subName,@Param("yearScope") Integer yearScope);

    List<ScholarshipFormBean> selectAllBySubNameAndYearScope(@Param("subName") String subName,
                                                             @Param("yearScope") Integer yearScope,
                                                             @Param("grade") String grade);

    List<AwardBean> selectAllByUserIdAndYearScope(@Param("userId") Long userId, @Param("yearScope") Integer yearScope);

    long countByExample(AwardExample example);

    int deleteByExample(AwardExample example);

    int deleteByPrimaryKey(Long awardId);

    int insert(Award record);

    int insertSelective(Award record);

    List<Award> selectByExample(AwardExample example);

    Award selectByPrimaryKey(Long awardId);

    int updateByExampleSelective(@Param("record") Award record, @Param("example") AwardExample example);

    int updateByExample(@Param("record") Award record, @Param("example") AwardExample example);

    int updateByPrimaryKeySelective(Award record);

    int updateByPrimaryKey(Award record);
}