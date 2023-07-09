package org.example.controller;

import org.example.dto.Topic;
import org.example.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getTopicList();
    }

    @RequestMapping("/topics/{name}")
    public Topic getTopicByName(@PathVariable("name") String name) {
        System.out.println(name);
        return topicService.getTopicByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopicToList(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{name}")
    public void addTopic(@RequestBody Topic topic, @PathVariable String name) {
        topicService.updateTopicToList(name, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{name}")
    public void addTopic(@PathVariable String name) {
        topicService.deleteTopicToList(name);
    }
}
