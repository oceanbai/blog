package com.blog.oceanbai.core.service.impl;

import com.blog.oceanbai.common.model.response.BlogApiResponse;
import com.blog.oceanbai.core.api.dto.TagDTO;
import com.blog.oceanbai.core.api.model.TagCondition;
import com.blog.oceanbai.core.api.vo.TagVO;
import com.blog.oceanbai.core.dao.entity.Article;
import com.blog.oceanbai.core.dao.entity.Tag;
import com.blog.oceanbai.core.dao.mapper.TagMapper;
import com.blog.oceanbai.core.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.oceanbai.core.utils.SnowFlakeIdUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

    @Resource
    private SnowFlakeIdUtil snowFlakeIdUtil;

    @Override
    public TagDTO addTag(TagDTO tagDTO) {
        Tag tag = new Tag(snowFlakeIdUtil.nextId());
        BeanUtils.copyProperties(tagDTO,tag);
        baseMapper.insert(tag);
        return tagDTO;
    }

    @Override
    public BlogApiResponse<Boolean> deleteTag(String tagId) {
       int deleteOk = baseMapper.deleteById(Long.parseLong(tagId));
       if (deleteOk == 1){
          return BlogApiResponse.ok(Boolean.TRUE);
       }else {
           return BlogApiResponse.fail(Boolean.FALSE);
       }
    }

    @Override
    public TagDTO updateTag(TagDTO tagDTO) {
        return null;
    }

    @Override
    public Page<TagVO> getTagList(TagCondition tagCondition) {
        PageHelper.startPage(tagCondition.getPage(),tagCondition.getPageSize());
        Page<TagVO> listPage =  baseMapper.getTagList(tagCondition);
        return listPage;
    }
}
