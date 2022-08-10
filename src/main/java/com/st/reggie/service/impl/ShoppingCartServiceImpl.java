package com.st.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.reggie.entity.ShoppingCart;
import com.st.reggie.mapper.ShoppingCartMapper;
import com.st.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ShoppingCartServiceImpl
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/9 18:32
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
