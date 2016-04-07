package kr.ksh.firstproject.repository;

/*
 * 인덱스번호
 * 게시판 아이디
 * 게시판 이름
 * 공지사항 유무 체크
 * 게시글 작성자
 * 게시글 작성자 아이디
 * 게시글 제목
 * 게시글 내용
 * 게시글 등록일
 * 게시글 수정일
 * 게시글 삭제 유무
 * 게시글 작성자 아이피
 */
public class BoardSetting {
	private int BoardSettingIdx;
	private String BoardSettingId;
	private String BoardSettingName;
	private String BoardNoticeUse;
	private String BoardWriter;
	private String BoardWriterId;
	private String BoardSubject;
	private String BoardContent;
	private String BoardWriteDate;
	private String BoardEditDate;
	private String BoardDelYN;
	private String BoardWriterIP;

	public BoardSetting(int BoardSettingIdx, String BoardSettingId,
			String BoardSettingName, String BoardNoticeUse, String BoardWriter,
			String BoardWriterId, String BoardSubject, String BoardContent, String BoardWriteDate,
			String BoardEditDate, String BoardDelYN, String BoardWriterIP) {
		this.BoardSettingIdx = BoardSettingIdx;
		this.BoardSettingId = BoardSettingId;
		this.BoardSettingName = BoardSettingName;
		this.BoardNoticeUse = BoardNoticeUse;
		this.BoardWriter = BoardWriter;		
		this.BoardWriterId = BoardWriterId;
		this.BoardSubject = BoardSubject;
		this.BoardContent = BoardContent;
		this.BoardWriteDate = BoardWriteDate;
		this.BoardEditDate = BoardEditDate;		
		this.BoardDelYN = BoardDelYN;
		this.BoardWriterIP = BoardWriterIP;
	}
	
	public int BoardSettingIdx() {
        return BoardSettingIdx;
    }

    public String BoardSettingId() {
        return BoardSettingId;
    }
    
    public String BoardSettingName() {
        return BoardSettingName;
    }
    
    public String BoardNoticeUse() {
        return BoardNoticeUse;
    }
    
    public String BoardWriter() {
        return BoardWriter;
    }

    public String BoardWriterId() {
        return BoardWriterId;
    }
    
    public String BoardSubject() {
        return BoardSubject;
    }
    
    public String BoardContent() {
        return BoardContent;
    }
    
    public String BoardWriteDate() {
        return BoardWriteDate;
    }

    public String BoardEditDate() {
        return BoardEditDate;
    }
    
    public String BoardDelYN() {
        return BoardDelYN;
    }
    
    public String BoardWriterIP() {
        return BoardWriterIP;
    }
}
