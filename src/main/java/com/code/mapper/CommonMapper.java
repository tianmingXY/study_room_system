package com.code.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.code.entity.Admininfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface CommonMapper extends BaseMapper<Admininfo> {

    //公共的查询方法
    @Select(" ${sql} ")
    public List<Map> selectAction(@Param("sql") String sql);

    //公共的增删修改方法
    @Update(" ${sql} ")
    public int updateAction(@Param("sql") String sql);



}
