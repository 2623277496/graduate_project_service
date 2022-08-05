package com.yuxianlong.pet.backgroudServe.service.Imp;

import com.yuxianlong.pet.backgroudServe.entity.Commodity;
import com.yuxianlong.pet.backgroudServe.mapper.commodity.CommodityMapper;
import com.yuxianlong.pet.backgroudServe.service.CommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Resource
    private CommodityMapper commodityMapper;

    /**
     * 实现查询商品的所有信息
     * @return 返回所有商品 并且放在一个List集合里面
     */
    @Override
    public List<Commodity> getFiledCommodityList() {
        return commodityMapper.getFindListCommodity();
    }
}
