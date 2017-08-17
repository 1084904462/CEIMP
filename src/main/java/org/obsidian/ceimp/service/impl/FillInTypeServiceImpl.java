package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.FillInTypeMapper;
import org.obsidian.ceimp.entity.FillInType;
import org.obsidian.ceimp.entity.FillInTypeExample;
import org.obsidian.ceimp.service.FillInTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class FillInTypeServiceImpl implements FillInTypeService {

    @Autowired
    private FillInTypeMapper fillInTypeMapper;

    @Transactional
    @Override
    public int insertFillInType(String type) {
        FillInType fillInType = new FillInType(type);
        return fillInTypeMapper.insertSelective(fillInType);
    }

    @Transactional
    @Override
    public int updateFillInType(int typeId, String type) {
        FillInType fillInType = new FillInType(typeId,type);
        FillInTypeExample example = new FillInTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        return fillInTypeMapper.updateByExample(fillInType,example);
    }

    @Transactional
    @Override
    public int deleteFillInType(int typeId) {
        FillInTypeExample example = new FillInTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        return fillInTypeMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public FillInType selectByTypeId(int typeId) {
        FillInTypeExample example = new FillInTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        List<FillInType> list = fillInTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public FillInType selectByType(String type) {
        FillInTypeExample example = new FillInTypeExample();
        example.or().andTypeEqualTo(type);
        List<FillInType> list = fillInTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<FillInType> selectAllByType(String type) {
        type = "%" + type + "%";
        FillInTypeExample example = new FillInTypeExample();
        example.or().andTypeLike(type);
        List<FillInType> list = fillInTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<FillInType> selectAll(){
        FillInTypeExample example = new FillInTypeExample();
        List<FillInType> list = fillInTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
