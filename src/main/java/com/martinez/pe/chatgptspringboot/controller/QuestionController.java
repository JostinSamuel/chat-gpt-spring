package com.martinez.pe.chatgptspringboot.controller;

import com.martinez.pe.chatgptspringboot.dto.ResponseDto;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class QuestionController {

    //evitamos el uso de Autowired
    private final ChatgptService chatgptService;

    @PostMapping("/send")
    public ResponseDto<String> send(@RequestBody String message) {
        log.info("Message is: {}", message);
        String responseMessage = chatgptService.sendMessage(message);
        log.info("response is: {}", responseMessage);
        return ResponseDto.success(responseMessage);
    }
}
