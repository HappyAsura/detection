package com.java1234.service;

import com.java1234.entity.Database;

import java.util.List;
import java.util.Map;

/**
 * @Author: zz
 * @Description:
 * @Date: ���� 5:15 2018/5/8 0008
 * @Modified By
 */
public interface DatabaseService {
    /**
     * ��ѯ
     * @param map
     * @return
     */
    List<Database> list(Object map);
}
