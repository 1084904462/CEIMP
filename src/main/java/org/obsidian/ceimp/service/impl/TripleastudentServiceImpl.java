package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.TripleastudentShowBean;
import org.obsidian.ceimp.dao.TripleastudentMapper;
import org.obsidian.ceimp.entity.Tripleastudent;
import org.obsidian.ceimp.entity.TripleastudentExample;
import org.obsidian.ceimp.service.TripleastudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
@Service
public class TripleastudentServiceImpl implements TripleastudentService {

    @Autowired
    private TripleastudentMapper tripleastudentMapper;

    @Transactional
    @Override
    public int insertTripleastudent(String userId, String reason,String opinion) {
        Tripleastudent tripleastudent = new Tripleastudent();
        tripleastudent.setUserid(userId);
        tripleastudent.setReason(reason);
        tripleastudent.setOpinion(opinion);
        return tripleastudentMapper.insertSelective(tripleastudent);
    }

    @Transactional
    @Override
    public int updateTripleastudent(String userId, String reason,String opinion) {
        Tripleastudent tripleastudent = new Tripleastudent();
        tripleastudent.setUserid(userId);
        tripleastudent.setReason(reason);
        tripleastudent.setOpinion(opinion);
        TripleastudentExample example = new TripleastudentExample();
        example.or().andUseridEqualTo(userId);
        return tripleastudentMapper.updateByExampleSelective(tripleastudent,example);
    }

    @Transactional
    @Override
    public int deleteTripleastudent(String userId) {
        TripleastudentExample example = new TripleastudentExample();
        example.or().andUseridEqualTo(userId);
        return tripleastudentMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public Tripleastudent selectByUserId(String userId) {
        TripleastudentExample example = new TripleastudentExample();
        example.or().andUseridEqualTo(userId);
        List<Tripleastudent> list = tripleastudentMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<TripleastudentShowBean> selectAllTripleastudent() {
        List<TripleastudentShowBean> list = tripleastudentMapper.selectAllTripleastudent();
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public int updateAllOpinion(String opinion) {
        Tripleastudent tripleastudent = new Tripleastudent();
        tripleastudent.setOpinion(opinion);
        TripleastudentExample example = new TripleastudentExample();
        return tripleastudentMapper.updateByExampleSelective(tripleastudent,example);
    }
}
