package com.example.calc.controllers;

import ch.qos.logback.core.util.InvocationGate;
import com.example.calc.vos.CalcVo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;

@Controller
@RequestMapping(value = "/calc")
public class CalcController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String rootGet(CalcVo calcVo) {
        // root 는 주소 의미
        // http://127.0.0.1:8080/calc/ 로 연결했을때 접속이 되어야함.

        return "/WEB-INF/views/calc.jsp";
    }

    // [POST] /calc/
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String rootPost(
            Model model,
            HttpServletResponse response,
            CalcVo calcVo)
            throws IOException {
        int result;
        switch (calcVo.getOp()) {
            case "add":
                result =calcVo.getA() + calcVo.getB();
                break;
            case "sub":
                result = calcVo.getA() - calcVo.getB();
                break;
            case "mul":
                result = calcVo.getA() * calcVo.getB();
                break;
            case "div":
                result = calcVo.getA() / calcVo.getB();
                break;
            default:
                response.sendError(400);
                return null;
        }
        model.addAttribute("calcVo", calcVo);
        model.addAttribute("result", result);
        return "/WEB-INF/views/calc.jsp";
    }

//    @RequestMapping(value = "/add")
//    @ResponseBody
//    public String addGet(HttpServletRequest request, HttpServletResponse response) {
//        // ~/calc/add?a=5&b=6 // 주소창에 적혀있는건 문자열
//        try {
//            String aText = request.getParameter("a");
//            String bText = request.getParameter("b");
//            int a = Integer.parseInt(aText);
//            int b = Integer.parseInt(bText);
//
//            return String.valueOf(a + b);
//        } catch (NumberFormatException e) {
//            return "Invalid Request";
//        }
//    }

//    @RequestMapping(value = "/subtract")
//    @ResponseBody
//    public String subtractGet(HttpServletRequest request, HttpServletResponse response) {
//
//        try {
//            String aText = request.getParameter("a");
//            String bText = request.getParameter("b");
//            int a = Integer.parseInt(aText);
//            int b = Integer.parseInt(bText);
//
//            return String.valueOf(a - b);
//        } catch (NumberFormatException e) {
//            return "Invalid Request";
//        }
//    }

//    @RequestMapping(value = "/calc/add", method = RequestMethod.POST)
//    public String addGet() {
//        System.out.println("잘 연결되었다.");
//
//        return null;
//    }

//    @RequestMapping(value = "/add")
//    @ResponseBody
//    public String addGet(@RequestParam(name = "a") Optional<Integer> a, @RequestParam(name = "b") Optional<Integer> b) {
//        try {
//            return String.valueOf(a.get() + b.get());
//        } catch (NoSuchElementException e) {
//            return "Invalid Request";
//        }
//    }
}
