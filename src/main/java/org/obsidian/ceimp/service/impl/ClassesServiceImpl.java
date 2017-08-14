package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ClassesMapper;
import org.obsidian.ceimp.entity.Classes;
import org.obsidian.ceimp.entity.ClassesExample;
import org.obsidian.ceimp.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public int insertClasses(String className, int classNum, int schoolId) {
        Classes classes = new Classes(className,classNum,schoolId);
        return classesMapper.insertSelective(classes);
    }

    @Override
    public int updateClasses(int classId, String className, int classNum, int schoolId) {
        Classes classes = new Classes(classId,className,classNum,schoolId);
        ClassesExample example = new ClassesExample();
        example.or().andClassIdEqualTo(classId);
        return classesMapper.updateByExample(classes,example);
    }

    @Override
    public int deleteClasses(int classId) {
        ClassesExample example = new ClassesExample();
        example.or().andClassIdEqualTo(classId);
        return classesMapper.deleteByExample(example);
    }

    @Override
    public Classes selectById(int classId) {
        ClassesExample example = new ClassesExample();
        example.or().andClassIdEqualTo(classId);
        List<Classes> list = classesMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public Classes selectByClassNameAndClassNum(String className,int classNum) {
        ClassesExample example = new ClassesExample();
        example.or().andClassNameEqualTo(className).andClassNumEqualTo(classNum);
        List<Classes> list = classesMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Classes> selectAllByClassName(String className) {
        className = "%" + className + "%";
        ClassesExample example = new ClassesExample();
        example.or().andClassNameLike(className);
        List<Classes> list = classesMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Override
    public List<Classes> selectAllByClassNum(int classNum) {
        ClassesExample example = new ClassesExample();
        example.or().andClassNumEqualTo(classNum);
        List<Classes> list = classesMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Override
    public List<Classes> selectAllBySchoolId(int schoolId) {
        ClassesExample example = new ClassesExample();
        example.or().andSchoolIdEqualTo(schoolId);
        List<Classes> list = classesMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
