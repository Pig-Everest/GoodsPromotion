package com.haut.promotion.controller;

import com.haut.promotion.domain.Promotionstyle;
import com.haut.promotion.service.PromotionstyleService;
import com.haut.promotion.service.PromotionstyleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PromotionController {

    @Resource(name = "promotionstyleServiceImpl")
    PromotionstyleService promotionstyleService;

    @RequestMapping(value = "/selectAllPromotionStyle")
    @ResponseBody
    public   List<Promotionstyle>  selectAllPromotionStyle(){
      return promotionstyleService.selectAllPromotionStyle();
    }


}
