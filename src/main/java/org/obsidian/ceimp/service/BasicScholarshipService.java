package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.BasicScholarshipBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by BillChen on 2018/5/16.
 */
public interface BasicScholarshipService {
    List<BasicScholarshipBean> getBeanList(String subName, List<ZipInfoBean> zipInfoBeanList, Integer yearScope);

    BasicScholarshipBean getBean(String subName,Long userId,Integer yearScope);

    BasicScholarshipBean copyBean(String subName, Long userId, Integer yearScope,BasicScholarshipBean postBean);

    Boolean exist(String subName,Long userId,Integer yearScope);

    int insert(String subName,Long userId,Integer yearScope,BasicScholarshipBean basicScholarshipBean);

    int update(String subName,Long userId,Integer yearScope,BasicScholarshipBean basicScholarshipBean);

    ResponseEntity<byte[]> generateWord(String subName, BasicScholarshipBean basicScholarshipBean) throws IOException;
}
