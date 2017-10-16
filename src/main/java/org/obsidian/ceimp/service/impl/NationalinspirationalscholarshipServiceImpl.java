package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NationalinspirationalscholarshipShowBean;
import org.obsidian.ceimp.dao.NationalinspirationalscholarshipMapper;
import org.obsidian.ceimp.entity.Nationalinspirationalscholarship;
import org.obsidian.ceimp.entity.NationalinspirationalscholarshipExample;
import org.obsidian.ceimp.service.NationalinspirationalscholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
@Service
public class NationalinspirationalscholarshipServiceImpl implements NationalinspirationalscholarshipService {

    @Autowired
    private NationalinspirationalscholarshipMapper nationalinspirationalscholarshipMapper;

    @Transactional
    @Override
    public int insertNationalinspirationalscholarship(String userId, String date1, String award1, String unit1, String date2, String award2, String unit2, String date3, String award3, String unit3, String date4, String award4, String unit4, String resident, String incomeSource, String monthIncome, String familySum, String address, String postalCode, String situation, String applyReason, String opinion) {
        Nationalinspirationalscholarship nationalinspirationalscholarship = new Nationalinspirationalscholarship();
        nationalinspirationalscholarship.setUserid(userId);
        nationalinspirationalscholarship.setDate1(date1);
        nationalinspirationalscholarship.setAward1(award1);
        nationalinspirationalscholarship.setUnit1(unit1);
        nationalinspirationalscholarship.setDate2(date2);
        nationalinspirationalscholarship.setAward2(award2);
        nationalinspirationalscholarship.setUnit2(unit2);
        nationalinspirationalscholarship.setDate3(date3);
        nationalinspirationalscholarship.setAward3(award3);
        nationalinspirationalscholarship.setUnit3(unit3);
        nationalinspirationalscholarship.setDate4(date4);
        nationalinspirationalscholarship.setAward4(award4);
        nationalinspirationalscholarship.setUnit4(unit4);
        nationalinspirationalscholarship.setResident(resident);
        nationalinspirationalscholarship.setIncomesource(incomeSource);
        nationalinspirationalscholarship.setMonthincome(monthIncome);
        nationalinspirationalscholarship.setFamilysum(familySum);
        nationalinspirationalscholarship.setAddress(address);
        nationalinspirationalscholarship.setPostalcode(postalCode);
        nationalinspirationalscholarship.setSituation(situation);
        nationalinspirationalscholarship.setApplyreason(applyReason);
        nationalinspirationalscholarship.setOpinion(opinion);
        return nationalinspirationalscholarshipMapper.insertSelective(nationalinspirationalscholarship);
    }

    @Transactional
    @Override
    public int updateNationalinspirationalscholarship(String userId, String date1, String award1, String unit1, String date2, String award2, String unit2, String date3, String award3, String unit3, String date4, String award4, String unit4, String resident, String incomeSource, String monthIncome, String familySum, String address, String postalCode, String situation, String applyReason, String opinion) {
        Nationalinspirationalscholarship nationalinspirationalscholarship = new Nationalinspirationalscholarship();
        nationalinspirationalscholarship.setUserid(userId);
        nationalinspirationalscholarship.setDate1(date1);
        nationalinspirationalscholarship.setAward1(award1);
        nationalinspirationalscholarship.setUnit1(unit1);
        nationalinspirationalscholarship.setDate2(date2);
        nationalinspirationalscholarship.setAward2(award2);
        nationalinspirationalscholarship.setUnit2(unit2);
        nationalinspirationalscholarship.setDate3(date3);
        nationalinspirationalscholarship.setAward3(award3);
        nationalinspirationalscholarship.setUnit3(unit3);
        nationalinspirationalscholarship.setDate4(date4);
        nationalinspirationalscholarship.setAward4(award4);
        nationalinspirationalscholarship.setUnit4(unit4);
        nationalinspirationalscholarship.setResident(resident);
        nationalinspirationalscholarship.setIncomesource(incomeSource);
        nationalinspirationalscholarship.setMonthincome(monthIncome);
        nationalinspirationalscholarship.setFamilysum(familySum);
        nationalinspirationalscholarship.setAddress(address);
        nationalinspirationalscholarship.setPostalcode(postalCode);
        nationalinspirationalscholarship.setSituation(situation);
        nationalinspirationalscholarship.setApplyreason(applyReason);
        nationalinspirationalscholarship.setOpinion(opinion);
        NationalinspirationalscholarshipExample example = new NationalinspirationalscholarshipExample();
        example.or().andUseridEqualTo(userId);
        return nationalinspirationalscholarshipMapper.updateByExampleSelective(nationalinspirationalscholarship,example);
    }

    @Transactional
    @Override
    public int deleteNationalinspirationalscholarship(String userId) {
        NationalinspirationalscholarshipExample example = new NationalinspirationalscholarshipExample();
        example.or().andUseridEqualTo(userId);
        return nationalinspirationalscholarshipMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public Nationalinspirationalscholarship selectByUserId(String userId) {
        NationalinspirationalscholarshipExample example = new NationalinspirationalscholarshipExample();
        example.or().andUseridEqualTo(userId);
        List<Nationalinspirationalscholarship> list = nationalinspirationalscholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<NationalinspirationalscholarshipShowBean> selectAllNationalinspirationalscholarship() {
        List<NationalinspirationalscholarshipShowBean> list = nationalinspirationalscholarshipMapper.selectAllNationalinspirationalscholarship();
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public int updateAllOpinion(String opinion) {
        Nationalinspirationalscholarship nationalinspirationalscholarship = new Nationalinspirationalscholarship();
        nationalinspirationalscholarship.setOpinion(opinion);
        NationalinspirationalscholarshipExample example = new NationalinspirationalscholarshipExample();
        return nationalinspirationalscholarshipMapper.updateByExampleSelective(nationalinspirationalscholarship,example);
    }
}
