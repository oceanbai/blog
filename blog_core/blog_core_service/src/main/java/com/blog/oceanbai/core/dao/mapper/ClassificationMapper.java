package com.blog.oceanbai.core.dao.mapper;

import com.blog.oceanbai.core.api.dto.ClassificationDTO;
import com.blog.oceanbai.core.dao.entity.Classification;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 分类表 Mapper 接口
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
public interface ClassificationMapper extends BaseMapper<Classification> {

    List<ClassificationDTO> getAllByParentId();
}
