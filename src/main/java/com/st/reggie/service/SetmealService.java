package com.st.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.st.reggie.dto.SetmealDto;
import com.st.reggie.entity.Setmeal;

import java.util.List;

/**
 * @ClassName: SetmealService
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/6 21:08
 */
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    void updateStatus(Integer status, Long ids);
}
