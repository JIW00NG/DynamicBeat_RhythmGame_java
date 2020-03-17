package dynamic_beat_16;

public class Track {

    private String titleImage;//제목 부분 이미지
    private String startImage;//게임 선택 창 표지 이미지
    private String gameImage;//해당 곡을 실행 했을 때 표지 이미지
    private String startMusic;//게임 선택 창 음악
    private String gameMusic;//해당 곡을 실행 했을 때 음악
    private String titleName;//곡 이름

    public String getGameImage() {
        return gameImage;
    }

    public String getGameMusic() {
        return gameMusic;
    }

    public String getStartImage() {
        return startImage;
    }

    public String getStartMusic() {
        return startMusic;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public String getTitleName(){return titleName;}

    public void setGameImage(String gameImage) {
        this.gameImage = gameImage;
    }

    public void setGameMusic(String gameMusic) {
        this.gameMusic = gameMusic;
    }

    public void setStartImage(String startImage) {
        this.startImage = startImage;
    }

    public void setStartMusic(String startMusic) {
        this.startMusic = startMusic;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public void setTitleName(String titleName){this.titleName=titleName;}

    public Track(String titleImage,String startImage,String gameImage,String startMusic,String gameMusic,String titleName){
        super();
        this.titleImage=titleImage;
        this.startImage=startImage;
        this.gameImage=gameImage;
        this.startMusic=startMusic;
        this.gameMusic=gameMusic;
        this.titleName=titleName;
    }

}
