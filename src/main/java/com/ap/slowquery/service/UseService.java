package com.ap.slowquery.service;

import com.ap.slowquery.entity.DemoUser;

import java.util.List;
import java.util.Optional;

public interface UseService {
    Optional<List<DemoUser>> getAllUser();
    DemoUser save(DemoUser demoUser);
}
