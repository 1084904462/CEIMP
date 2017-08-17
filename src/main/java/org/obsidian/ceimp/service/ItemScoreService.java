package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ItemScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface ItemScoreService {

    int insertItemScore(String userId,int itemId,double score);

    int updateItemScore(int itemScoreId,String userId,int itemId,double score);

    int deleteItemScore(int itemScoreId);

    ItemScore selectByItemScoreId(int itemScoreId);

    List<ItemScore> selectAllByThisYear();
    List<ItemScore> selectAllByYearScope(int yearScope);

    List<ItemScore> selectAllByUserId(String userId);
    List<ItemScore> selectAllByUserIdAndThisYear(String userId);
    List<ItemScore> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<ItemScore> selectAllByItemId(int itemId);
    List<ItemScore> selectAllByItemIdAndThisYear(int itemId);
    List<ItemScore> selectAllByItemIdAndYearScope(int itemId,int yearScope);

    List<ItemScore> selectAllByUserIdAndItemId(String userId,int itemId);
    List<ItemScore> selectAllByUserIdAndItemIdAndThisYear(String userId,int itemId);
    List<ItemScore> selectAllByUserIdAndItemIdAndYearScope(String userId,int itemId,int yearScope);

    List<ItemScore> selectAll();
}
