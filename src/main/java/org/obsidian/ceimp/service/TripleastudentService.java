package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.TripleastudentShowBean;
import org.obsidian.ceimp.entity.Tripleastudent;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
public interface TripleastudentService {
    int insertTripleastudent(String userId,String reason,String opinion);

    int updateTripleastudent(String userId,String reason,String opinion);

    int deleteTripleastudent(String userId);

    Tripleastudent selectByUserId(String userId);

    List<TripleastudentShowBean> selectAllTripleastudent();

    int updateAllOpinion(String opinion);
}
