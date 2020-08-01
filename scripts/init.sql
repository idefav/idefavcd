CREATE DATABASE db_idefavcd CHARACTER SET utf8 COLLATE utf8_general_ci;

use db_idefavcd;
create table if not exists tb_app
(
    id           bigint       not null primary key comment '自动增长ID',
    app_name     varchar(50)  not null comment '应用名称',
    git_url      varchar(100) null comment '仓库地址',
    module       varchar(50)  null comment '模块',
    project_type varchar(20)  null comment '项目类型',
    create_time  datetime     not null default current_timestamp comment '创建时间',
    update_time  datetime     not null default current_timestamp on update current_timestamp comment '修改时间',
    is_del       bit          not null default 0 comment '删除标识'
) comment '应用表';

create table if not exists tb_resource
(
    id          bigint      not null primary key comment '自动增长ID',
    res_name    varchar(20) not null comment '资源名称',
    res_type    varchar(20) not null comment '资源类型',
    content_id  bigint comment '内容ID',
    sync_status varchar(20) comment '同步状态',
    create_time datetime    not null default current_timestamp comment '创建时间',
    update_time datetime    not null default current_timestamp on update current_timestamp comment '修改时间',
    is_del      bit         not null default 0 comment '删除标识'
) comment '资源表';

create table if not exists tb_content
(
    id          bigint        not null primary key comment '自动增长ID',
    content     varchar(1000) not null comment '配置内容',
    create_time datetime      not null default current_timestamp comment '创建时间',
    update_time datetime      not null default current_timestamp on update current_timestamp comment '修改时间',
    is_del      bit           not null default 0 comment '删除标识'
) comment '配置内容表';

create table if not exists tb_params
(
    id            bigint       not null primary key comment '自动增长ID',
    res_id        bigint       not null comment '资源ID',
    param_name    varchar(20)  not null comment '参数名称',
    param_value   varchar(100) comment '参数值',
    param_desc    varchar(100) not null comment '参数描述',
    param_default varchar(20) comment '参数默认值',
    create_time   datetime     not null default current_timestamp comment '创建时间',
    update_time   datetime     not null default current_timestamp on update current_timestamp comment '修改时间',
    is_del        bit          not null default 0 comment '删除标识'
) comment '参数表';

create table if not exists tb_app_task
(
    id          bigint   not null primary key comment '自动增长ID',
    app_id      bigint   not null comment '应用ID',
    pipeline_id bigint   not null comment 'pipelineID',
    create_time datetime not null default current_timestamp comment '创建时间',
    update_time datetime not null default current_timestamp on update current_timestamp comment '修改时间',
    is_del      bit      not null default 0 comment '删除标识'
) comment '应用任务';


create table if not exists tb_task_history
(
    id          bigint   not null primary key comment '自动增长ID',
    task_id     bigint   not null comment '任务ID',
    content_id  bigint comment '内容ID',
    create_time datetime not null default current_timestamp comment '创建时间',
    update_time datetime not null default current_timestamp on update current_timestamp comment '修改时间',
    is_del      bit      not null default 0 comment '删除标识'
) comment '运行历史';

create table if not exists tb_user
(
    id          bigint      not null primary key comment '自动增长ID',
    user_name   varchar(30) not null comment '用户名',
    password    varchar(50) not null comment '密码',
    create_time datetime    not null default current_timestamp comment '创建时间',
    update_time datetime    not null default current_timestamp on update current_timestamp comment '修改时间',
    is_del      bit         not null default 0 comment '删除标识'
) comment '用户表';

