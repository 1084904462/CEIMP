package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.UserBasic;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

/**
 * Created by BillChen on 2017/11/13.
 */
public interface UserBasicService {
    StatusBean userLogin(HttpSession session, LogBean logBean,Map<Long,HttpSession> userSessionMap) throws NoSuchAlgorithmException, UnsupportedEncodingException;

    List<UserSearchBean> getUserSearchBeanListBySearchKeyListAndSchoolIdAndYearScope(List<String> searchKeyList,Long schoolId,Integer yearScope);

    int updateUserBasic(UserBasic userBasic) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    UserBasic selectByAccount(String account);

    UserBasicBean selectUserBasicBeanByUserId(Long userId);

    int updateByUserIdAndNgBean(Long userId,NgBean ngBean);

    int updateByUserIdAndNisBean(Long userId, NisBean nisBean);

    int updateByUserIdAndPgsBean(Long userId, PgsBean pgsBean);

    int updateByUserIdAndSsBean(Long userId,SsBean ssBean);

    int updateByUserIdAndTasBean(Long userId,TasBean tasBean);
}
