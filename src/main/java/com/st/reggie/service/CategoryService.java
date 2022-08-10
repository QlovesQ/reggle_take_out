package com.st.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.st.reggie.entity.Category;

/**
 * @ClassName: CategoryService
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/6 18:30
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
