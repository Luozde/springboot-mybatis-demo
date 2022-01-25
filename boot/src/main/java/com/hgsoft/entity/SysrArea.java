package com.hgsoft.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 区域表信息Entity
 *
 * @author draghu
 * @version 2020-04-26 03:08:13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysrArea {
    private static final long serialVersionUID = 1L;
    private String id;       // 主键
    /**
     * 名称
     */
    private String name;


}
