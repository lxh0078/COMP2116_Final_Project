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

    // 用户可以用
    @GetMapping("/ask")
    public String ask(@RequestParam String question) {
        return aiService.getAnswer(question);
    }

    // ==============================
    // 以下是管理员接口
    // 普通用户无法访问！
    // ==============================

    // 查看信息（管理员）
    @GetMapping("/admin/info")
    public String viewInfo() {
        return aiService.loadCampusInfo();
    }

    // 更新信息（管理员）
    @PostMapping("/admin/update")
    public String updateInfo(@RequestBody String content) {
        aiService.updateCampusInfo(content);
        return "Campus info updated successfully (Admin only)!";
    }
}