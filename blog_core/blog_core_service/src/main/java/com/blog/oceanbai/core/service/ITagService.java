package com.blog.oceanbai.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.oceanbai.common.model.response.BlogApiResponse;
import com.blog.oceanbai.core.api.dto.TagDTO;
import com.blog.oceanbai.core.api.model.TagCondition;
import com.blog.oceanbai.core.api.vo.TagVO;
import com.blog.oceanbai.core.dao.entity.Tag;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
public interface ITagService {

    TagDTO addTag(TagDTO tagDTO);

    BlogApiResponse<Boolean> deleteTag(String tagId);

    TagDTO updateTag(TagDTO tagDTO);

    Page<TagVO> getTagList(TagCondition tagCondition);
}
