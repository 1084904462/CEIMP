package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ReviewTypeMapper;
import org.obsidian.ceimp.entity.ReviewType;
import org.obsidian.ceimp.entity.ReviewTypeExample;
import org.obsidian.ceimp.service.ReviewTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class ReviewTypeServiceImpl implements ReviewTypeService {

    @Autowired
    private ReviewTypeMapper reviewTypeMapper;

    @Transactional
    @Override
    public int insertReviewType(String type) {
        ReviewType reviewType = new ReviewType(type);
        return reviewTypeMapper.insertSelective(reviewType);
    }

    @Transactional
    @Override
    public int updateReviewType(int reviewTypeId, String type) {
        ReviewType reviewType = new ReviewType(reviewTypeId,type);
        ReviewTypeExample example = new ReviewTypeExample();
        example.or().andReviewTypeIdEqualTo(reviewTypeId);
        return reviewTypeMapper.updateByExample(reviewType,example);
    }

    @Transactional
    @Override
    public int deleteReviewType(int reviewTypeId) {
        ReviewTypeExample example = new ReviewTypeExample();
        example.or().andReviewTypeIdEqualTo(reviewTypeId);
        return reviewTypeMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ReviewType selectByReviewTypeId(int reviewTypeId) {
        ReviewTypeExample example = new ReviewTypeExample();
        example.or().andReviewTypeIdEqualTo(reviewTypeId);
        List<ReviewType> list = reviewTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public ReviewType selectByType(String type) {
        ReviewTypeExample example = new ReviewTypeExample();
        example.or().andTypeEqualTo(type);
        List<ReviewType> list = reviewTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ReviewType> selectAllByType(String type) {
        type = "%" + type + "%";
        ReviewTypeExample example = new ReviewTypeExample();
        example.or().andTypeLike(type);
        List<ReviewType> list = reviewTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ReviewType> selectAll() {
        ReviewTypeExample example = new ReviewTypeExample();
        List<ReviewType> list = reviewTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
