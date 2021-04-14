package com.shilei.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.shilei.doming.Books;
import com.shilei.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author sl
 * @date 2021/4/13 14:58
 */
@Controller
@RequestMapping("/book")
public class BookController {

//    controller 调 service层
    @Autowired
    private BookService bookService;

    //查询全部书籍,并且返回到一个书记展示页面
    @RequestMapping("/allBook.do")
    @ResponseBody
    public JSONObject getList() throws IOException {

        List<Books> list = bookService.queryAllBook();
        JSONObject jsonpObject = new JSONObject();
        jsonpObject.put("list",list);
        return jsonpObject;

    }
//    @RequestMapping("/allBook.do")
//    @ResponseBody
//    public JSONObject getList(ModelAndView model, HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.addHeader("Access-Control-Allow-Origin","*");
//
//        List<Books> list = bookService.queryAllBook();
//        JSONObject jsonpObject = new JSONObject();
//        jsonpObject.put("list",list);
//        response.setContentType("text/html; charset=UTF-8");
////        response.setContentType("application/json; charset=UTF-8");
//        response.getWriter().print(jsonpObject);
//        return jsonpObject;
//
//    }

}
