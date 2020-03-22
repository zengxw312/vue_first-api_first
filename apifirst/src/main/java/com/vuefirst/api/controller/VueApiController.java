package com.vuefirst.api.controller;


import com.vuefirst.api.entity.IndexRo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@CrossOrigin
public class VueApiController {

    @RequestMapping("/index")
    public  List<IndexRo> indexRo(){

        List<IndexRo> lists=new ArrayList<>();

        IndexRo indexRo = new IndexRo();
        indexRo.setProductId("1");
        indexRo.setProPrice("300");
        indexRo.setOldPrice("899");
        indexRo.setProName("跑鞋");
        indexRo.setProUrl("http://localhost:9090/image/classify/miphone.png");

        IndexRo indexRo2 = new IndexRo();
        indexRo2.setProPrice("300");
        indexRo2.setProductId("2");
        indexRo2.setOldPrice("899");
        indexRo2.setProName("跑鞋");
        indexRo2.setProUrl("http://localhost:9090/image/classify/miphone.png");
        lists.add(indexRo);
        lists.add(indexRo2);
      return lists;

    }

}
