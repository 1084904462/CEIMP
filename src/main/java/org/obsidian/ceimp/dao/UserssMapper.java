package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.ResetUserssBean;
import org.obsidian.ceimp.entity.Userss;
import org.obsidian.ceimp.entity.UserssExample;

import java.util.List;

public interface UserssMapper {
    List<ResetUserssBean> selectAllResetUserssBean();

    int updatePassword(@Param("userId") String userId,@Param("password") String password);

    Userss selectByUserId(String userId);

    List<String> selectAllUserId();

    long countByExample(UserssExample example);

    int deleteByExample(UserssExample example);

    int insert(Userss record);

    int insertSelective(Userss record);

    List<Userss> selectByExample(UserssExample example);

    int updateByExampleSelective(@Param("record") Userss record, @Param("example") UserssExample example);

    int updateByExample(@Param("record") Userss record, @Param("example") UserssExample example);
}