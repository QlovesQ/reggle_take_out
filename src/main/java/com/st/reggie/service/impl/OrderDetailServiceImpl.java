package com.st.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.reggie.entity.OrderDetail;
import com.st.reggie.mapper.OrderDetailMapper;
import com.st.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: OrderDetailServiceImpl
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/9 21:39
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
