package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Author 作者名
 * @Date 2022/10/28 0:33
 */
// 前后端分离
@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public List<Map<String,String>> getBotInfo(){
        List<Map<String,String>> list = new LinkedList<>();
        Map<String,String> bot1 = new HashMap<>();
        bot1.put("name","xiaoxin");
        bot1.put("rating","100");
        Map<String,String> bot2 = new HashMap<>();
        bot2.put("name","xiaoluo");
        bot2.put("rating","150");
        list.add(bot1);list.add(bot2);
        return list;
    }
}