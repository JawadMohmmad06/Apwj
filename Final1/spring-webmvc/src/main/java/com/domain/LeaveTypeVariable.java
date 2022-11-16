package com.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "leavetype")
public class LeaveTypeVariable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "leavetype_leaveapplication_id_fk")
    private LeaveApplicationVariable appid;

    public LeaveApplicationVariable getAppid() {
        return appid;
    }

    public void setAppid(LeaveApplicationVariable appid) {
        this.appid = appid;
    }

    @NotNull
    @Column(name = "category")
    private String category;

    @NotNull
    @Column(name = "totalDays")
    private String totalDays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(String totalDays) {
        this.totalDays = totalDays;
    }
}
