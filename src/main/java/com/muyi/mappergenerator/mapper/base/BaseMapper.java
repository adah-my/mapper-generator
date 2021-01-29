package com.muyi.mappergenerator.mapper.base;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;

/**
 * 自定义BaseMapper让子接口继承（我们一般直接继承Mapper<T>，但那个不够强大）
 *
 * Mapper接口：基本的增、删、改、查方法
 * IdListMapper：支持根据IdList批量查询和删除
 * InsertListMapper：支持批量插入
 * @param <T>
 */
@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>, IdListMapper<T, Long>, InsertMapper<T> {

}