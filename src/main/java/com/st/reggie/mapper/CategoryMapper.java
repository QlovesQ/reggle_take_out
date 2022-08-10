package com.st.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: CategoryMapper
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/6 18:29
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
