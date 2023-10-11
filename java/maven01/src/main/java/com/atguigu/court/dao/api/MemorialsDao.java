package com.atguigu.court.dao.api;

import com.atguigu.court.entity.Memorials;

import java.util.List;

public interface MemorialsDao {
    List<Memorials> selectAllMemorialsDigest();

    Memorials selectMemorialsById(String memorialsId);

    void updateMemorialsStatusToRead(String memorialsId);
    void updateMemorialsFeedBack(String memorialsId, String feedbackContent);
}
