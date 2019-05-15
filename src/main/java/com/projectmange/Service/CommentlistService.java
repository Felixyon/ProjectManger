package com.projectmange.Service;

import com.projectmange.Entity.Commentlist;

import java.util.List;

public interface CommentlistService {
    List<Commentlist> selectoneCommentlistandshow(int id);
}
