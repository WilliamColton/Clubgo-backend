package xyz.bigFanQi.smallFanQi.clubgo.aiTool;

import org.springframework.ai.tool.annotation.Tool;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DBTool {

    @Tool(description = "通过该函数调用获取时间信息")
    LocalDateTime getTime(){
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}
