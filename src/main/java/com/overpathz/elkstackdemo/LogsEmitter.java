package com.overpathz.elkstackdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LogsEmitter {
    @Scheduled(fixedRate=900)
    public void postTrace(){
        log.trace("Trace message ");
    }

    @Scheduled(fixedRate=800)
    public void postDebug(){
        log.debug("Debug message");
    }

    @Scheduled(fixedRate=1100)
    public void postInfo(){
        log.info("Info message");
    }

    @Scheduled(fixedRate=1200)
    public void postWarn(){
        log.warn("Warn message");
    }

    @Scheduled(fixedRate=600)
    public void postError(){
        log.error("Error message");
    }

    @Scheduled(fixedRate=2000)
    public void postException(){
        throw new RuntimeException("Exception");
    }
}
