package com.example.springboot.templateControllers;

import com.example.springboot.logic.CaptionsAndRows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Thymeleaf controller methods do two things:
// 1. Populate the org.springframework.ui.Model (which is the parameter to the method) with some data.
// 2. Give the name of the template that expects that data.
@Controller
public class TableController {
    final CaptionsAndRows<String, Integer> logic;

    public TableController(@Autowired CaptionsAndRows<String, Integer> logic) {
        this.logic = logic;
    }

    @GetMapping("/table/{table_size}")
    public String departmentsHTML(@PathVariable final int table_size, final Model model) {
        model.addAttribute("rows", logic.getData(table_size));
        model.addAttribute("captions", logic.getCaptions(table_size));
        return "table";
    }
}
