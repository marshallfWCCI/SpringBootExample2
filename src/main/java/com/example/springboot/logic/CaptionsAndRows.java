package com.example.springboot.logic;

import java.util.List;

/**
 * Provides the data for a Thymeleaf-populated table
 *
 * @param <C> -- The type of fields in the table captions (e.g. String)
 * @param <R> -- The type of fields in the table data (e.g. Integer)
 */
public interface CaptionsAndRows<C, R> {
    List<C> getCaptions(final int tableSize);
    List<List<R>> getData(final int tableSize);
}
