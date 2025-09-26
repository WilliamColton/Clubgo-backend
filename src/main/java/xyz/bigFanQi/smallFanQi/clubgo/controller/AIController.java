package xyz.bigFanQi.smallFanQi.clubgo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.bigFanQi.smallFanQi.clubgo.aiTool.DBTool;

@RestController
@RequiredArgsConstructor
public class AIController {

    private final ChatClient chatClient;

    @GetMapping("/deepSeek")
    public void talkToDeepseek(@RequestParam String message, @RequestParam String userId) {
        chatClient.prompt(message)
                .tools(new DBTool())
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, userId))
                .stream()
                .content()
                .subscribe(System.out::println);
    }


}
