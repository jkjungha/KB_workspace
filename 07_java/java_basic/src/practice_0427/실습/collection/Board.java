package practice_0427.실습.collection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private String subject;
    private String content;
    private String writer;

    public Board() {
    }

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }


}
