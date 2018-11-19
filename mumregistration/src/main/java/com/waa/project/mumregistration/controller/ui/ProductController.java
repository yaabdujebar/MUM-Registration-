package com.waa.project.mumregistration.controller.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.waa.project.mumregistration.model.Product;
import com.waa.project.mumregistration.service.contract.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = {"/products", "/products/", "/products/index"})
    public ModelAndView products() {
        ModelAndView mav = new ModelAndView();
        List<Product> products = productService.findAll();
        mav.addObject("products", products);
        mav.setViewName("products/index");
        return mav;
    }

    @GetMapping(value = "products/new")
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        return "products/new";
    }

    @PostMapping(value = "/products/new")
    public String registerNewProduct(@Valid @ModelAttribute("product") Product product,
                                     BindingResult bindingResult, Model model, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "product/new";
        }
        productService.create(product);

        return "redirect:/products/";
    }

    @GetMapping(value = "/products/edit/{id}")
    public String editProduct(@PathVariable Long id, Model model) {
        Product product = productService.findById(id);
        if (product != null) {
            model.addAttribute("product", product);
            return "products/edit";
        }
        return "products/index";
    }

    @PostMapping(value = "/products/edit")
    public String updateProduct(@Valid @ModelAttribute("product") Product product,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "products/edit";
        }
        productService.update(product);
        return "redirect:/products/index";
    }

    @PostMapping(value = "/products/delete")
    public String deleteProduct(@Valid @ModelAttribute("product") Product product,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "products/edit";
        }
        productService.delete(product);
        return "redirect:/products/index";
    }
}
