package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Tripleastudent;

/**
 * Created by BillChen on 2017/10/14.
 */
public interface TripleastudentService {
    int insertTripleastudent(String userId,String reason,String opinion);

    int updateTripleastudent(String userId,String reason,String opinion);

    int deleteTripleastudent(String userId);

    Tripleastudent selectByUserId(String userId);
}
