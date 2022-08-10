package com.st.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.reggie.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: OrderDetailMapper
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/9 21:35
 */
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {
}
