package org.obsidian.ceimp.controller.evaluation;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.*;
import org.obsidian.ceimp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BillChen on 2017/8/20.
 */
@Controller
public class ScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private ScholarshipBlockService scholarshipBlockService;

    @Autowired
    private ScholarshipItemService scholarshipItemService;

    @Autowired
    private FillInTypeService fillInTypeService;

    @Autowired
    private AwardService awardService;

    /**
     * 通过session获取用户ID，
     * 通过GET方法传递参数：年份
     * 返回获奖数量，奖项列表
     * @param session
     * @param model
     * @param yearScope
     * @return
     */
    @RequestMapping(value = "/evaluation/scholarship/{yearScope}",method = RequestMethod.GET)
    public String showScholarship(HttpSession session, Model model, @PathVariable("yearScope") int yearScope){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        String userId = userLogBean.getUserId();
        List<Award> awardList = awardService.selectAllByUserIdAndYearScope(userId, yearScope);
        ScholarshipBeanList scholarshipBeanList = new ScholarshipBeanList();
        if(awardList == null){
            logger.info(userId + " 在" + yearScope + "年度没有获奖");
            scholarshipBeanList.setSum(0);
        }
        else{
            int scholarshipSum = awardList.size();
            logger.info(userId + " 在" + yearScope + "年度共获" + scholarshipSum + "项奖");
            scholarshipBeanList.setSum(scholarshipSum);

            List<ScholarshipBean> scholarshipBeans = new ArrayList<>();
            for (Award award : awardList) {
                int scholarshipId = award.getScholarshipId();
                Scholarship scholarship = scholarshipService.selectByScholarshipId(scholarshipId);
                logger.info(userId + " 获得" + yearScope + "年度" + scholarship.getScholarshipName());
                List<ScholarshipBlock> scholarshipBlocks = scholarshipBlockService.selectAllByScholarshipId(scholarshipId);
                List<ScholarshipBlockBean> scholarshipBlockBeans = new ArrayList<>();
                for (ScholarshipBlock scholarshipBlock : scholarshipBlocks) {
                    int scholarshipBlockId = scholarshipBlock.getScholarshipBlockId();
                    List<ScholarshipItem> scholarshipItems = scholarshipItemService.selectAllByScholarshipBlockId(scholarshipBlockId);
                    List<ScholarshipItemBean> scholarshipItemBeans = new ArrayList<>();
                    for(ScholarshipItem scholarshipItem : scholarshipItems){
                        FillInType fillInType = fillInTypeService.selectByTypeId(scholarshipItem.getFillInTypeId());
                        FillInTypeBean fillInTypeBean = new FillInTypeBean(fillInType.getTypeId(),fillInType.getType());
                        ScholarshipItemBean scholarshipItemBean = new ScholarshipItemBean(
                                scholarshipItem.getScholarshipItemId(),
                                scholarshipItem.getScholarshipItemName(),
                                fillInTypeBean,
                                scholarshipItem.getFillInHint());
                        scholarshipItemBeans.add(scholarshipItemBean);
                    }
                    ScholarshipBlockBean scholarshipBlockBean = new ScholarshipBlockBean(
                            scholarshipBlockId,
                            scholarshipBlock.getScholarshipBlockName(),
                            scholarshipItemBeans);
                    scholarshipBlockBeans.add(scholarshipBlockBean);
                }
                ScholarshipBean scholarshipBean = new ScholarshipBean(scholarshipId, scholarship.getScholarshipName(), scholarship.getAwardPercent(), scholarshipBlockBeans);
                scholarshipBeans.add(scholarshipBean);
            }
            scholarshipBeanList.setScholarshipBeans(scholarshipBeans);
        }
        model.addAttribute("scholarshipBeanList",scholarshipBeanList);
        return "test";
    }
}
