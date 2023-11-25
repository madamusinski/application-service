package pl.madamusinski.applicationservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "pl.madamusinski.applicationservice.controller")
@Slf4j
public class GlobalRestControllerAdvisor {

    private static final String ERROR_LOG_PATTERN = "Error code: {} Error message: {}";


}
