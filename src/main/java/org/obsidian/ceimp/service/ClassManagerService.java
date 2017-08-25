package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ClassManager;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
public interface ClassManagerService {

    int insertClassManager(String classManagerId,String password,int classId) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    int updateClassManager(String classManagerId,String password,int classId) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    int deleteClassManager(String classManagerId);

    ClassManager selectByClassManagerId(String classManagerId);

    List<ClassManager> selectAllByClassId(int classId);

    List<ClassManager> selectAll();
}
