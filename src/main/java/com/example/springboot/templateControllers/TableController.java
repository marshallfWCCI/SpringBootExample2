package com.example.springboot.templateControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

// Thymeleaf controller methods do two things:
// 1. Populate the org.springframework.ui.Model (which is the parameter to the method) with some data.
// 2. Give the name of the template that expects that data.
@Controller
public class TableController {
    private List<List<Integer>> getRows(final int tableSize) {
        final List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < tableSize; i++) {
            final List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                row.add(j);
            }
            rows.add(row);
        }
        return rows;
    }

    private List<String> getCaptions(final int tableSize) {
        final List<String> captions = new ArrayList<>();
        for (int i = 0; i < tableSize; i++) {
            captions.add("#" + i);
        }
        return captions;
    }

    @GetMapping("/table/{table_size}")
    public String departmentsHTML(@PathVariable final int table_size, final Model model) {
        model.addAttribute("rows", getRows(table_size);
        model.addAttribute("captions", getCaptions(table_size);
        return "table";
    }
}
