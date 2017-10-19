package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NationalGrantOpinionBean;
import org.obsidian.ceimp.bean.NationalGrantShowBean;
import org.obsidian.ceimp.dao.NationalGrantMapper;
import org.obsidian.ceimp.entity.NationalGrant;
import org.obsidian.ceimp.entity.NationalGrantExample;
import org.obsidian.ceimp.service.NationalGrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/10/18.
 */
@Service
public class NationalGrantServiceImpl implements NationalGrantService {

    @Autowired
    private NationalGrantMapper nationalGrantMapper;

    @Transactional
    @Override
    public int insertNationalGrant(String userId, String resident, String incomeSource, String monthIncome,
                                   String familySum, String address, String postalCode,
                                   String fName1, String age1, String relation1, String workPlace1,
                                   String fName2, String age2, String relation2, String workPlace2,
                                   String fName3, String age3, String relation3, String workPlace3,
                                   String fName4, String age4, String relation4, String workPlace4,
                                   String fName5, String age5, String relation5, String workPlace5,
                                   String situation, String applyReason) {
        NationalGrant nationalGrant = new NationalGrant();
        nationalGrant.setUserid(userId);
        nationalGrant.setResident(resident);
        nationalGrant.setIncomeSource(incomeSource);
        nationalGrant.setMonthIncome(monthIncome);
        nationalGrant.setFamilySum(familySum);
        nationalGrant.setAddress(address);
        nationalGrant.setPostalCode(postalCode);
        nationalGrant.setfName1(fName1);
        nationalGrant.setAge1(age1);
        nationalGrant.setRelation1(relation1);
        nationalGrant.setWorkPlace1(workPlace1);
        nationalGrant.setfName2(fName2);
        nationalGrant.setAge2(age2);
        nationalGrant.setRelation2(relation2);
        nationalGrant.setWorkPlace2(workPlace2);
        nationalGrant.setfName3(fName3);
        nationalGrant.setAge3(age3);
        nationalGrant.setRelation3(relation3);
        nationalGrant.setWorkPlace3(workPlace3);
        nationalGrant.setfName4(fName4);
        nationalGrant.setAge4(age4);
        nationalGrant.setRelation4(relation4);
        nationalGrant.setWorkPlace4(workPlace4);
        nationalGrant.setfName5(fName5);
        nationalGrant.setAge5(age5);
        nationalGrant.setRelation5(relation5);
        nationalGrant.setWorkPlace5(workPlace5);
        nationalGrant.setSituation(situation);
        nationalGrant.setApplyReason(applyReason);
        return nationalGrantMapper.insertSelective(nationalGrant);
    }

    @Transactional
    @Override
    public int updateNationalGrant(String userId, String resident, String incomeSource, String monthIncome,
                                   String familySum, String address, String postalCode,
                                   String fName1, String age1, String relation1, String workPlace1,
                                   String fName2, String age2, String relation2, String workPlace2,
                                   String fName3, String age3, String relation3, String workPlace3,
                                   String fName4, String age4, String relation4, String workPlace4,
                                   String fName5, String age5, String relation5, String workPlace5,
                                   String situation, String applyReason) {
        NationalGrant nationalGrant = new NationalGrant();
        nationalGrant.setUserid(userId);
        nationalGrant.setResident(resident);
        nationalGrant.setIncomeSource(incomeSource);
        nationalGrant.setMonthIncome(monthIncome);
        nationalGrant.setFamilySum(familySum);
        nationalGrant.setAddress(address);
        nationalGrant.setPostalCode(postalCode);
        nationalGrant.setfName1(fName1);
        nationalGrant.setAge1(age1);
        nationalGrant.setRelation1(relation1);
        nationalGrant.setWorkPlace1(workPlace1);
        nationalGrant.setfName2(fName2);
        nationalGrant.setAge2(age2);
        nationalGrant.setRelation2(relation2);
        nationalGrant.setWorkPlace2(workPlace2);
        nationalGrant.setfName3(fName3);
        nationalGrant.setAge3(age3);
        nationalGrant.setRelation3(relation3);
        nationalGrant.setWorkPlace3(workPlace3);
        nationalGrant.setfName4(fName4);
        nationalGrant.setAge4(age4);
        nationalGrant.setRelation4(relation4);
        nationalGrant.setWorkPlace4(workPlace4);
        nationalGrant.setfName5(fName5);
        nationalGrant.setAge5(age5);
        nationalGrant.setRelation5(relation5);
        nationalGrant.setWorkPlace5(workPlace5);
        nationalGrant.setSituation(situation);
        nationalGrant.setApplyReason(applyReason);
        NationalGrantExample example = new NationalGrantExample();
        example.or().andUseridEqualTo(userId);
        return nationalGrantMapper.updateByExampleSelective(nationalGrant,example);
    }

    @Transactional
    @Override
    public int updateNationalGrant(String userId, String opinion) {
        NationalGrant nationalGrant = new NationalGrant();
        nationalGrant.setOpinion(opinion);
        NationalGrantExample example = new NationalGrantExample();
        example.or().andUseridEqualTo(userId);
        return nationalGrantMapper.updateByExampleSelective(nationalGrant,example);
    }

    @Transactional
    @Override
    public int deleteNationalGrant(String userId) {
        NationalGrantExample example = new NationalGrantExample();
        example.or().andUseridEqualTo(userId);
        return nationalGrantMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public NationalGrant selectByUserId(String userId) {
        NationalGrantExample example = new NationalGrantExample();
        example.or().andUseridEqualTo(userId);
        List<NationalGrant> list = nationalGrantMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<NationalGrantShowBean> selectAllNationalGrant() {
        List<NationalGrantShowBean> list = nationalGrantMapper.selectAllNationalGrant();
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<NationalGrantOpinionBean> selectAllNationalGrantOpinion() {
        List<NationalGrantOpinionBean> list = nationalGrantMapper.selectAllNationalGrantOpinion();
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
