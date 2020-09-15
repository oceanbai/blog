package com.blog.oceanbai.core.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.blog.oceanbai.common.constant.CommonConstant;
import com.blog.oceanbai.core.api.dto.ClassificationDTO;
import com.blog.oceanbai.core.dao.entity.Classification;
import com.blog.oceanbai.core.dao.mapper.ClassificationMapper;
import com.blog.oceanbai.core.service.IClassificationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.oceanbai.core.utils.SnowFlakeIdUtil;
import lombok.experimental.UtilityClass;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
public class ClassificationServiceImpl extends ServiceImpl<ClassificationMapper, Classification> implements IClassificationService {

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
        List<ClassificationDTO> rootDict = baseMapper.getAllByParentId();
        if (CollectionUtils.isNotEmpty(rootDict)) {
            return DictTreeBuildFactory.buildListToTree(rootDict);
        }
        return new ArrayList<>();
    }

    @UtilityClass
    private static class DictTreeBuildFactory {

        public List<ClassificationDTO> buildListToTree(List<ClassificationDTO> nodeList) {
            List<ClassificationDTO> roots = findRoots(nodeList);
            List<ClassificationDTO> notRoots = (List<ClassificationDTO>) CollectionUtils.subtract(nodeList, roots);
            for (ClassificationDTO root : roots) {
                root.setChildren(findChildren(root, notRoots));
            }
            return roots;
        }

        public List<ClassificationDTO> findRoots(List<ClassificationDTO> allNodes) {
            List<ClassificationDTO> results = new ArrayList<>();
            for (ClassificationDTO node : allNodes) {
                boolean isRoot = true;
                for (ClassificationDTO comparedOne : allNodes) {
                    if (comparedOne.getId().equals(node.getParentId())) {
                        isRoot = false;
                        break;
                    }
                }
                if (isRoot) {
                    results.add(node);
                }
            }
            return results;
        }

        public List<ClassificationDTO> findChildren(ClassificationDTO root, List<ClassificationDTO> allNodes) {
            List<ClassificationDTO> children = new ArrayList<>();
            for (ClassificationDTO comparedOne : allNodes) {
                if (comparedOne.getParentId().equals(root.getId())) {
                    children.add(comparedOne);
                }
            }
            List<ClassificationDTO> notChildren = (List<ClassificationDTO>) CollectionUtils.subtract(allNodes, children);
            for (ClassificationDTO child : children) {
                List<ClassificationDTO> tmpChildren = findChildren(child, notChildren);
                child.setChildren(tmpChildren);
            }

            return children;
        }

    }

}
