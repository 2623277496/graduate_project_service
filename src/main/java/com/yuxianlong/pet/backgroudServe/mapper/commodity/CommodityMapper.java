package com.yuxianlong.pet.backgroudServe.mapper.commodity;

import com.yuxianlong.pet.backgroudServe.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper {

    /**
     * 查询使用的商品信息
     * @return 所有商品的信息集合
     */
    List<Commodity>  getFindListCommodity();
}
