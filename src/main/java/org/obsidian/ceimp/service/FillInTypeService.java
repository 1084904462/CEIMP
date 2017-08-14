package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.FillInType;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface FillInTypeService {

    int insertFillInType(String fillInType);

    int updateFillInType(int fillInTypeId,String type);

    int deleteFillInType(int fillInTypeId);

    FillInType selectByFillInTypeId(int fillInTypeId);

    FillInType selectByFillInType(String type);

    List<FillInType> selectAllByFillInType(String type);

    List<FillInType> selectAll();
}
