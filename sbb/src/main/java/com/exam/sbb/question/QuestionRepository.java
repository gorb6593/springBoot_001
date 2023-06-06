package com.exam.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

//    Question findBySubject(String subject);
//
//    Question findBySubjectAndContent(String subject, String content);
//
//    List<Question> findBySubjectLike(String subject);
//
//    Page<Question> findBySubjectContains(String kw, Pageable pageable);
//
//    Page<Question> findBySubjectContainsOrContentContains(String kw, String kw_, Pageable pageable);
//
//    Page<Question> findBySubjectContainsOrContentContainsOrAuthor_usernameContains(String kw, String kw_, String kw__, Pageable pageable);
//
//    Page<Question> findBySubjectContainsOrContentContainsOrAuthor_usernameContainsOrAnswerList_contentContains(String kw, String kw_, String kw__, String kw___, Pageable pageable);
//
//    Page<Question> findDistinctBySubjectContainsOrContentContainsOrAuthor_usernameContainsOrAnswerList_contentContains(String kw, String kw_, String kw__, String kw___, Pageable pageable);
//
//    Page<Question> findDistinctBySubjectContainsOrContentContainsOrAuthor_usernameContainsOrAnswerList_contentContainsOrAnswerList_author_usernameContains(String kw, String kw_, String kw__, String kw___, String kw____, Pageable pageable);
//
//    @Transactional
//    @Modifying
//    @Query(value = "ALTER TABLE question AUTO_INCREMENT = 1", nativeQuery = true)
//    void truncate();
}
