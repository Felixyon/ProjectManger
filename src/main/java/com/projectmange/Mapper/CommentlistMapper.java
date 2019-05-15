package com.projectmange.Mapper;

import com.projectmange.Entity.Commentlist;

import java.util.List;

public interface CommentlistMapper {
    List<Commentlist> selectoneCommentlistandshow(int id);
    void cretecommentlist(int id);
}
