package com.macao.campus_ai_qa.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String getAnswer(String question) {
        String campusInfo = loadCampusInfo();
        String systemPrompt = """
            You are a Macao Polytechnic University campus assistant.
            Answer ONLY in English.
            Be polite, simple, clear.
            Use the following campus information to answer:
            """ + campusInfo;

        return chatClient.prompt()
                .system(systemPrompt)
                .user(question)
                .call()
                .content();
    }

    // 读取校园信息（内部使用）
    public String loadCampusInfo() {
        try {
            return Files.readString(Paths.get("campus_info.txt"));
        } catch (Exception e) {
            return "No campus information available.";
        }
    }

    // 管理员更新信息（仅后端可调用）
    public void updateCampusInfo(String content) {
        try {
            Files.write(Paths.get("campus_info.txt"), content.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}