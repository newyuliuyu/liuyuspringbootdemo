package com.liuyu.springboot.liuyuweb.controller;

import com.google.common.collect.Maps;
import com.liuyu.commons.mvc.ModelAndViewFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: TestController <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-6-22 下午4:16 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Controller
public class TestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/ftl")
    public ModelAndView ftl(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.debug("测试log日志是否正常");
        Map<String,String> mydata = Maps.newHashMap();
        mydata.put("my1","my1");
        mydata.put("my2","my2");
        mydata.put("my3","my3");
        return ModelAndViewFactory.instance("test").with("mydata",mydata).build();
    }

    @RequestMapping("/html")
    public ModelAndView html(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.debug("测试log日志是否正常");
        Map<String,String> mydata = Maps.newHashMap();
        mydata.put("my1","my1");
        mydata.put("my2","my2");
        mydata.put("my3","my3");
        return ModelAndViewFactory.instance("test2").with("mydata",mydata).build();
    }

    @RequestMapping("/user1")
    public String userInfo1(Model model) {
        model.addAttribute("a","test");
        return "test";
    }
    @RequestMapping("/user3")
    public void userInfo3(Model model) {
        model.addAttribute("a","test");
    }

    @RequestMapping("/users2")
    public List userInfos2() {
        List<Map<String, String>> dataset = new ArrayList();
        Map<String, String> tmp = new HashMap<String, String>();
        tmp.put("name", "test1");
        tmp.put("avg", "10");
        dataset.add(tmp);
        tmp = new HashMap<String, String>();
        tmp.put("name", "test11");
        tmp.put("avg", "101");
        dataset.add(tmp);
        return dataset;
    }
}
