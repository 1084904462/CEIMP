package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.dao.AwardMapper;
import org.obsidian.ceimp.entity.*;
import org.obsidian.ceimp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
@Service
public class AwardServiceImpl implements AwardService {

    @Autowired
    private AwardMapper awardMapper;

    @Autowired
    private NgService ngService;

    @Autowired
    private NisService nisService;

    @Autowired
    private PgsService pgsService;

    @Autowired
    private SsService ssService;

    @Autowired
    private TasService tasService;

    @Transactional
    @Override
    public List<AwardBean> selectAllByUserIdAndYearScope(Long userId, Integer yearScope) {
        List<AwardBean> awardBeans = awardMapper.selectAllByUserIdAndYearScope(userId,yearScope);
        Ng ng = ngService.selectByUserIdAndYearScope(userId,yearScope);
        Nis nis = nisService.selectByUserIdAndYearScope(userId,yearScope);
        Pgs pgs = pgsService.selectByUserIdAndYearScope(userId,yearScope);
        Ss ss = ssService.selectByUserIdAndYearScope(userId,yearScope);
        Tas tas = tasService.selectByUserIdAndYearScope(userId,yearScope);
        for(int i=0;i<awardBeans.size();i++){
            if(awardBeans.get(i).getSubName().equals("ng") && ng != null){
                awardBeans.get(i).setIsFilled(1);
            }
            else if(awardBeans.get(i).getSubName().equals("nis") && nis != null){
                awardBeans.get(i).setIsFilled(1);
            }
            else if(awardBeans.get(i).getSubName().equals("pgs") && pgs != null){
                awardBeans.get(i).setIsFilled(1);
            }
            else if(awardBeans.get(i).getSubName().equals("ss") && ss != null){
                awardBeans.get(i).setIsFilled(1);
            }
            else if(awardBeans.get(i).getSubName().equals("tas") && tas != null){
                awardBeans.get(i).setIsFilled(1);
            }
        }
        return awardBeans;
    }
}
