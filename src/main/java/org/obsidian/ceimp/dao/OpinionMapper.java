package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.NgOpinionFormBean;
import org.obsidian.ceimp.bean.NgOpinionUpdateBean;
import org.obsidian.ceimp.bean.ScholarshipOpinionBean;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.entity.OpinionExample;

import java.util.List;

public interface OpinionMapper {
    int updateNgOpinion(@Param("bean") NgOpinionUpdateBean bean,@Param("yearScope") Integer yearScope);

    List<NgOpinionFormBean> getNgOpinionFormBeanList(@Param("schoolId")Long schoolId, @Param("grade")String grade, @Param("yearScope")Integer yearScope);

    Opinion get(@Param("userId")Long userId,@Param("yearScope")Integer yearScope);

    int update(@Param("schoolId") Long schoolId, @Param("yearScope") Integer yearScope,@Param("bean")ScholarshipOpinionBean bean);

    ScholarshipOpinionBean getBean(@Param("schoolId") Long managerId,@Param("grade")String grade,@Param("yearScope") Integer yearScope);

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