package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ItemScoreMapper;
import org.obsidian.ceimp.entity.ItemScore;
import org.obsidian.ceimp.entity.ItemScoreExample;
import org.obsidian.ceimp.service.ItemScoreService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class ItemScoreServiceImpl implements ItemScoreService {

    @Autowired
    private ItemScoreMapper itemScoreMapper;

    @Transactional
    @Override
    public int insertItemScore(int itemId, String userId, int score) {
        ItemScore itemScore = new ItemScore(itemId,userId,score);
        return itemScoreMapper.insertSelective(itemScore);
    }

    @Transactional
    @Override
    public int updateItemScore(int itemScoreId, int itemId, String userId, int score) {
        ItemScore itemScore = new ItemScore(itemScoreId,itemId,userId,score);
        ItemScoreExample example = new ItemScoreExample();
        example.or().andItemScoreIdEqualTo(itemScoreId);
        return itemScoreMapper.updateByExample(itemScore,example);
    }

    @Transactional
    @Override
    public int deleteItemScore(int itemScoreId) {
        ItemScoreExample example = new ItemScoreExample();
        example.or().andItemScoreIdEqualTo(itemScoreId);
        return itemScoreMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ItemScore selectByItemScoreId(int itemScoreId) {
        ItemScoreExample example = new ItemScoreExample();
        example.or().andItemScoreIdEqualTo(itemScoreId);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByUserId(String userId) {
        ItemScoreExample example = new ItemScoreExample();
        example.or().andUserIdEqualTo(userId);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ItemScoreExample example = new ItemScoreExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        ItemScoreExample example = new ItemScoreExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByItemId(int itemId) {
        ItemScoreExample example = new ItemScoreExample();
        example.or().andItemIdEqualTo(itemId);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByItemIdAndThisYear(int itemId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ItemScoreExample example = new ItemScoreExample();
        example.or().andItemIdEqualTo(itemId).andYearScopeEqualTo(yearScope);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByItemIdAndYearScope(int itemId, int yearScope) {
        ItemScoreExample example = new ItemScoreExample();
        example.or().andItemIdEqualTo(itemId).andYearScopeEqualTo(yearScope);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByUserIdAndItemId(String userId, int itemId) {
        ItemScoreExample example = new ItemScoreExample();
        example.or().andUserIdEqualTo(userId).andItemIdEqualTo(itemId);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByUserIdAndItemIdAndThisYear(String userId, int itemId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ItemScoreExample example = new ItemScoreExample();
        example.or().andUserIdEqualTo(userId).andItemIdEqualTo(itemId).andYearScopeEqualTo(yearScope);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAllByUserIdAndItemIdAndYearScope(String userId, int itemId, int yearScope) {
        ItemScoreExample example = new ItemScoreExample();
        example.or().andUserIdEqualTo(userId).andItemIdEqualTo(itemId).andYearScopeEqualTo(yearScope);
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ItemScore> selectAll() {
        ItemScoreExample example = new ItemScoreExample();
        List<ItemScore> list = itemScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
