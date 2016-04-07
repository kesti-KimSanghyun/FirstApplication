package kr.ksh.firstproject.repository;

import java.util.Date;
/*
 * 인덱스번호
 * 게시판 아이디
 * 게시판 이름
 * 게시판 생성일
 */
public class BoardList {
	private long boardIdx;
    private String boardId;
    private String boardName;
    private Date boardDate;

    public BoardList(long boardIdx, String boardId, String boardName, Date boardDate) {
        this.boardIdx = boardIdx;
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardDate = boardDate;
    }

    public long getId() {
        return boardIdx;
    }

    public String getContent() {
        return boardId;
    }
    
    public String boardName() {
        return boardName;
    }
    
    public Date boardDate() {
        return boardDate;
    }
}
