package com.st.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: DishMapper
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/6 21:06
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
