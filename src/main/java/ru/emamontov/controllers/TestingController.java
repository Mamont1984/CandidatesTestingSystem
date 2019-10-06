package ru.emamontov.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class TestingController {
    @RequestMapping(value = "/{testId}", method = RequestMethod.POST)
    public String startTest(@PathVariable int testId, Model model){
        return null;
    }

    @RequestMapping(value = "/{testId}", method = RequestMethod.GET)
    public String getQuestion(@PathVariable int testId, Model model){
        return null;
    }

    @RequestMapping(value = "/{testId}/{questionId}", method = RequestMethod.POST)
    public String answerQuestion(@PathVariable int testId, int questionId, Model model){
        return null;
    }
}
