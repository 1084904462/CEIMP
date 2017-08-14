package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ImportItemMapper;
import org.obsidian.ceimp.service.ImportItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by BillChen on 2017/8/13.
 */
@Service
public class ImportItemServiceImpl implements ImportItemService {

    @Autowired
    private ImportItemMapper importItemMapper;

    @Override
    public int insertImportItem() {
        return 0;
    }
}
