package com.lc.demo.mapper;

import com.lc.demo.bean.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName AdminMapper
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 0:55
 * @Version 1.0
 **/

@Mapper
public interface AdminMapper {

    @Select("select * from admin where  admin_id=#{adminId} and admin_pass=#{adminPass}")
    Admin selectAdminByIdAndPass(@Param("adminId") String adminId, @Param("adminPass") String adminPass);

}
