package com.peerprep.peerprepbackend.entity;

import com.peerprep.peerprepbackend.common.Category;
import com.peerprep.peerprepbackend.common.Complexity;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Entity class representing a question document in MongoDB
 * To be stored in the "questions" collection
 */
@Data
@Builder
@Document(collection = "question")
public class Question {

    @Id
    String id;

    String title;
    String description;
    Set<Category> categories;
    Complexity complexity;

}