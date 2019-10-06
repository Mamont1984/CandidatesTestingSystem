package ru.emamontov.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class TestingController {
    @RequestMapping(value = "/{testId}", method = RequestMethod.POST)
    public String startTestCase(@PathVariable int TestCaseId){
        return null;
    }

    @RequestMapping(value = "/{testId}", method = RequestMethod.GET)
    public String getCurrentQuestion(@PathVariable int TestCaseId){
        return null;
    }

    @RequestMapping(value = "/{testId}/{AnswerNumber}", method = RequestMethod.POST)
    public String answerCurrentQuestion(@PathVariable int TestCaseId, int AnswerNumber){
        return null;
    }
}
