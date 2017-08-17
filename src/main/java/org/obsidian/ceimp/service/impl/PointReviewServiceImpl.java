package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.PointReviewMapper;
import org.obsidian.ceimp.entity.PointReview;
import org.obsidian.ceimp.entity.PointReviewExample;
import org.obsidian.ceimp.service.PointReviewService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class PointReviewServiceImpl implements PointReviewService {

    @Autowired
    private PointReviewMapper pointReviewMapper;

    @Transactional
    @Override
    public int insertPointReview(String userId, int pointId, int reviewStatus) {
        PointReview pointReview = new PointReview(userId,pointId,reviewStatus);
        return pointReviewMapper.insertSelective(pointReview);
    }

    @Transactional
    @Override
    public int updatePointReview(int reviewId, String userId, int pointId, int reviewStatus) {
        PointReview pointReview = new PointReview(reviewId,userId,pointId,reviewStatus);
        PointReviewExample example = new PointReviewExample();
        example.or().andReviewIdEqualTo(reviewId);
        return pointReviewMapper.updateByExample(pointReview,example);
    }

    @Transactional
    @Override
    public int deletePointReview(int reviewId) {
        PointReviewExample example = new PointReviewExample();
        example.or().andReviewIdEqualTo(reviewId);
        return pointReviewMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public PointReview selectByReviewId(int reviewId) {
        PointReviewExample example = new PointReviewExample();
        example.or().andReviewIdEqualTo(reviewId);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByThisYear() {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointReviewExample example = new PointReviewExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByYearScope(int yearScope) {
        PointReviewExample example = new PointReviewExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserId(String userId) {
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByPointId(int pointId) {
        PointReviewExample example = new PointReviewExample();
        example.or().andPointIdEqualTo(pointId);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByPointIdAndThisYear(int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointReviewExample example = new PointReviewExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByPointIdAndYearScope(int pointId, int yearScope) {
        PointReviewExample example = new PointReviewExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByReviewStatus(int reviewStatus) {
        PointReviewExample example = new PointReviewExample();
        example.or().andReviewStatusEqualTo(reviewStatus);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByReviewStatusAndThisYear(int reviewStatus) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointReviewExample example = new PointReviewExample();
        example.or().andReviewStatusEqualTo(reviewStatus).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByReviewStatusAndYearScope(int reviewStatus, int yearScope) {
        PointReviewExample example = new PointReviewExample();
        example.or().andReviewStatusEqualTo(reviewStatus).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndPointId(String userId, int pointId) {
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndPointIdAndThisYear(String userId, int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndPointIdAndYearScope(String userId, int pointId, int yearScope) {
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndReviewStatus(String userId, int reviewStatus) {
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andReviewStatusEqualTo(reviewStatus);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndReviewStatusAndThisYear(String userId, int reviewStatus) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andReviewStatusEqualTo(reviewStatus).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndReviewStatusAndYearScope(String userId, int reviewStatus, int yearScope) {
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andReviewStatusEqualTo(reviewStatus).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByPointIdAndReviewStatus(int pointId, int reviewStatus) {
        PointReviewExample example = new PointReviewExample();
        example.or().andPointIdEqualTo(pointId).andReviewStatusEqualTo(reviewStatus);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByPointIdAndReviewStatusAndThisYear(int pointId, int reviewStatus) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointReviewExample example = new PointReviewExample();
        example.or().andPointIdEqualTo(pointId).andReviewStatusEqualTo(reviewStatus).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByPointIdAndReviewStatusAndYearScope(int pointId, int reviewStatus, int yearScope) {
        PointReviewExample example = new PointReviewExample();
        example.or().andPointIdEqualTo(pointId).andReviewStatusEqualTo(reviewStatus).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndPointIdAndReviewStatus(String userId, int pointId, int reviewStatus) {
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andReviewStatusEqualTo(reviewStatus);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndPointIdAndReviewStatusAndThisYear(String userId, int pointId, int reviewStatus) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andReviewStatusEqualTo(reviewStatus).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAllByUserIdAndPointIdAndReviewStatusAndYearScope(String userId, int pointId, int reviewStatus, int yearScope) {
        PointReviewExample example = new PointReviewExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andReviewStatusEqualTo(reviewStatus).andYearScopeEqualTo(yearScope);
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<PointReview> selectAll() {
        PointReviewExample example = new PointReviewExample();
        List<PointReview> list = pointReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
