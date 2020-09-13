package com.blog.oceanbai.core.service.impl;

import com.blog.oceanbai.core.api.dto.ClassificationDTO;
import com.blog.oceanbai.core.dao.entity.Classification;
import com.blog.oceanbai.core.dao.mapper.SortMapper;
import com.blog.oceanbai.core.service.IClassificationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ClassificationServiceImpl extends ServiceImpl<SortMapper, Classification> implements IClassificationService {

    @Resource
    private SnowFlakeIdUtil snowFlakeIdUtil;

    @Override
    public ClassificationDTO addClassification(ClassificationDTO classificationDTO) {
        Classification classification = new Classification(snowFlakeIdUtil.nextId());
        BeanUtils.copyProperties(classificationDTO, classification);
        baseMapper.insert(classification);
        classificationDTO.setId(classification.getId() + "");
        return classificationDTO;
    }

    @Override
    public String deleteClassification(String sortId) {
        return null;
    }

    @Override
    public ClassificationDTO updateClassification(ClassificationDTO classificationDTO) {
        Classification classification = new Classification();
        BeanUtils.copyProperties(classificationDTO, classification);
        baseMapper.updateById(classification);
        return classificationDTO;
    }

    @Override
    public List<ClassificationDTO> getClassificationList(ClassificationDTO classificationDTO) {
        return null;
    }
}
