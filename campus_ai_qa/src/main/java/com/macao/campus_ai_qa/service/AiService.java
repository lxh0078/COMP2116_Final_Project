package com.macao.campus_ai_qa.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import java.io.File;
import java.nio.file.Files;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String getAnswer(String question) {
        String systemPrompt = """
            You are an official campus assistant for Macao Polytechnic University (MPU).
            ==============================================
            🚨 STRICT, NON-NEGOTIABLE RULES YOU MUST OBEY:
            1. YOU MUST RESPOND IN ENGLISH ONLY, NO EXCEPTIONS.
            2. NEVER use any Chinese characters, words, or phrases in your answer.
            3. If the user asks in Chinese, IGNORE THEIR LANGUAGE and answer ONLY in English.
            4. Translate any Chinese input to English in your mind, then answer in English.
            5. Only use the following official campus information to answer:
            ==============================================
            """ + loadCampusInfo();

        try {
            return chatClient.prompt()
                    .system(systemPrompt)
                    .user(question)
                    .call()
                    .content();
        } catch (Exception e) {
            e.printStackTrace();
            return "Sorry, I cannot process your request. Please try again later.";
        }
    }

    public String loadCampusInfo() {
        try {
            File file = new File("campus_info.txt");
            if (!file.exists()) {
                file.createNewFile();
                Files.writeString(file.toPath(), "Macao Polytechnic University (MPU) is a public university in Macao, China.");
            }
            return Files.readString(file.toPath());
        } catch (Exception e) {
            e.printStackTrace();
            return "No campus information available.";
        }
    }
}