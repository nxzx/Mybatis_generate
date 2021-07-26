package com.migu.spms.dao.entity;

import java.util.Date;
import lombok.Data;

/**
 * 表名：talent_judge
 */
@Data
public class TalentJudgeDO {
    /**
     * 主键
     **/
    private Integer id;

    /**
     * 用户表主键id
     **/
    private Integer userId;

    /**
     * 员工编号
     **/
    private String employeeNum;

    /**
     * 公司id，org表type为2的主键
     **/
    private Integer companyId;

    /**
     * 部门id，org表type为3的主键id
     **/
    private Integer departmentId;

    /**
     * 类型，1：内部评委，2：外部评委
     **/
    private Integer type;

    /**
     * 族群id，position表type为1的主键id
     **/
    private Integer groupId;

    /**
     * 序列id，position表type为2的主键id
     **/
    private Integer sequenceId;

    /**
     * 岗位id,position表type为3的主键id
     **/
    private Integer postId;

    /**
     * 岗级id，选项配置表对应的岗级(职级)
     **/
    private Integer gradeId;

    /**
     * 状态，1：有效，2：无效
     **/
    private Integer status;

    /**
     * 创建人id
     **/
    private Integer createUserId;

    /**
     * 创建时间
     **/
    private Date createDate;

    /**
     * 修改人id
     **/
    private Integer modifyUserId;

    /**
     * 修改时间
     **/
    private Date modifyDate;

    /**
     * 公司名称
     **/
    private String companyName;

    /**
     * 部门名称
     **/
    private String departmentName;

    /**
     * 族群名称
     **/
    private String groupName;

    /**
     * 序列名称
     **/
    private String sequenceName;

    /**
     * 岗位
     **/
    private String postName;

    /**
     * 职级
     **/
    private String band;

    /**
     * 名称
     **/
    private String name;
}