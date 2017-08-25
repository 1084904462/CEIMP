package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.BasicInput;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public interface BasicInputService {

    int insertBasicInput(String userId,int pointId,String evidence,int times,double subjectiveScore,String addition);

    int updateBasicInput(int inputId,String userId,int pointId,String evidence,int times,double subjectiveScore,String addition);

    int deleteBasicInput(int inputId);

    BasicInput selectByInputId(int inputId);

    List<BasicInput> selectAllByUserId(String userId);

    List<BasicInput> selectAllByYearScope(int yearScope);

    List<BasicInput> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<BasicInput> selectAll();
}
