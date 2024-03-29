package com.itheima.reggie.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.reggie.common
 * @className: MyMetaObjecthandler
 * @NAME: WANG CHAO
 * @date: 2023/09/16 11:23
 */
@SuppressWarnings({"all"})
//自定义元数据处理器

@Component
@Slf4j
public class MyMetaObjecthandler implements MetaObjectHandler {
    //插入操作自动填充
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("公共字段自动填充[insert]...");
        log.info(metaObject.toString());
        metaObject.setValue("createTime", LocalDateTime.now());
        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("createUser", BaseContext.getCurrentId());
        metaObject.setValue("updateUser", BaseContext.getCurrentId());
    }
    //更新操作自动填充
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("公共字段自动填充[updat]...");
        log.info(metaObject.toString());

        long id = Thread.currentThread().getId();
        log.info("线程id为: {}",id);

        metaObject.setValue("createUser", LocalDateTime.now());
        metaObject.setValue("updateUser", BaseContext.getCurrentId());
    }
}
