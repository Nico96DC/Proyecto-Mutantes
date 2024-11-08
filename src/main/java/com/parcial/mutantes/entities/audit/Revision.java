package com.parcial.mutantes.entities.audit;

import com.parcial.mutantes.config.CustomRevisionListener;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Revision")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@RevisionEntity(CustomRevisionListener.class)
public class Revision implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(name = "revision_seq", sequenceName = "revision_seq")
    @RevisionNumber
    private long id;

    @Column(name = "REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}