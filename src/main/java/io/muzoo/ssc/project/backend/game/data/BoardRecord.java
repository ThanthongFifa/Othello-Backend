package io.muzoo.ssc.project.backend.game.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "tbl_board_record")
public class BoardRecord {

    @Id
    private long id;

    private int turn;

    private long roomId;

    private long boardId = id;

    @ElementCollection
    private List<String> boardRecord;

}