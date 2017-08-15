package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ImportItem;

import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
public interface ImportItemService {

    int insertImportItem(String userId,int examFail,int makeUp,int cet4,double pe,double gpa);

    int updateImportItem(int importId,String userId,int examFail,int makeUp,int cet4,double pe,double gpa);

    int deleteImportItem(int importId);

    ImportItem selectByImportId(int importId);

    List<ImportItem> selectAllByUserId(String userId);

    List<ImportItem> selectAll();
}
