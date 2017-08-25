package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.InputReviewMapper;
import org.obsidian.ceimp.entity.InputReview;
import org.obsidian.ceimp.entity.InputReviewExample;
import org.obsidian.ceimp.service.InputReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
@Service
public class InputReviewServiceImpl implements InputReviewService {

    @Autowired
    private InputReviewMapper inputReviewMapper;

    @Transactional
    @Override
    public int insertInputReview(int inputId, int inputType, int reviewStatus) {
        InputReview inputReview = new InputReview(inputId,inputType,reviewStatus);
        return inputReviewMapper.insertSelective(inputReview);
    }

    @Transactional
    @Override
    public int updateInputReview(int reviewId, int inputId, int inputType, int reviewStatus) {
        InputReview inputReview = new InputReview(reviewId,inputId,inputType,reviewStatus);
        InputReviewExample example = new InputReviewExample();
        example.or().andReviewIdEqualTo(reviewId);
        return inputReviewMapper.updateByExample(inputReview,example);
    }

    @Transactional
    @Override
    public int deleteInputReview(int reviewId) {
        InputReviewExample example = new InputReviewExample();
        example.or().andReviewIdEqualTo(reviewId);
        return inputReviewMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public InputReview selectByReviewId(int reviewId) {
        InputReviewExample example = new InputReviewExample();
        example.or().andReviewIdEqualTo(reviewId);
        List<InputReview> list = inputReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public InputReview selectByInputIdAndInputType(int inputId, int inputType) {
        InputReviewExample example = new InputReviewExample();
        example.or().andInputIdEqualTo(inputId).andInputTypeEqualTo(inputType);
        List<InputReview> list = inputReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<InputReview> selectAllByInputType(int inputType) {
        InputReviewExample example = new InputReviewExample();
        example.or().andInputTypeEqualTo(inputType);
        List<InputReview> list = inputReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<InputReview> selectAll() {
        InputReviewExample example = new InputReviewExample();
        List<InputReview> list = inputReviewMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
