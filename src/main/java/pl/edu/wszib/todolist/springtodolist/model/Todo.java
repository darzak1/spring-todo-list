package pl.edu.wszib.todolist.springtodolist.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Todo {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    public String title;
    @Column(nullable = false)
    public Date dueDate;
    @Column(nullable = false)
    public Status status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
