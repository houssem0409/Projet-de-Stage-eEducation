package com.example.stage.projet_education_stage2021.service;

import com.example.stage.projet_education_stage2021.dao.CommentRepository;
import com.example.stage.projet_education_stage2021.dao.HomeWorkRepository;
import com.example.stage.projet_education_stage2021.model.Comment;
import com.example.stage.projet_education_stage2021.model.HomeWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private CommentRepository commentRepository;
    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public List<Comment> getComments(){
        return commentRepository.findAll();
    }
    public Comment getCommentById(Long id){
        return commentRepository.findById(id).get();
    }
    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }
    public Comment editComment(Comment comment){
        return commentRepository.save(comment);
    }
    public void deleteComment( Long id){
        commentRepository.deleteById(id);
    }
}
