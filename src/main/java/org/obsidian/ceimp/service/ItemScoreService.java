package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ItemScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface ItemScoreService {

    int insertItemScore(int itemId,String userId,int score);

    int updateItemScore(int itemScoreId,int itemId,String userId,int score);

    int deleteItemScore(int itemScoreId);

    ItemScore selectByItemScoreId(int itemScoreId);

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
