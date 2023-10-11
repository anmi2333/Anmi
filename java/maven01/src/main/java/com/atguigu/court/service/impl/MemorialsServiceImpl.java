package com.atguigu.court.service.impl;

import com.atguigu.court.dao.api.MemorialsDao;
import com.atguigu.court.dao.impl.MemorialsDaoImpl;
import com.atguigu.court.entity.Memorials;
import com.atguigu.court.service.api.MemorialsService;

import java.util.List;

/**
 * @projectName: maven01
 * @package: com.atguigu.court.service.impl
 * @className: MemorialsServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/08/29 10:42
 */
@SuppressWarnings({"all"})
public class MemorialsServiceImpl implements MemorialsService {

    private MemorialsDao memorialsDao = new MemorialsDaoImpl();

    @Override
    public List<Memorials> getAllMemorialsDigest() {
        return null;
    }

    @Override
    public Memorials getMemorialsDetailById(String memorialsId) {
        return memorialsDao.selectMemorialsById(memorialsId);
    }

    @Override
    public void updateMemorialsStatusToRead(String memorialsId) {
        memorialsDao.updateMemorialsStatusToRead(memorialsId);
    }

    @Override
    public void updateMemorialsFeedBack(String memorialsId, String feedbackContent) {
        memorialsDao.updateMemorialsFeedBack(memorialsId, feedbackContent);
    }

}
