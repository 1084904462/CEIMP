package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.FillInType;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface FillInTypeService {

    int insertFillInType(String type);

    int updateFillInType(int typeId,String type);

    int deleteFillInType(int typeId);

    FillInType selectByTypeId(int typeId);

    FillInType selectByType(String type);

    List<FillInType> selectAllByType(String type);

    List<FillInType> selectAll();
}
