package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.BasicScholarshipBean;
import org.obsidian.ceimp.bean.ZipInfoBean;

import java.util.List;

/**
 * Created by BillChen on 2018/5/17.
 */
public interface BasicScholarshipMapper {
    Boolean exist(@Param("subName") String subName, @Param("userId") Long userId, @Param("yearScope") Integer yearScope);

    List<BasicScholarshipBean> getNgBeanList(@Param("list")List<ZipInfoBean> list, @Param("yearScope") Integer yearScope);
    List<BasicScholarshipBean> getNisBeanList(@Param("list")List<ZipInfoBean> list, @Param("yearScope") Integer yearScope);
    List<BasicScholarshipBean> getPgsBeanList(@Param("list")List<ZipInfoBean> list, @Param("yearScope") Integer yearScope);
    List<BasicScholarshipBean> getSsBeanList(@Param("list")List<ZipInfoBean> list, @Param("yearScope") Integer yearScope);
    List<BasicScholarshipBean> getTasBeanList(@Param("list")List<ZipInfoBean> list, @Param("yearScope") Integer yearScope);
}
