import org.junit.runner.RunWith;
import org.obsidian.ceimp.Application;
import org.obsidian.ceimp.entity.TechnologyCompetition;
import org.obsidian.ceimp.entity.TechnologyCompetitionType;
import org.obsidian.ceimp.service.AwardService;
import org.obsidian.ceimp.service.ReviewTypeService;
import org.obsidian.ceimp.service.TechnologyCompetitionService;
import org.obsidian.ceimp.service.TechnologyCompetitionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by BillChen on 2017/8/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {

    @Autowired
    private TechnologyCompetitionService technologyCompetitionService;

    @Autowired
    private TechnologyCompetitionTypeService technologyCompetitionTypeService;

    @Autowired
    private CompetitionLevelService competitionLevelService;

    @Autowired
    private ArtCompetitionService artCompetitionService;

    @Autowired
    private AwardLevelService awardLevelService;

    @org.junit.Test
    public void test(){
        technologyCompetitionService.insertTechnologyCompetition();
    }
}