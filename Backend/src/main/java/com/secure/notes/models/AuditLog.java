package com.secure.notes.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action;
    private String username;
    private Long noteId;

    @Lob
    private String noteContent;
    private LocalDateTime timestamp;
}
