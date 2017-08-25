package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Innovation;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public interface InnovationService {

    int insertInnovation(String content,int type);

    int updateInnovation(int innovationId,String content,int type);

    int deleteInnovation(int innovationId);

    Innovation selectByInnovationId(int innovationId);

    List<Innovation> selectAllByType(int type);

    List<Innovation> selectAll();
}
