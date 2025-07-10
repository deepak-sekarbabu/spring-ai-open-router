package com.example.springai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springai.service.PoetryService;

/**
 * REST controller for AI-powered poetry endpoints.
 */
@RestController
@RequestMapping("/ai")
public class PoetryController {
    private final PoetryService poetryService;

    public PoetryController(PoetryService poetryService) {
        this.poetryService = poetryService;
    }

    /**
     * Generate a haiku about a cat using AI.
     * 
     * @return Haiku string
     */
    @GetMapping("/cathaiku")
    public ResponseEntity<String> generateHaiku() {
        return ResponseEntity.ok(poetryService.getCatHaiku());
    }
}
