package com.yuxianlong.pet.backgroudServe.service;

import com.yuxianlong.pet.backgroudServe.entity.Commodity;

import java.util.List;

/**
 * 定义商品信息的一些规范接口
 */
public interface CommodityService {
    /**
     * 查询商品的所有信息
     * @return 返回所有商品
     */
    List<Commodity> getFiledCommodityList();
}
