package com.hzhiping.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hzhiping.model.Item;
// 在类的上方添加@Controller注解，代表是使用spring进行注入
@Controller
public class ItemController {
	// @RequestMapping：里面放的是请求的url，和用户请求的url进行匹配
	// 后缀.action可以加也可以不加
	@RequestMapping("/itemlist.action")
	public ModelAndView queryItemList(){// ModelAndView模型
		// 虚拟数据传值给ModelAndView
		ArrayList<Item>itemList=new ArrayList<Item>();
		itemList.add(new Item(1, "华为荣耀9", 1232.12, new Date(), "好用"));
		itemList.add(new Item(2, "华为荣耀9", 1232.12, new Date(), "好用"));
		itemList.add(new Item(3, "华为荣耀9", 1232.12, new Date(), "好用"));
		itemList.add(new Item(4, "华为荣耀9", 1232.12, new Date(), "好用"));
		itemList.add(new Item(5, "华为荣耀9", 1232.12, new Date(), "好用"));
		
		// 创建ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 添加数据到模型中
		modelAndView.addObject("itemList", itemList);
		// 设置视图jsp，需要设置jsp的物理地址
		modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
		return modelAndView;
	}
}
