package com.macao.campus_ai_qa.controller;

import com.macao.campus_ai_qa.service.AiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/ask")
    public String ask(@RequestParam String question) {
        return aiService.getAnswer(question);
    }

    @GetMapping("/admin/info")
    public String viewInfo() {
        return aiService.loadCampusInfo();
    }
    @PostMapping("/admin/update")
    public String updateInfo(@RequestBody String content) {
        aiService.updateCampusInfo(content);
        return "Campus info updated successfully (Admin only)!";
    }
}