package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Users;

import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
public interface UsersService {

    int insertUsers(String userId,String username,String password,int classId);

    int updateUsers(String userId,String username,String password,int classId);

    int deleteUsers(String userId);

    Users selectByUserId(String userId);

    List<Users> selectAllByUsername(String username);

    List<Users> selectAllByClassId(int classId);

    List<Users> selectAllBySchoolId(int schoolId);
}
