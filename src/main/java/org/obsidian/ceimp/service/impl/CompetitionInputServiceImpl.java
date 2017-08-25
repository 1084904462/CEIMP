package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.CompetitionInputMapper;
import org.obsidian.ceimp.entity.CompetitionInput;
import org.obsidian.ceimp.entity.CompetitionInputExample;
import org.obsidian.ceimp.service.CompetitionInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class CompetitionInputServiceImpl implements CompetitionInputService {

    @Autowired
    private CompetitionInputMapper competitionInputMapper;


    @Transactional
    @Override
    public int insertCompetitionInput(String userId, int competitionId, int competitionLevelId, int competitionTypeId, int awardLevelId, int isRelevant, int isGroup, int rankId, String evidence, String additionCompetition) {
        CompetitionInput competitionInput = new CompetitionInput(userId,competitionId,competitionLevelId,competitionTypeId,awardLevelId,isRelevant,isGroup,rankId,evidence,additionCompetition);
        return competitionInputMapper.insertSelective(competitionInput);
    }

    @Transactional
    @Override
    public int updateCompetitionInput(int inputId, String userId, int competitionId, int competitionLevelId, int competitionTypeId, int awardLevelId, int isRelevant, int isGroup, int rankId, String evidence, String additionCompetition) {
        CompetitionInput competitionInput = new CompetitionInput(inputId,userId,competitionId,competitionLevelId,competitionTypeId,awardLevelId,isRelevant,isGroup,rankId,evidence,additionCompetition);
        CompetitionInputExample example = new CompetitionInputExample();
        example.or().andInputIdEqualTo(inputId);
        return competitionInputMapper.updateByExample(competitionInput,example);
    }

    @Transactional
    @Override
    public int deleteCompetitionInput(int inputId) {
        CompetitionInputExample example = new CompetitionInputExample();
        example.or().andInputIdEqualTo(inputId);
        return competitionInputMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public CompetitionInput selectByInputId(int inputId) {
        CompetitionInputExample example = new CompetitionInputExample();
        example.or().andInputIdEqualTo(inputId);
        List<CompetitionInput> list = competitionInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return  null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<CompetitionInput> selectAllByYearScope(int yearScope) {
        CompetitionInputExample example = new CompetitionInputExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<CompetitionInput> list = competitionInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionInput> selectAllByUserId(String userId) {
        CompetitionInputExample example = new CompetitionInputExample();
        example.or().andUserIdEqualTo(userId);
        List<CompetitionInput> list = competitionInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionInput> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        CompetitionInputExample example = new CompetitionInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<CompetitionInput> list = competitionInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionInput> selectAll() {
        CompetitionInputExample example = new CompetitionInputExample();
        List<CompetitionInput> list = competitionInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
