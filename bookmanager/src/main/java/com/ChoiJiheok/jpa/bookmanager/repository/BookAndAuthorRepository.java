package com.ChoiJiheok.jpa.bookmanager.repository;

import com.ChoiJiheok.jpa.bookmanager.domain.BookAndAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAndAuthorRepository extends JpaRepository<BookAndAuthor, Long> {
}
