package com.blog.oceanbai.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.oceanbai.core.api.dto.SortDTO;
import com.blog.oceanbai.core.dao.entity.Sort;

import java.util.List;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
public interface ISortService extends IService<Sort> {

    SortDTO addSort(SortDTO sortDTO);

    String deleteSort(String sortId);

    SortDTO updateSort(SortDTO sortDTO);

    List<SortDTO> getSortList(SortDTO sortDTO);

}
