package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ImportItem;
import org.obsidian.ceimp.entity.ImportItemExample;

public interface ImportItemMapper {
    long countByExample(ImportItemExample example);

    int deleteByExample(ImportItemExample example);

    int insert(ImportItem record);

    int insertSelective(ImportItem record);

    List<ImportItem> selectByExample(ImportItemExample example);

    int updateByExampleSelective(@Param("record") ImportItem record, @Param("example") ImportItemExample example);

    int updateByExample(@Param("record") ImportItem record, @Param("example") ImportItemExample example);
}