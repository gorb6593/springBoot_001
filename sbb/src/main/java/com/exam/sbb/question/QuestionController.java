package com.exam.sbb.question;

import com.exam.sbb.answer.AnswerForm;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/question")
@Controller
@RequiredArgsConstructor // 생성자 주입
/*
컨트롤러는 리포지토리가 있는지 몰라야한다.
서비스는 브라우저가 있는지 몰라야한다.
리포지토리는 서비스가 있는지 몰라야한다.
서비스는 컨트롤러를 몰라야한다
db는 리포지토리를 몰라야한다
spring data jpa는 mysql을 몰라야한다
spring data jpa(리포지토리) -> jpa -> 하이버네이트 -> jdbc -> mysql드라이버 -> mysql
 */
public class QuestionController {

    //@autowired 필드 주입
    private final QuestionService questionService;
    @GetMapping("/list")
    //이 자리에 @responsebody가 없으면 resources/templates/question_list.html 파일을 뷰로 한다
    public String list(Model model,  @RequestParam(defaultValue="0") int page) {
        Page<Question> paging = this.questionService.getList(page);

        // 미리 실행된 question_list.html에서
        // questionList라는 이름으로 변수를 사용할 수 있다.
        model.addAttribute("paging", paging);
        return "question_list";
    }


    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable long id, AnswerForm answerForm) {
        Question question = questionService.getQuestion(id);

        model.addAttribute("question",question);

        return "question_detail";
    }

    @GetMapping("/create")
    public String questionCreate(QuestionForm questionForm) {
        return "question_form";
    }

    @PostMapping("/create")
    public String questionCreate(Model model, @Valid QuestionForm questionForm, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return "question_form";
        }

        questionService.create(questionForm.getSubject(), questionForm.getSubject());

        return "redirect:/question/list"; // 질문 저장후 질문목록으로 이동
    }

}
