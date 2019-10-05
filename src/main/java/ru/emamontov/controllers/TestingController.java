package ru.emamontov.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestingController {
    @RequestMapping(value = "/start/{TestCaseId}", method = RequestMethod.GET)
    public String startTestCase(@PathVariable int TestCaseId){
        return null;
    }

    @RequestMapping(value = "/{TestCaseId}", method = RequestMethod.GET)
    public String getCurrentQuestion(@PathVariable int TestCaseId){
        return null;
    }

    @RequestMapping(value = "/{TestCaseId}/{AnswerNumber}", method = RequestMethod.POST)
    public String answerCurrentQuestion(@PathVariable int TestCaseId, int AnswerNumber){
        return null;
    }
}
