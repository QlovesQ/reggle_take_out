package com.st.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: OrderMapper
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/9 21:34
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
