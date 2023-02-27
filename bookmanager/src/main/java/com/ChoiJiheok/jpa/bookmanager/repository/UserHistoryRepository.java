package com.ChoiJiheok.jpa.bookmanager.repository;

import com.ChoiJiheok.jpa.bookmanager.domain.UserHistory;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
    List<UserHistory> findByUserId(Long userId);
}
