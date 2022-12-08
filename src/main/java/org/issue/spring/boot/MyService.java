package org.issue.spring.boot;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final EntityManager entityManager;

    public MyService(EntityManager entityManager){
        this.entityManager  = entityManager;
    }
}
