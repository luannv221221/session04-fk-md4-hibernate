package com.ra.controller;

import com.ra.model.entity.Category;
import com.ra.model.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/category")
    public String index(Model model){
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories",categories);
        return "index-category";
    }
    @RequestMapping("/add-category")
    public String add(Model model){
        Category category = new Category();
        model.addAttribute("category",category);
        return "add-category";
    }
    @RequestMapping("/save-category")
    public String save(@ModelAttribute("category") Category category){
        categoryService.add(category);
        return "redirect:/category";
    }
    //@RequestMapping("/save-category")
    /*canh 1
    public String save(HttpServletRequest request){
        // lấy được dữ liệu từ form
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String status = request.getParameter("status");
        System.out.println(name);
        System.out.println(description);
        System.out.println(status);
        return "add-category";
    }
     */
    /* cach 2
    public String save(
            @RequestParam("name") String name,
            @RequestParam("description") String description,
            @RequestParam("status") Boolean status
            ){
        System.out.println(name);
        System.out.println(description);
        System.out.println(status);
        return "add-category";
    } */

    @GetMapping("/edit-category/{id}")
    public String edit(@PathVariable Integer id,Model model){
        Category category = categoryService.findById(id);
        model.addAttribute("category",category);
        return "edit-category";
    }
    @PostMapping("/edit-category/{id}")
    public String update(@ModelAttribute("category") Category category){
        categoryService.update(category);
        return "redirect:/category";
    }
}
