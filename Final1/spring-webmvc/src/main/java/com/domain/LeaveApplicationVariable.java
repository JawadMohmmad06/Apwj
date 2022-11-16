package com.domain;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "leaveApplicatgion")
public class LeaveApplicationVariable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "leaveapplication_employee_id_fk")
    private LeaveEmpolyeVariable empid;

    public LeaveEmpolyeVariable getEmpid() {
        return empid;
    }

    public void setEmpid(LeaveEmpolyeVariable empid) {
        this.empid = empid;
    }

    @NotNull

    private LocalDate fromDate;

    @NotNull

    private LocalDate toDate;
    @NotNull

    private String reason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
