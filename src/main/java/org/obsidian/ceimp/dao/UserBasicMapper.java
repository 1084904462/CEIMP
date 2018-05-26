package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.BasicScholarshipBean;
import org.obsidian.ceimp.bean.InsertUserBasicBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserSearchBean;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.entity.UserBasicExample;

import java.util.List;

public interface UserBasicMapper {
    List<InsertUserBasicBean> getInsertUserBasicBeanList();

    int insertUserBasicBeanList(List<InsertUserBasicBean> insertUserBasicBeanList);

    List<UserSearchBean> searchUser(@Param("list") List<String> list, @Param("schoolId")Long schoolId,@Param("yearScope")Integer yearScope);

    int update(@Param("userId")Long userId,@Param("bean") BasicScholarshipBean bean);

    UserBasicBean getBean(Long userId);

    long countByExample(UserBasicExample example);

    int deleteByExample(UserBasicExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserBasic record);

    int insertSelective(UserBasic record);

    List<UserBasic> selectByExample(UserBasicExample example);

    UserBasic selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserBasic record, @Param("example") UserBasicExample example);

    int updateByExample(@Param("record") UserBasic record, @Param("example") UserBasicExample example);

    int updateByPrimaryKeySelective(UserBasic record);

    int updateByPrimaryKey(UserBasic record);
}