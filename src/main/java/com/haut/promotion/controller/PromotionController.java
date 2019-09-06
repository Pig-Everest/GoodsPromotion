package com.haut.promotion.controller;

import com.haut.promotion.domain.Promotion;
import com.haut.promotion.domain.Promotionstyle;
import com.haut.promotion.service.PromotionService;
import com.haut.promotion.service.PromotionstyleService;
import com.haut.promotion.service.PromotionstyleService;
import com.haut.promotion.service.impl.TimemanagerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@CrossOrigin()
public class PromotionController {

    @Resource(name = "promotionstyleServiceImpl")
    PromotionstyleService promotionstyleService;

@Resource(name="promotionServiceImpl")
PromotionService promotionService;

@Resource(name="timemanagerServiceImpl")
TimemanagerServiceImpl timemanagerService;

    @RequestMapping(value = "/selectAllPromotionStyle")
    @ResponseBody
    public   List<Promotionstyle>  selectAllPromotionStyle(){
      return promotionstyleService.selectAllPromotionStyle();
    }


    @RequestMapping(value="addgiftpromotions")
    public  String addGiftPromotions(HttpServletRequest request,Promotion p, String startTime, String endTime){
        p.setPromotionStyle(5);
        System.out.println("添加赠品促销规则");
       int promotionId= promotionService.addGiftPromotion(p);
        timemanagerService.addTimeByGiftPromotion(startTime,endTime,p.getId());
        request.getSession().setAttribute("promotionid",p.getId());
        return "selectGift";
    }

}
