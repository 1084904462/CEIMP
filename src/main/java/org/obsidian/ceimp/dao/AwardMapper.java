package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.ExcelScholarshipBean;
import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.AwardExample;

import java.util.List;

public interface AwardMapper {
    int insertExcelScholarshipBeanList(@Param("list")List<ExcelScholarshipBean> list,@Param("yearScope")Integer yearScope);

    List<ExcelScholarshipBean> getExcelScholarshipBeanList(Integer yearScope);

    int cancelIsFilled(@Param("subName")String subName,@Param("list")List<UserAccountBean> list,@Param("yearScope")Integer yearScope);

    int updateIsFilled(@Param("userId")Long userId, @Param("yearScope")Integer yearScope, @Param("subName")String subName);

    Boolean exist(@Param("userId")Long userId,@Param("subName") String subName,@Param("yearScope") Integer yearScope);

    List<ScholarshipFormBean> getAll(@Param("schoolId")Long schoolId,@Param("subName") String subName, @Param("yearScope") Integer yearScope, @Param("grade") String grade);

    int deleteAll(@Param("subName")String subName,@Param("list")List<UserAccountBean> userAccountBeanList,@Param("yearScope")Integer yearScope);

    Award get(@Param("userId") Long userId,@Param("subName") String subName,@Param("yearScope")int yearScope);

    List<AwardBean> getList(@Param("userId") Long userId, @Param("yearScope") Integer yearScope);

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