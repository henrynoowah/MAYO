package kr.pe.mayo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Builder
public class WorkImgFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workImgIdx;

    private Long workIdx;
    private String originalFileName;
    private String storedFilePath;
    private long fileSize;
}
