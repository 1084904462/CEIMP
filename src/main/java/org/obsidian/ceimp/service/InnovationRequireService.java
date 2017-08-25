package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.InnovationRequire;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public interface InnovationRequireService {

    int insertInnovationRequire(String require,int innovationId);

    int updateInnovationRequire(int requireId,String require,int innovationId);

    int deleteInnovationRequire(int requireId);

    InnovationRequire selectByRequireId(int requireId);

    List<InnovationRequire> selectAllByRequire(String require);

    List<InnovationRequire> selectAllByInnovationId(int innovationId);

    List<InnovationRequire> selectAll();
}
