package za.co.wyzetech.api;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public abstract class Model implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "date_time_created")
  private LocalDateTime dateTimeCreated;

  @Column(name = "date_time_updated")
  private LocalDateTime dateTimeUpdated;

  @PrePersist
  private void prePersist() {
    final LocalDateTime now = LocalDateTime.now();

    id = UUID.randomUUID();
    dateTimeCreated = now;
    dateTimeUpdated = now;
  }

  @PreUpdate
  private void postPersist() {
    dateTimeUpdated = LocalDateTime.now();
  }
}
