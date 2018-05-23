package org.obsidian.ceimp.service;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface MajorService {
    List<String> getAll(Long schoolId);

    List<String> getLastThree(Long schoolId);
}
