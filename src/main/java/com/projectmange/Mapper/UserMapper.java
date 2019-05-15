package com.projectmange.Mapper;

import com.projectmange.Entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUserAll();
    void insertnewuser(User user);
    User login(String studentid);
    void updateworkgroupinfo(@Param("workgroup") String workgroup, @Param("studentid") String studentid);
    User getonesusername(String studentid);
    User getoneuser(String studentid);

}
