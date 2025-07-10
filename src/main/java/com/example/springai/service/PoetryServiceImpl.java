package com.example.springai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

/**
 * Implementation of PoetryService using AI chat client.
 */
@Service
public class PoetryServiceImpl implements PoetryService {
    private static final String WRITE_ME_HAIKU_ABOUT_CAT = """
            Write me Haiku about cat,
            haiku should start with the word cat obligatory""";

    private final ChatClient chatClient;

    public PoetryServiceImpl(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @Override
    public String getCatHaiku() {
        return chatClient.prompt().user(WRITE_ME_HAIKU_ABOUT_CAT).call().content();
    }
}
