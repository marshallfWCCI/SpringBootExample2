package com.example.springboot.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

public class TriangleData implements CaptionsAndRows<String, Integer> {
    public List<String> getCaptions(final int tableSize) {
        final List<String> captions = new ArrayList<>();
        for (int i = 0; i < tableSize; i++) {
            captions.add("#" + i);
        }
        return captions;
    }

    public List<List<Integer>> getData(final int tableSize) {
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
}
