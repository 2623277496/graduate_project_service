package com.yuxianlong.pet.backgroudServe.controller;

import com.yuxianlong.pet.backgroudServe.entity.Commodity;
import com.yuxianlong.pet.backgroudServe.service.CommodityService;
import com.yuxianlong.pet.backgroudServe.utils.ReturnsUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;



@RestController
@CrossOrigin
public class CommodityController {

    @Resource
    private CommodityService commodityService;


    @GetMapping("list")
    public ReturnsUtils<List<Commodity>> getList() {
        List<Commodity> filedCommodityList = commodityService.getFiledCommodityList();
        return  new ReturnsUtils<>(200,"查询成功",filedCommodityList);
    }
}
