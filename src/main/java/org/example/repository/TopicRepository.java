package org.example.repository;

import org.example.dto.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
