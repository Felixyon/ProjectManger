package com.projectmange.Service.Impl;

import com.projectmange.Entity.Commentlist;
import com.projectmange.Mapper.CommentlistMapper;
import com.projectmange.Service.CommentlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentlistServiceImpl implements CommentlistService {
    @Autowired
    CommentlistMapper commentlistMapper;
    public List<Commentlist> selectoneCommentlistandshow(int id) {
        return commentlistMapper.selectoneCommentlistandshow(id);
    }
}
