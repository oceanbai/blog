# 用户表
CREATE TABLE `bl_user` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
  `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
  `created_time` datetime NOT NULL COMMENT '创建日期',
  `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
  `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
  PRIMARY KEY (`id`)
) COMMENT='用户表'