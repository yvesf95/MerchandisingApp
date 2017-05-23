package com.jgalds.controller;

import com.jgalds.model.Picture;
import com.jgalds.service.PictureService;
import com.jgalds.service.ProductService;
import com.jgalds.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Admin on 5/4/2017.
 */

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;
    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProducts(Model model){
//        , @RequestParam(value = "page", defaultValue = "0") int pageNumber
//        Page<Product> productPage = productRepository.findAll(new PageRequest(pageNumber,10));
//        model.addAttribute("products", productPage);
        List<Product> products = productService.findAllProducts();
        for (Product p : products) {
            List<Picture> pictures = pictureService.findAllByProduct_Id(p.getId());
            p.getPictures().addAll(pictures);
        }
        model.addAttribute("products", products);
        return "products";
    }

    @RequestMapping(value = "/error403", method = RequestMethod.GET)
    public String errorPage(){
        return "error403";
    }

}
