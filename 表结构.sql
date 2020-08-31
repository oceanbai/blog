# 用户表
CREATE TABLE `blog_user` (
  `id` bigint(20) NOT NULL COMMENT '用户ID',
  `user_ip` varchar(16)  NOT NULL COMMENT '用户IP',
  `user_name` varchar(16)  NOT NULL COMMENT '用户名',
  `user_password` varchar(16)  DEFAULT NULL COMMENT '用户密码',
  `user_nickname` varchar(20)  NOT NULL COMMENT '用户昵称',
  `user_email` varchar(32)  DEFAULT NULL COMMENT '用户邮箱',
  `user_profile_url` varchar(128)  DEFAULT NULL COMMENT '用户头像',
  `user_description` varchar(64) DEFAULT NULL COMMENT '用户简介',
  `user_birthday` datetime DEFAULT NULL COMMENT '用户生日',
  `user_age` tinyint(4) DEFAULT NULL COMMENT '用户年龄',
  `user_telephone_number` varchar(11) DEFAULT NULL COMMENT '用户手机号',
  `user_registration_time` datetime DEFAULT NULL COMMENT '注册时间',
  `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
  `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
  `created_time` datetime NOT NULL COMMENT '创建日期',
  `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
  `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
  PRIMARY KEY (`id`)
) COMMENT='用户表';

# 朋友链接
CREATE TABLE `blog_friend_link` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `user_id` varchar(20)  NOT NULL COMMENT '用户ID',
  `friend_link` varchar(20)  NOT NULL COMMENT '朋友链接',
  `friend_avatar_url` varchar(64)  DEFAULT NULL COMMENT '朋友头像地址',
  `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
  `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
  `created_time` datetime NOT NULL COMMENT '创建日期',
  `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
  `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
  PRIMARY KEY (`id`)
) COMMENT='朋友链接';

# 管理员表
CREATE TABLE `blog_admin` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `account` varchar(20)  NOT NULL COMMENT '账号',
  `passward` varchar(20)  NOT NULL COMMENT '密码',
  `avatar_url` varchar(15)  DEFAULT NULL COMMENT '头像地址',
  `about` varchar(15)  DEFAULT NULL COMMENT '关于',
  `simple_talk` varchar(15)  DEFAULT NULL COMMENT '简言',
  `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
  `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
  `created_time` datetime NOT NULL COMMENT '创建日期',
  `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
  `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
  PRIMARY KEY (`id`)
) COMMENT='管理员表';

# 文章管理
CREATE TABLE `blog_article` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `admin_id` bigint(20) NOT NULL COMMENT '发表用户ID',
  `article_title` varchar(64) NOT NULL COMMENT '博文标题',
  `article_content` longtext  NOT NULL COMMENT '博文内容',
--   `article_views` bigint(20) NOT NULL COMMENT '浏览量',
  `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
  `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
  `created_time` datetime NOT NULL COMMENT '创建时间',
  `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
  `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
  PRIMARY KEY (`id`)
) COMMENT='文章管理表';

# 标签
CREATE TABLE `blog_tag` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `tag_name` varchar(16) NOT NULL COMMENT '标签名',
  `link_article_count` int NOT NULL COMMENT '关联的文章数量',
  `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
  `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
  `created_time` datetime NOT NULL COMMENT '创建时间',
  `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
  `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
  PRIMARY KEY (`id`)
) COMMENT='标签表';

# 文章与标签表的关系表
CREATE TABLE `blog_tag_links` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `tag_id` bigint(20) NOT NULL COMMENT '标签ID',
  `article_id` bigint(20) NOT NULL COMMENT '文章ID',
  `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
  `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
  `created_time` datetime NOT NULL COMMENT '创建时间',
  `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
  `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
  PRIMARY KEY (`id`)
) COMMENT='文章与标签表的关系表';

# 分类表
CREATE TABLE `blog_sort` (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `sort_name` varchar(64) NOT NULL COMMENT '分类名称',
  `sort_alias` varchar(32) NOT NULL COMMENT '分类别名',
  `parent_sort_id` bigint(20) NOT NULL COMMENT '父分类ID',
  `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
  `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
  `created_time` datetime NOT NULL COMMENT '创建时间',
  `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
  `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
  PRIMARY KEY (`id`)
) COMMENT='分类表';

# 留言板
-- CREATE TABLE `blog_sort` (
--   `id` varchar(32) NOT NULL COMMENT '主键ID',
--    `sort_id` bigint(20) NOT NULL COMMENT '分类ID',
--   `sort_name` varchar(64) NOT NULL COMMENT '分类名称',
--   `sort_alias` varchar(32) NOT NULL COMMENT '分类别名',
--   `parent_sort_id` varchar(32) NOT NULL COMMENT '父分类ID',
--   `is_deleted` varchar(1)  NOT NULL COMMENT '是否删除（0未删除，1已删除）',
--   `created_by_id` varchar(36)  NOT NULL COMMENT '创建人',
--   `created_time` datetime NOT NULL COMMENT '创建时间',
--   `lastmodified_by_id` varchar(36)  NOT NULL COMMENT '最后更新人',
--   `lastmodified_time` datetime NOT NULL COMMENT '最后更新日期',
--   PRIMARY KEY (`id`)
-- ) COMMENT='分类表'