package com.blog.oceanbai.core.service.impl;

import com.blog.oceanbai.core.api.dto.SortDTO;
import com.blog.oceanbai.core.dao.entity.Article;
import com.blog.oceanbai.core.dao.entity.Sort;
import com.blog.oceanbai.core.dao.mapper.SortMapper;
import com.blog.oceanbai.core.service.ISortService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.oceanbai.core.utils.SnowFlakeIdGenerator;
import com.blog.oceanbai.core.utils.SnowFlakeIdUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
@Service
public class SortServiceImpl extends ServiceImpl<SortMapper, Sort> implements ISortService {

    @Resource
    private SnowFlakeIdUtil snowFlakeIdUtil;

    @Override
    public SortDTO addSort(SortDTO sortDTO) {
        Sort sort = new Sort(snowFlakeIdUtil.nextId());
        BeanUtils.copyProperties(sortDTO,sort);
        baseMapper.insert(sort);
        sortDTO.setSortId(sort.getId() + "");
        return sortDTO;
    }

    @Override
    public String deleteSort(String sortId) {
        return null;
    }

    @Override
    public SortDTO updateSort(SortDTO sortDTO) {
        return null;
    }

    @Override
    public List<SortDTO> getSortList(SortDTO sortDTO) {
        return null;
    }
}
