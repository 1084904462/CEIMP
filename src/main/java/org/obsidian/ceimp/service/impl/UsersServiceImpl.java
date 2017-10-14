package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.UsersMapper;
import org.obsidian.ceimp.entity.Users;
import org.obsidian.ceimp.entity.UsersExample;
import org.obsidian.ceimp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Transactional
    @Override
    public int insertUsers(String userId, String username, String password, int classId) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//        password = MD5Util.getInstance().EncoderByMd5(password);
        Users users = new Users(userId,username,password,classId);
        return usersMapper.insert(users);
    }

    @Transactional
    @Override
    public int updateUsers(String userId, String username, String password, int classId) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//        password = MD5Util.getInstance().EncoderByMd5(password);
        Users users = new Users(userId,username,password,classId);
        UsersExample example = new UsersExample();
        example.or().andUserIdEqualTo(userId);
        return usersMapper.updateByExample(users,example);
    }

    @Transactional
    @Override
    public int deleteUsers(String userId) {
        UsersExample example = new UsersExample();
        example.or().andUserIdEqualTo(userId);
        return usersMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public Users selectByUserId(String userId) {
        UsersExample example = new UsersExample();
        example.or().andUserIdEqualTo(userId);
        List<Users> list = usersMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Users> selectAllByUsername(String username) {
        username = "%" + username + "%";
        UsersExample example = new UsersExample();
        example.or().andUsernameLike(username);
        List<Users> list = usersMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Users> selectAllByClassId(int classId) {
        UsersExample example = new UsersExample();
        example.or().andClassIdEqualTo(classId);
        List<Users> list = usersMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Users> selectAllBySchoolId(int schoolId) {
        List<Users> list = usersMapper.selectAllBySchoolId(schoolId);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Users> selectAll(){
        UsersExample example = new UsersExample();
        List<Users> list = usersMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
