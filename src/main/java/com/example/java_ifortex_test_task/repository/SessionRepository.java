package com.example.java_ifortex_test_task.repository;

import com.example.java_ifortex_test_task.entity.DeviceType;
import com.example.java_ifortex_test_task.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long> {
    @Query(value = "", nativeQuery = true)
    Session getFirstDesktopSession(DeviceType deviceType);

    @Query(value = "", nativeQuery = true)
    List<Session> getSessionsFromActiveUsersEndedBefore2025(LocalDateTime endDate);
}