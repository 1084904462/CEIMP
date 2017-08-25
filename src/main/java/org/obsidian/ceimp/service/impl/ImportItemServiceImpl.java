package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ImportItemMapper;
import org.obsidian.ceimp.entity.ImportItem;
import org.obsidian.ceimp.entity.ImportItemExample;
import org.obsidian.ceimp.service.ImportItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
@Service
public class ImportItemServiceImpl implements ImportItemService {

    @Autowired
    private ImportItemMapper importItemMapper;

    @Transactional
    @Override
    public int insertImportItem(String userId, int examFail, int makeUp, double cet4, double pe, double gpa) {
        ImportItem importItem = new ImportItem(userId,examFail,makeUp,cet4,pe,gpa);
        return importItemMapper.insertSelective(importItem);
    }

    @Transactional
    @Override
    public int updateImportItem(int importId, String userId, int examFail, int makeUp, double cet4, double pe, double gpa) {
        ImportItem importItem = new ImportItem(importId,userId,examFail,makeUp,cet4,pe,gpa);
        ImportItemExample example = new ImportItemExample();
        example.or().andImportIdEqualTo(importId);
        return importItemMapper.updateByExample(importItem,example);
    }

    @Transactional
    @Override
    public int deleteImportItem(int importId) {
        ImportItemExample example = new ImportItemExample();
        example.or().andImportIdEqualTo(importId);
        return importItemMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ImportItem selectByImportId(int importId) {
        ImportItemExample example = new ImportItemExample();
        example.or().andImportIdEqualTo(importId);
        List<ImportItem> list = importItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ImportItem> selectAllByYearScope(int yearScope) {
        ImportItemExample example = new ImportItemExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<ImportItem> list = importItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ImportItem> selectAllByUserId(String userId) {
        ImportItemExample example = new ImportItemExample();
        example.or().andUserIdEqualTo(userId);
        List<ImportItem> list = importItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ImportItem> selectAllByUserIdAndYearScope(String userId,int yearScope){
        ImportItemExample example = new ImportItemExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<ImportItem> list = importItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ImportItem> selectAll(){
        ImportItemExample example = new ImportItemExample();
        List<ImportItem> list = importItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
