package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.NgOpinionFormBean;
import org.obsidian.ceimp.bean.ScholarshipOpinionBean;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.entity.OpinionExample;

import java.util.List;

public interface OpinionMapper {
    List<NgOpinionFormBean> getNgOpinionFormBeanListBySchoolIdAndGradeAndYearScope(@Param("schoolId")Long schoolId,
                                                                           @Param("grade")String grade,
                                                                           @Param("yearScope")Integer yearScope);

    Opinion selectByUserIdAndYearScope(@Param("userId")Long userId,@Param("yearScope")Integer yearScope);

    int updateByManagerIdAndYearScopeAndScholarshipOpinionBean(@Param("managerId") Long managerId,
        @Param("yearScope") Integer yearScope,@Param("scholarshipOpinionBean")ScholarshipOpinionBean scholarshipOpinionBean);

    ScholarshipOpinionBean selectByManagerIdAndYearScope(@Param("managerId") Long managerId,@Param("yearScope") Integer yearScope);

    long countByExample(OpinionExample example);

    int deleteByExample(OpinionExample example);

    int deleteByPrimaryKey(Long opinionId);

    int insert(Opinion record);

    int insertSelective(Opinion record);

    List<Opinion> selectByExample(OpinionExample example);

    Opinion selectByPrimaryKey(Long opinionId);

    int updateByExampleSelective(@Param("record") Opinion record, @Param("example") OpinionExample example);

    int updateByExample(@Param("record") Opinion record, @Param("example") OpinionExample example);

    int updateByPrimaryKeySelective(Opinion record);

    int updateByPrimaryKey(Opinion record);
}