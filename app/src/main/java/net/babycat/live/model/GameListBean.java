package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import dh.c;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GameListBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("game_baishun")
        private List<GameBaishunDTO> gameBaishun;

        @SerializedName("game_baishun_config")
        private GameBaishunConfigDTO gameBaishunConfig;

        @SerializedName("game_list")
        private List<GameListDTO> gameList;

        /* JADX INFO: renamed from: top, reason: collision with root package name */
        @SerializedName("top")
        private String f34832top;

        public static class GameBaishunConfigDTO {

            @SerializedName("appChannel")
            private String appChannel;

            @SerializedName("appId")
            private String appId;

            @SerializedName("code")
            private String code;

            @SerializedName("gameConfig")
            private GameConfigDTO gameConfig;

            @SerializedName("gameMode")
            private Integer gameMode;

            @SerializedName("gsp")
            private Integer gsp;

            @SerializedName(c.f24533f)
            private Integer language;

            @SerializedName(TUIConstants.TUILive.ROOM_ID)
            private String roomId;

            @SerializedName(TUIConstants.TUILive.USER_ID)
            private String userId;

            public static class GameConfigDTO {

                @SerializedName("currencyIcon")
                private String currencyIcon;

                @SerializedName("sceneMode")
                private Integer sceneMode;

                public boolean canEqual(Object obj) {
                    return obj instanceof GameConfigDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof GameConfigDTO)) {
                        return false;
                    }
                    GameConfigDTO gameConfigDTO = (GameConfigDTO) obj;
                    if (!gameConfigDTO.canEqual(this)) {
                        return false;
                    }
                    Integer sceneMode = getSceneMode();
                    Integer sceneMode2 = gameConfigDTO.getSceneMode();
                    if (sceneMode != null ? !sceneMode.equals(sceneMode2) : sceneMode2 != null) {
                        return false;
                    }
                    String currencyIcon = getCurrencyIcon();
                    String currencyIcon2 = gameConfigDTO.getCurrencyIcon();
                    return currencyIcon != null ? currencyIcon.equals(currencyIcon2) : currencyIcon2 == null;
                }

                public String getCurrencyIcon() {
                    return this.currencyIcon;
                }

                public Integer getSceneMode() {
                    return this.sceneMode;
                }

                public int hashCode() {
                    Integer sceneMode = getSceneMode();
                    int iHashCode = sceneMode == null ? 43 : sceneMode.hashCode();
                    String currencyIcon = getCurrencyIcon();
                    return ((iHashCode + 59) * 59) + (currencyIcon != null ? currencyIcon.hashCode() : 43);
                }

                public void setCurrencyIcon(String str) {
                    this.currencyIcon = str;
                }

                public void setSceneMode(Integer num) {
                    this.sceneMode = num;
                }

                public String toString() {
                    return "GameListBean.DataDTO.GameBaishunConfigDTO.GameConfigDTO(sceneMode=" + getSceneMode() + ", currencyIcon=" + getCurrencyIcon() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof GameBaishunConfigDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GameBaishunConfigDTO)) {
                    return false;
                }
                GameBaishunConfigDTO gameBaishunConfigDTO = (GameBaishunConfigDTO) obj;
                if (!gameBaishunConfigDTO.canEqual(this)) {
                    return false;
                }
                Integer gameMode = getGameMode();
                Integer gameMode2 = gameBaishunConfigDTO.getGameMode();
                if (gameMode != null ? !gameMode.equals(gameMode2) : gameMode2 != null) {
                    return false;
                }
                Integer language = getLanguage();
                Integer language2 = gameBaishunConfigDTO.getLanguage();
                if (language != null ? !language.equals(language2) : language2 != null) {
                    return false;
                }
                Integer gsp = getGsp();
                Integer gsp2 = gameBaishunConfigDTO.getGsp();
                if (gsp != null ? !gsp.equals(gsp2) : gsp2 != null) {
                    return false;
                }
                String appChannel = getAppChannel();
                String appChannel2 = gameBaishunConfigDTO.getAppChannel();
                if (appChannel != null ? !appChannel.equals(appChannel2) : appChannel2 != null) {
                    return false;
                }
                String appId = getAppId();
                String appId2 = gameBaishunConfigDTO.getAppId();
                if (appId != null ? !appId.equals(appId2) : appId2 != null) {
                    return false;
                }
                String userId = getUserId();
                String userId2 = gameBaishunConfigDTO.getUserId();
                if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                    return false;
                }
                String code = getCode();
                String code2 = gameBaishunConfigDTO.getCode();
                if (code != null ? !code.equals(code2) : code2 != null) {
                    return false;
                }
                String roomId = getRoomId();
                String roomId2 = gameBaishunConfigDTO.getRoomId();
                if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
                    return false;
                }
                GameConfigDTO gameConfig = getGameConfig();
                GameConfigDTO gameConfig2 = gameBaishunConfigDTO.getGameConfig();
                return gameConfig != null ? gameConfig.equals(gameConfig2) : gameConfig2 == null;
            }

            public String getAppChannel() {
                return this.appChannel;
            }

            public String getAppId() {
                return this.appId;
            }

            public String getCode() {
                return this.code;
            }

            public GameConfigDTO getGameConfig() {
                return this.gameConfig;
            }

            public Integer getGameMode() {
                return this.gameMode;
            }

            public Integer getGsp() {
                return this.gsp;
            }

            public Integer getLanguage() {
                return this.language;
            }

            public String getRoomId() {
                return this.roomId;
            }

            public String getUserId() {
                return this.userId;
            }

            public int hashCode() {
                Integer gameMode = getGameMode();
                int iHashCode = gameMode == null ? 43 : gameMode.hashCode();
                Integer language = getLanguage();
                int iHashCode2 = ((iHashCode + 59) * 59) + (language == null ? 43 : language.hashCode());
                Integer gsp = getGsp();
                int iHashCode3 = (iHashCode2 * 59) + (gsp == null ? 43 : gsp.hashCode());
                String appChannel = getAppChannel();
                int iHashCode4 = (iHashCode3 * 59) + (appChannel == null ? 43 : appChannel.hashCode());
                String appId = getAppId();
                int iHashCode5 = (iHashCode4 * 59) + (appId == null ? 43 : appId.hashCode());
                String userId = getUserId();
                int iHashCode6 = (iHashCode5 * 59) + (userId == null ? 43 : userId.hashCode());
                String code = getCode();
                int iHashCode7 = (iHashCode6 * 59) + (code == null ? 43 : code.hashCode());
                String roomId = getRoomId();
                int iHashCode8 = (iHashCode7 * 59) + (roomId == null ? 43 : roomId.hashCode());
                GameConfigDTO gameConfig = getGameConfig();
                return (iHashCode8 * 59) + (gameConfig != null ? gameConfig.hashCode() : 43);
            }

            public void setAppChannel(String str) {
                this.appChannel = str;
            }

            public void setAppId(String str) {
                this.appId = str;
            }

            public void setCode(String str) {
                this.code = str;
            }

            public void setGameConfig(GameConfigDTO gameConfigDTO) {
                this.gameConfig = gameConfigDTO;
            }

            public void setGameMode(Integer num) {
                this.gameMode = num;
            }

            public void setGsp(Integer num) {
                this.gsp = num;
            }

            public void setLanguage(Integer num) {
                this.language = num;
            }

            public void setRoomId(String str) {
                this.roomId = str;
            }

            public void setUserId(String str) {
                this.userId = str;
            }

            public String toString() {
                return "GameListBean.DataDTO.GameBaishunConfigDTO(appChannel=" + getAppChannel() + ", appId=" + getAppId() + ", userId=" + getUserId() + ", code=" + getCode() + ", roomId=" + getRoomId() + ", gameMode=" + getGameMode() + ", language=" + getLanguage() + ", gameConfig=" + getGameConfig() + ", gsp=" + getGsp() + ")";
            }
        }

        public static class GameBaishunDTO {

            @SerializedName("icon")
            private String icon;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private String f34833id;

            @SerializedName("name")
            private String name;

            @SerializedName("url")
            private String url;

            public boolean canEqual(Object obj) {
                return obj instanceof GameBaishunDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GameBaishunDTO)) {
                    return false;
                }
                GameBaishunDTO gameBaishunDTO = (GameBaishunDTO) obj;
                if (!gameBaishunDTO.canEqual(this)) {
                    return false;
                }
                String id2 = getId();
                String id3 = gameBaishunDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                String name = getName();
                String name2 = gameBaishunDTO.getName();
                if (name != null ? !name.equals(name2) : name2 != null) {
                    return false;
                }
                String icon = getIcon();
                String icon2 = gameBaishunDTO.getIcon();
                if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                    return false;
                }
                String url = getUrl();
                String url2 = gameBaishunDTO.getUrl();
                return url != null ? url.equals(url2) : url2 == null;
            }

            public String getIcon() {
                return this.icon;
            }

            public String getId() {
                return this.f34833id;
            }

            public String getName() {
                return this.name;
            }

            public String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                String name = getName();
                int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
                String icon = getIcon();
                int iHashCode3 = (iHashCode2 * 59) + (icon == null ? 43 : icon.hashCode());
                String url = getUrl();
                return (iHashCode3 * 59) + (url != null ? url.hashCode() : 43);
            }

            public void setIcon(String str) {
                this.icon = str;
            }

            public void setId(String str) {
                this.f34833id = str;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public String toString() {
                return "GameListBean.DataDTO.GameBaishunDTO(id=" + getId() + ", name=" + getName() + ", icon=" + getIcon() + ", url=" + getUrl() + ")";
            }
        }

        public static class GameListDTO {

            @SerializedName("icon")
            private String icon;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private String f34834id;

            @SerializedName("name")
            private String name;

            @SerializedName("type")
            private Integer type;

            @SerializedName("url")
            private String url;

            public boolean canEqual(Object obj) {
                return obj instanceof GameListDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GameListDTO)) {
                    return false;
                }
                GameListDTO gameListDTO = (GameListDTO) obj;
                if (!gameListDTO.canEqual(this)) {
                    return false;
                }
                Integer type = getType();
                Integer type2 = gameListDTO.getType();
                if (type != null ? !type.equals(type2) : type2 != null) {
                    return false;
                }
                String id2 = getId();
                String id3 = gameListDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                String name = getName();
                String name2 = gameListDTO.getName();
                if (name != null ? !name.equals(name2) : name2 != null) {
                    return false;
                }
                String icon = getIcon();
                String icon2 = gameListDTO.getIcon();
                if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                    return false;
                }
                String url = getUrl();
                String url2 = gameListDTO.getUrl();
                return url != null ? url.equals(url2) : url2 == null;
            }

            public String getIcon() {
                return this.icon;
            }

            public String getId() {
                return this.f34834id;
            }

            public String getName() {
                return this.name;
            }

            public Integer getType() {
                return this.type;
            }

            public String getUrl() {
                return this.url;
            }

            public int hashCode() {
                Integer type = getType();
                int iHashCode = type == null ? 43 : type.hashCode();
                String id2 = getId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
                String name = getName();
                int iHashCode3 = (iHashCode2 * 59) + (name == null ? 43 : name.hashCode());
                String icon = getIcon();
                int iHashCode4 = (iHashCode3 * 59) + (icon == null ? 43 : icon.hashCode());
                String url = getUrl();
                return (iHashCode4 * 59) + (url != null ? url.hashCode() : 43);
            }

            public void setIcon(String str) {
                this.icon = str;
            }

            public void setId(String str) {
                this.f34834id = str;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setType(Integer num) {
                this.type = num;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public String toString() {
                return "GameListBean.DataDTO.GameListDTO(type=" + getType() + ", id=" + getId() + ", name=" + getName() + ", icon=" + getIcon() + ", url=" + getUrl() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DataDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataDTO)) {
                return false;
            }
            DataDTO dataDTO = (DataDTO) obj;
            if (!dataDTO.canEqual(this)) {
                return false;
            }
            String top2 = getTop();
            String top3 = dataDTO.getTop();
            if (top2 != null ? !top2.equals(top3) : top3 != null) {
                return false;
            }
            List<GameListDTO> gameList = getGameList();
            List<GameListDTO> gameList2 = dataDTO.getGameList();
            if (gameList != null ? !gameList.equals(gameList2) : gameList2 != null) {
                return false;
            }
            GameBaishunConfigDTO gameBaishunConfig = getGameBaishunConfig();
            GameBaishunConfigDTO gameBaishunConfig2 = dataDTO.getGameBaishunConfig();
            if (gameBaishunConfig != null ? !gameBaishunConfig.equals(gameBaishunConfig2) : gameBaishunConfig2 != null) {
                return false;
            }
            List<GameBaishunDTO> gameBaishun = getGameBaishun();
            List<GameBaishunDTO> gameBaishun2 = dataDTO.getGameBaishun();
            return gameBaishun != null ? gameBaishun.equals(gameBaishun2) : gameBaishun2 == null;
        }

        public List<GameBaishunDTO> getGameBaishun() {
            return this.gameBaishun;
        }

        public GameBaishunConfigDTO getGameBaishunConfig() {
            return this.gameBaishunConfig;
        }

        public List<GameListDTO> getGameList() {
            return this.gameList;
        }

        public String getTop() {
            return this.f34832top;
        }

        public int hashCode() {
            String top2 = getTop();
            int iHashCode = top2 == null ? 43 : top2.hashCode();
            List<GameListDTO> gameList = getGameList();
            int iHashCode2 = ((iHashCode + 59) * 59) + (gameList == null ? 43 : gameList.hashCode());
            GameBaishunConfigDTO gameBaishunConfig = getGameBaishunConfig();
            int iHashCode3 = (iHashCode2 * 59) + (gameBaishunConfig == null ? 43 : gameBaishunConfig.hashCode());
            List<GameBaishunDTO> gameBaishun = getGameBaishun();
            return (iHashCode3 * 59) + (gameBaishun != null ? gameBaishun.hashCode() : 43);
        }

        public void setGameBaishun(List<GameBaishunDTO> list) {
            this.gameBaishun = list;
        }

        public void setGameBaishunConfig(GameBaishunConfigDTO gameBaishunConfigDTO) {
            this.gameBaishunConfig = gameBaishunConfigDTO;
        }

        public void setGameList(List<GameListDTO> list) {
            this.gameList = list;
        }

        public void setTop(String str) {
            this.f34832top = str;
        }

        public String toString() {
            return "GameListBean.DataDTO(top=" + getTop() + ", gameList=" + getGameList() + ", gameBaishunConfig=" + getGameBaishunConfig() + ", gameBaishun=" + getGameBaishun() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GameListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GameListBean)) {
            return false;
        }
        GameListBean gameListBean = (GameListBean) obj;
        if (!gameListBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = gameListBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = gameListBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = gameListBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = gameListBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public DataDTO getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getTime() {
        return this.time;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        String msg = getMsg();
        int iHashCode3 = (iHashCode2 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "GameListBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
