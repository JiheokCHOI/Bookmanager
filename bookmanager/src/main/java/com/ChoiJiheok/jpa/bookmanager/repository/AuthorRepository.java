package com.ChoiJiheok.jpa.bookmanager.repository;

import com.ChoiJiheok.jpa.bookmanager.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author, Long> {
}
