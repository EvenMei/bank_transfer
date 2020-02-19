package com.meiyukai.controller;

import com.meiyukai.domain.Account;
import com.meiyukai.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class transferController {
    @Resource(name = "accountService")
    private AccountService accountService;


    @RequestMapping(value = "/hello.do")
    public String helloController(){
        return"table";
    }

    @RequestMapping(value = "/transfer.do")
    public ModelAndView transfer(){
        ModelAndView mav = new ModelAndView();
        List<Account> accounts = accountService.findAllAccounts();
        mav.addObject("list" , accounts);
        mav.setViewName("table");
        return mav;
    }

    @RequestMapping(value = "/start.do")
    public ModelAndView startTransfer(){
        ModelAndView mav = new ModelAndView();
        accountService.transfer("zhangsan" , "lisi"  , 1000.0);
        List<Account> accounts = accountService.findAllAccounts();
        mav.addObject("list" , accounts);
        mav.setViewName("table");
        return mav;
    }






}
