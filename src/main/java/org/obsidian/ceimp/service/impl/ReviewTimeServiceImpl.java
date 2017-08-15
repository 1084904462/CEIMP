package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ReviewTimeMapper;
import org.obsidian.ceimp.entity.ReviewTime;
import org.obsidian.ceimp.entity.ReviewTimeExample;
import org.obsidian.ceimp.service.ReviewTimeService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class ReviewTimeServiceImpl implements ReviewTimeService {

    @Autowired
    private ReviewTimeMapper reviewTimeMapper;

    @Transactional
    @Override
    public int insertReviewTime(long reviewStart, long reviewEnd, int reviewTypeId) {
        ReviewTime reviewTime = new ReviewTime(reviewStart,reviewEnd,reviewTypeId);
        return reviewTimeMapper.insertSelective(reviewTime);
    }

    @Transactional
    @Override
    public int updateReviewTime(int reviewTimeId, long reviewStart, long reviewEnd, int reviewTypeId) {
        ReviewTime reviewTime = new ReviewTime(reviewTimeId,reviewStart,reviewEnd,reviewTypeId);
        ReviewTimeExample example = new ReviewTimeExample();
        example.or().andReviewTimeIdEqualTo(reviewTimeId);
        return reviewTimeMapper.updateByExample(reviewTime,example);
    }

    @Transactional
    @Override
    public int deleteReviewTime(int reviewTimeId) {
        ReviewTimeExample example = new ReviewTimeExample();
        example.or().andReviewTimeIdEqualTo(reviewTimeId);
        return reviewTimeMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ReviewTime selectByReviewTimeId(int reviewTimeId) {
        ReviewTimeExample example = new ReviewTimeExample();
        example.or().andReviewTimeIdEqualTo(reviewTimeId);
        List<ReviewTime> list = reviewTimeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ReviewTime> selectAllByThisYear() {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ReviewTimeExample example = new ReviewTimeExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<ReviewTime> list = reviewTimeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewTime> selectAllByYearScope(int yearScope) {
        ReviewTimeExample example = new ReviewTimeExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<ReviewTime> list = reviewTimeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewTime> selectAll() {
        ReviewTimeExample example = new ReviewTimeExample();
        List<ReviewTime> list = reviewTimeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
