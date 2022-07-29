package com.ap.slowquery.repository;

import com.ap.slowquery.entity.DemoUser;

import java.util.List;
import java.util.Optional;

public interface UseRepository {
    Optional<List<DemoUser>> getAllUser();
    DemoUser save(DemoUser demoUser);
}
