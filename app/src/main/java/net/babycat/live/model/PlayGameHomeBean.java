package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PlayGameHomeBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("info")
        private InfoDTO info;

        @SerializedName("list")
        private List<GamePlayBoxBean> list;

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
            List<GamePlayBoxBean> list = getList();
            List<GamePlayBoxBean> list2 = dataDTO.getList();
            if (list != null ? !list.equals(list2) : list2 != null) {
                return false;
            }
            InfoDTO info = getInfo();
            InfoDTO info2 = dataDTO.getInfo();
            return info != null ? info.equals(info2) : info2 == null;
        }

        public InfoDTO getInfo() {
            return this.info;
        }

        public List<GamePlayBoxBean> getList() {
            return this.list;
        }

        public int hashCode() {
            List<GamePlayBoxBean> list = getList();
            int iHashCode = list == null ? 43 : list.hashCode();
            InfoDTO info = getInfo();
            return ((iHashCode + 59) * 59) + (info != null ? info.hashCode() : 43);
        }

        public void setInfo(InfoDTO infoDTO) {
            this.info = infoDTO;
        }

        public void setList(List<GamePlayBoxBean> list) {
            this.list = list;
        }

        public String toString() {
            return "PlayGameHomeBean.DataDTO(list=" + getList() + ", info=" + getInfo() + ")";
        }
    }

    public static class InfoDTO {

        @SerializedName("game_price")
        private Integer gamePrice;

        @SerializedName("game_ticket_icon")
        private String gameTicketIcon;

        @SerializedName("game_ticket_num")
        private Integer gameTicketNum;

        @SerializedName("game_ticket_propid")
        private String gameTicketPropid;

        @SerializedName("play_mode_five")
        private Integer playModeFive;

        @SerializedName("play_mode_one")
        private Integer playModeOne;

        @SerializedName("user_coin")
        private String userCoin;

        public boolean canEqual(Object obj) {
            return obj instanceof InfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InfoDTO)) {
                return false;
            }
            InfoDTO infoDTO = (InfoDTO) obj;
            if (!infoDTO.canEqual(this)) {
                return false;
            }
            Integer gamePrice = getGamePrice();
            Integer gamePrice2 = infoDTO.getGamePrice();
            if (gamePrice != null ? !gamePrice.equals(gamePrice2) : gamePrice2 != null) {
                return false;
            }
            Integer gameTicketNum = getGameTicketNum();
            Integer gameTicketNum2 = infoDTO.getGameTicketNum();
            if (gameTicketNum != null ? !gameTicketNum.equals(gameTicketNum2) : gameTicketNum2 != null) {
                return false;
            }
            Integer playModeOne = getPlayModeOne();
            Integer playModeOne2 = infoDTO.getPlayModeOne();
            if (playModeOne != null ? !playModeOne.equals(playModeOne2) : playModeOne2 != null) {
                return false;
            }
            Integer playModeFive = getPlayModeFive();
            Integer playModeFive2 = infoDTO.getPlayModeFive();
            if (playModeFive != null ? !playModeFive.equals(playModeFive2) : playModeFive2 != null) {
                return false;
            }
            String gameTicketPropid = getGameTicketPropid();
            String gameTicketPropid2 = infoDTO.getGameTicketPropid();
            if (gameTicketPropid != null ? !gameTicketPropid.equals(gameTicketPropid2) : gameTicketPropid2 != null) {
                return false;
            }
            String gameTicketIcon = getGameTicketIcon();
            String gameTicketIcon2 = infoDTO.getGameTicketIcon();
            if (gameTicketIcon != null ? !gameTicketIcon.equals(gameTicketIcon2) : gameTicketIcon2 != null) {
                return false;
            }
            String userCoin = getUserCoin();
            String userCoin2 = infoDTO.getUserCoin();
            return userCoin != null ? userCoin.equals(userCoin2) : userCoin2 == null;
        }

        public Integer getGamePrice() {
            return this.gamePrice;
        }

        public String getGameTicketIcon() {
            return this.gameTicketIcon;
        }

        public Integer getGameTicketNum() {
            return this.gameTicketNum;
        }

        public String getGameTicketPropid() {
            return this.gameTicketPropid;
        }

        public Integer getPlayModeFive() {
            return this.playModeFive;
        }

        public Integer getPlayModeOne() {
            return this.playModeOne;
        }

        public String getUserCoin() {
            return this.userCoin;
        }

        public int hashCode() {
            Integer gamePrice = getGamePrice();
            int iHashCode = gamePrice == null ? 43 : gamePrice.hashCode();
            Integer gameTicketNum = getGameTicketNum();
            int iHashCode2 = ((iHashCode + 59) * 59) + (gameTicketNum == null ? 43 : gameTicketNum.hashCode());
            Integer playModeOne = getPlayModeOne();
            int iHashCode3 = (iHashCode2 * 59) + (playModeOne == null ? 43 : playModeOne.hashCode());
            Integer playModeFive = getPlayModeFive();
            int iHashCode4 = (iHashCode3 * 59) + (playModeFive == null ? 43 : playModeFive.hashCode());
            String gameTicketPropid = getGameTicketPropid();
            int iHashCode5 = (iHashCode4 * 59) + (gameTicketPropid == null ? 43 : gameTicketPropid.hashCode());
            String gameTicketIcon = getGameTicketIcon();
            int iHashCode6 = (iHashCode5 * 59) + (gameTicketIcon == null ? 43 : gameTicketIcon.hashCode());
            String userCoin = getUserCoin();
            return (iHashCode6 * 59) + (userCoin != null ? userCoin.hashCode() : 43);
        }

        public void setGamePrice(Integer num) {
            this.gamePrice = num;
        }

        public void setGameTicketIcon(String str) {
            this.gameTicketIcon = str;
        }

        public void setGameTicketNum(Integer num) {
            this.gameTicketNum = num;
        }

        public void setGameTicketPropid(String str) {
            this.gameTicketPropid = str;
        }

        public void setPlayModeFive(Integer num) {
            this.playModeFive = num;
        }

        public void setPlayModeOne(Integer num) {
            this.playModeOne = num;
        }

        public void setUserCoin(String str) {
            this.userCoin = str;
        }

        public String toString() {
            return "PlayGameHomeBean.InfoDTO(gamePrice=" + getGamePrice() + ", gameTicketPropid=" + getGameTicketPropid() + ", gameTicketIcon=" + getGameTicketIcon() + ", gameTicketNum=" + getGameTicketNum() + ", playModeOne=" + getPlayModeOne() + ", playModeFive=" + getPlayModeFive() + ", userCoin=" + getUserCoin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PlayGameHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayGameHomeBean)) {
            return false;
        }
        PlayGameHomeBean playGameHomeBean = (PlayGameHomeBean) obj;
        if (!playGameHomeBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = playGameHomeBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = playGameHomeBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = playGameHomeBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = playGameHomeBean.getData();
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
        return "PlayGameHomeBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
