package com.st.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.reggie.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: ShoppingCartMapper
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/9 18:28
 */
@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
}
