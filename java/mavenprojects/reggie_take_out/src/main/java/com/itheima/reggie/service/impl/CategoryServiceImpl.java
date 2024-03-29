package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.common.CustomException;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.mapper.CategoryMapper;
import com.itheima.reggie.service.CategoryService;
import com.itheima.reggie.service.DishService;
import com.itheima.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.reggie.service.impl
 * @className: CategoryServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/09/16 13:50
 */
@SuppressWarnings({"all"})
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;
    //根据id删除分类 删除之前需要进行判断
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件,根据分类id进行查询
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(dishLambdaQueryWrapper);

        //查询当前分类是否关联了菜品 如果已经关联 则抛出一个业务异常
        if (count1 > 0) {
            //已经关联菜品 抛出一个业务异常
            throw new CustomException("当前分类下关联的菜品,不能删除");
        }
        //查询当前分类是否关联了套餐 如果已经关联 则抛出一个业务异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        //查询当前分类是否关联了菜品 如果已经关联 则抛出一个业务异常
        if (count2 > 0) {
            //已经关联套餐 抛出一个业务异常
            throw new CustomException("当前分类下关联的套餐,不能删除");
        }

        //正常删除类
        super.removeById(id);

    }
}
