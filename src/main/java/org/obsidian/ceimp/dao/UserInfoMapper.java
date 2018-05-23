package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.BasicScholarshipBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.entity.UserInfo;
import org.obsidian.ceimp.entity.UserInfoExample;

import java.util.List;

public interface UserInfoMapper {
    int update(@Param("userId")Long userId, @Param("yearScope")Integer yearScope,@Param("bean") BasicScholarshipBean bean);

    UserInfoBean getBean(@Param("userId")Long userId, @Param("yearScope")Integer yearScope);

    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Long infoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Long infoId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}