package com.blog.oceanbai.core.service;

import com.blog.oceanbai.core.api.dto.ClassificationDTO;

import java.util.List;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author ocean.bai
 * @since 2020-08-31
 */
public interface IClassificationService {

    ClassificationDTO addClassification(ClassificationDTO classificationDTO);

    String deleteClassification(String sortId);

    ClassificationDTO updateClassification(ClassificationDTO classificationDTO);

    List<ClassificationDTO> getClassificationList(ClassificationDTO classificationDTO);

}
