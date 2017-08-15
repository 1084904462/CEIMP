package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ReviewStatusMapper;
import org.obsidian.ceimp.entity.ReviewStatus;
import org.obsidian.ceimp.entity.ReviewStatusExample;
import org.obsidian.ceimp.service.ReviewStatusService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class ReviewStatusServiceImpl implements ReviewStatusService {

    @Autowired
    private ReviewStatusMapper reviewStatusMapper;

    @Transactional
    @Override
    public int insertReviewStatus(String userId, int status, int reviewTypeId) {
        ReviewStatus reviewStatus = new ReviewStatus(userId,status,reviewTypeId);
        return reviewStatusMapper.insertSelective(reviewStatus);
    }

    @Transactional
    @Override
    public int updateReviewStatus(int reviewStatusId, String userId, int status, int reviewTypeId) {
        ReviewStatus reviewStatus = new ReviewStatus(reviewStatusId,userId,status,reviewTypeId);
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andReviewStatusIdEqualTo(reviewStatusId);
        return reviewStatusMapper.updateByExample(reviewStatus,example);
    }

    @Transactional
    @Override
    public int deleteReviewStatus(int reviewStatusId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andReviewStatusIdEqualTo(reviewStatusId);
        return reviewStatusMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ReviewStatus selectByReviewStatusId(int reviewStatusId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andReviewStatusIdEqualTo(reviewStatusId);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserId(String userId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByStatus(int status) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusEqualTo(status);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByStatusAndThisYear(int status) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusEqualTo(status).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByStatusAndYearScope(int status, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusEqualTo(status).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByReviewTypeId(int reviewTypeId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andReviewTypeIdEqualTo(reviewTypeId);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByReviewTypeIdAndThisYear(int reviewTypeId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andReviewTypeIdEqualTo(reviewTypeId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByReviewTypeIdAndYearScope(int reviewTypeId, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andReviewTypeIdEqualTo(reviewTypeId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndStatus(String userId, int status) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andStatusEqualTo(status);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndStatusAndThisYear(String userId, int status) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andStatusEqualTo(status).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndStatusAndYearScope(String userId, int status, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andStatusEqualTo(status).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndReviewTypeId(String userId, int reviewTypeId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andReviewTypeIdEqualTo(reviewTypeId);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndThisYear(String userId, int reviewTypeId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andReviewTypeIdEqualTo(reviewTypeId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndYearScope(String userId, int reviewTypeId, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andReviewTypeIdEqualTo(reviewTypeId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByStatusAndReviewTypeId(int status, int reviewTypeId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusEqualTo(status).andReviewTypeIdEqualTo(reviewTypeId);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByStatusAndReviewTypeIdAndThisYear(int status, int reviewTypeId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusEqualTo(status).andReviewTypeIdEqualTo(reviewTypeId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByStatusAndReviewTypeIdAndYearScope(int status, int reviewTypeId, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusEqualTo(status).andReviewTypeIdEqualTo(reviewTypeId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndStatusAndReviewTypeId(String userId, int status, int reviewTypeId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andStatusEqualTo(status).andReviewTypeIdEqualTo(reviewTypeId);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndStatusAndReviewTypeIdAndThisYear(String userId, int status, int reviewTypeId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andStatusEqualTo(status).andReviewTypeIdEqualTo(reviewTypeId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndStatusAndReviewTypeIdAndYearScope(String userId, int status, int reviewTypeId, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andStatusEqualTo(status).andReviewTypeIdEqualTo(reviewTypeId).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAll() {
        ReviewStatusExample example = new ReviewStatusExample();
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
