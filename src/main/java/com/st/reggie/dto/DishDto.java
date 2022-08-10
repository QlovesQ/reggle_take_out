package com.st.reggie.dto;

import com.st.reggie.entity.Dish;
import com.st.reggie.entity.DishFlavor;
import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
//@Builder
public class DishDto extends Dish {

    //菜品所对应的口味数据
    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
