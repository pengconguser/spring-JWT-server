package com.list.listTest.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * 自动维护时间戳,所有实体类都必须继承该类
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class baseModel {
    @CreatedDate
    private Date created_at;

    @LastModifiedDate
    private Date updated_at;

    public Date getCreated_at() {
        return created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
