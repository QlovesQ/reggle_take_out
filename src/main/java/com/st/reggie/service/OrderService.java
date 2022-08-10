package com.st.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.st.reggie.entity.Orders;

/**
 * @ClassName: OrderService
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/9 21:37
 */
public interface OrderService extends IService<Orders> {

    /**
     * 下单
     * @param orders
     */
    public void submit(Orders orders);
}
