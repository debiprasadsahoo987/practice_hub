package com.example.jobApp.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private int postId;
    private  String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
