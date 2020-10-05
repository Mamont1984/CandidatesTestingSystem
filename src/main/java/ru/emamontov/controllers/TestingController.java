package ru.emamontov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.emamontov.services.TestingService;

@Controller
@RequestMapping("/tests")
public class TestingController {
    @Autowired
    TestingService testingService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAvailableTests(Model model){

        model.addAttribute("selections", testingService.getAllTests());
        return "tests/all";
    }

    @RequestMapping(value = "/{testId}", method = RequestMethod.POST)
    public String startTest(@PathVariable int testId, Model model){
        return null; //todo
    }

    @RequestMapping(value = "/{testId}/{questionId}", method = RequestMethod.GET)
    public String getQuestion(@PathVariable int testId, int questionId, Model model){
        return null; //todo
    }

    @RequestMapping(value = "/{testId}/{questionId}", method = RequestMethod.POST)
    public String answerQuestion(@PathVariable int testId, int questionId, Model model){
        return null; //todo
    }
}
