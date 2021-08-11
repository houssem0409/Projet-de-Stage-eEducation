package com.example.stage.projet_education_stage2021.controller;

import com.example.stage.projet_education_stage2021.model.Comment;
import com.example.stage.projet_education_stage2021.model.Student;
import com.example.stage.projet_education_stage2021.service.CommentService;
import com.example.stage.projet_education_stage2021.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("education/")
public class CommentController {
    @Autowired
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
    //http://localhost:8080/system/comments
    @GetMapping("comments")
    public List<Comment> getComments(){
        return commentService.getComments();
    }
    //http://localhost:8080/system/comments/id
    @GetMapping("comment")
    public Comment getCommentById(@RequestParam Long id){
        return commentService.getCommentById(id);
    }
    //http://localhost:8080/system/comments
    @PostMapping("comments")
    public Comment saveComments(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }
    //http://localhost:8080/system/comments
    @PutMapping("comments")
    public Comment editComments(@RequestBody Comment comment, @RequestParam  Long id){
        comment.setIdComment(id);
        return commentService.editComment(comment);
    }
    @DeleteMapping ("comments")
    public void deleteComment(Comment comment, @RequestParam  Long id){
        commentService.deleteComment(id);
    }
}
