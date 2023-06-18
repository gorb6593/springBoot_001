package com.exam.sbb.question;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter

public class QuestionForm {

    @NotEmpty(message="제목은 필수항목입니다.")
    @Size(max=200, message = "제목은 200자 이하로 쓰셈")
    private String subject;

    @NotEmpty(message="내용은 필수항목입니다.")
    private String content;
}
