package com.st.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.reggie.entity.DishFlavor;
import com.st.reggie.mapper.DishFlavorMapper;
import com.st.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DishFlavorServiceImpl
 * @Version: 1.0
 * @Description: TODO
 * @Author song
 * @Date 2022/8/7 17:30
 */
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
