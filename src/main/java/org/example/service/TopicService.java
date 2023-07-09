package org.example.service;

import org.example.dto.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    // Arrays.asList is immutatble so have to create new instance to add dynamically.
    private List<Topic> topicList = new ArrayList<>(Arrays.asList(
            new Topic("CSE","Data Structures and Algorithms"),
            new Topic("MCH" , "Fluid Dynamics")
        )
    );

    public List<Topic> getTopicList() {
        return this.topicList;
    }

    public Topic getTopicByName(String name) {
        return topicList.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }

    public void addTopicToList(Topic topic) {
        topicList.add(topic);
    }

    public void updateTopicToList(String name, Topic topic) {
        for(int i=0; i<topicList.size(); i++) {
            if(topicList.get(i).getName().equals(name)) {
                topicList.set(i, topic);
            }
        }
    }

    public void deleteTopicToList(String name) {
        topicList.removeIf(t->t.getName().equals(name));
    }
}
