package edu.ujs.schoolwork.generator.goods.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.ujs.schoolwork.generator.goods.entity.Goods;
import edu.ujs.schoolwork.generator.goods.mapper.GoodsMapper;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * <p>
 * 商品 前端控制器
 * </p>
 *
 * @author ujs
 * @since 2020-06-30
 */
@Controller
@RequestMapping("/goods")
public class GoodsController{
    @Resource
    private GoodsMapper goodsMapper;


    @GetMapping("/page/list")
    public ModelAndView listAll(Page page,String name){
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(name)){
            wrapper.like("name",name);
        }



        return null;
    }

    @GetMapping("/info/goods")
    public ModelAndView findOne(Long id){
        return null;
    }

    @PostMapping("/add/goods")
    public String addGood(Goods goods){
        return "redirect:page/list";
    }

    @PostMapping("/update/goods")
    public String update(Goods goods){
        return "redirect:page/list";
    }


}
