package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.PointScoreMapper;
import org.obsidian.ceimp.entity.PointScore;
import org.obsidian.ceimp.entity.PointScoreExample;
import org.obsidian.ceimp.service.PointScoreService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class PointScoreServiceImpl implements PointScoreService {

    @Autowired
    private PointScoreMapper pointScoreMapper;

    @Transactional
    @Override
    public int insertPointScore(String userId, int pointId, double score) {
        PointScore pointScore = new PointScore(userId,pointId,score);
        return pointScoreMapper.insertSelective(pointScore);
    }

    @Transactional
    @Override
    public int updatePointScore(int pointScoreId, String userId, int pointId, double score) {
        PointScore pointScore = new PointScore(pointScoreId,userId,pointId,score);
        PointScoreExample example = new PointScoreExample();
        example.or().andPointScoreIdEqualTo(pointScoreId);
        return pointScoreMapper.updateByExample(pointScore,example);
    }

    @Transactional
    @Override
    public int deletePointScore(int pointScoreId) {
        PointScoreExample example = new PointScoreExample();
        example.or().andPointScoreIdEqualTo(pointScoreId);
        return pointScoreMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public PointScore selectByPointScoreId(int pointScoreId) {
        PointScoreExample example = new PointScoreExample();
        example.or().andPointScoreIdEqualTo(pointScoreId);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByThisYear() {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointScoreExample example = new PointScoreExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByYearScope(int yearScope) {
        PointScoreExample example = new PointScoreExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByUserId(String userId) {
        PointScoreExample example = new PointScoreExample();
        example.or().andUserIdEqualTo(userId);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointScoreExample example = new PointScoreExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        PointScoreExample example = new PointScoreExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByPointId(int pointId) {
        PointScoreExample example = new PointScoreExample();
        example.or().andPointIdEqualTo(pointId);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByPointIdAndThisYear(int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointScoreExample example = new PointScoreExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByPointIdAndYearScope(int pointId, int yearScope) {
        PointScoreExample example = new PointScoreExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByUserIdAndPointId(String userId, int pointId) {
        PointScoreExample example = new PointScoreExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByUserIdAndPointIdAndThisYear(String userId, int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointScoreExample example = new PointScoreExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAllByUserIdAndPointIdAndYearScope(String userId, int pointId, int yearScope) {
        PointScoreExample example = new PointScoreExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointScore> selectAll() {
        PointScoreExample example = new PointScoreExample();
        List<PointScore> list = pointScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
