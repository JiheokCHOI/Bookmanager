package com.ChoiJiheok.jpa.bookmanager.repository;

import com.ChoiJiheok.jpa.bookmanager.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
