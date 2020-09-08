package com.blog.oceanbai.core.dao.mapper;

import com.blog.oceanbai.core.api.model.TagCondition;
import com.blog.oceanbai.core.api.vo.TagVO;
import com.blog.oceanbai.core.dao.entity.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 标签表 Mapper 接口
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
public interface TagMapper extends BaseMapper<Tag> {

    Page<TagVO> getTagList(@Param("condition") TagCondition tagCondition);
}
