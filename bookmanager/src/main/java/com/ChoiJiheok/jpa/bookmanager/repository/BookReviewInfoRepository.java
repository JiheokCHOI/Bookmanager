package com.ChoiJiheok.jpa.bookmanager.repository;

import com.ChoiJiheok.jpa.bookmanager.domain.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewInfoRepository extends JpaRepository<BookReviewInfo, Long> {
}
