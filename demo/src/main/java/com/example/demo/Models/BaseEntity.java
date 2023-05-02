package com.example.demo.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.util.Date;
@Getter
@Setter
@Data
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    String createdDate;

    String updatedDate;

    Boolean isActive;
}
