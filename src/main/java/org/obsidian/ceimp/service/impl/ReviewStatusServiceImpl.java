package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ReviewStatusMapper;
import org.obsidian.ceimp.entity.ReviewStatus;
import org.obsidian.ceimp.entity.ReviewStatusExample;
import org.obsidian.ceimp.service.ReviewStatusService;
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
    public int insertReviewStatus(String userId, int reviewTypeId, int status) {
        ReviewStatus reviewStatus = new ReviewStatus(userId,reviewTypeId,status);
        return reviewStatusMapper.insertSelective(reviewStatus);
    }

    @Transactional
    @Override
    public int updateReviewStatus(int statusId, String userId, int reviewTypeId, int status) {
        ReviewStatus reviewStatus = new ReviewStatus(statusId,userId,reviewTypeId,status);
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusIdEqualTo(statusId);
        return reviewStatusMapper.updateByExample(reviewStatus,example);
    }

    @Transactional
    @Override
    public int deleteReviewStatus(int statusId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusIdEqualTo(statusId);
        return reviewStatusMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ReviewStatus selectByStatusId(int statusId) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andStatusIdEqualTo(statusId);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByYearScope(int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
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
    public List<ReviewStatus> selectAllByReviewTypeIdAndStatus(int reviewTypeId, int status) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andReviewTypeIdEqualTo(reviewTypeId).andStatusEqualTo(status);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByReviewTypeIdAndStatusAndYearScope(int reviewTypeId, int status, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andReviewTypeIdEqualTo(reviewTypeId).andStatusEqualTo(status).andYearScopeEqualTo(yearScope);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndStatus(String userId, int reviewTypeId, int status) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andReviewTypeIdEqualTo(reviewTypeId).andStatusEqualTo(status);
        List<ReviewStatus> list = reviewStatusMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndStatusAndYearScope(String userId, int reviewTypeId, int status, int yearScope) {
        ReviewStatusExample example = new ReviewStatusExample();
        example.or().andUserIdEqualTo(userId).andReviewTypeIdEqualTo(reviewTypeId).andStatusEqualTo(status).andYearScopeEqualTo(yearScope);
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
