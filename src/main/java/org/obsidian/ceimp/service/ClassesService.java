package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Classes;

import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
public interface ClassesService {

    int insertClasses(String className,int classNum,int schoolId);

    int updateClasses(int classId,String className,int classNum,int schoolId);

    int deleteClasses(int classId);

    Classes selectById(int classId);

    Classes selectByClassNameAndClassNum(String className,int classNum);

    List<Classes> selectAllByClassName(String className);

    List<Classes> selectAllByClassNum(int classNum);

    List<Classes> selectAllBySchoolId(int schoolId);

    List<Classes> selectAll();
}
