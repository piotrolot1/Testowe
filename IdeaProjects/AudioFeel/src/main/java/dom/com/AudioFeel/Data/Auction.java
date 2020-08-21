package dom.com.AudioFeel.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String AucName;
    private String AucDesc;
    private float AucCurrPrice;
    private float AucEndPrice;
    private String AucDateEnd;

    public static List<Auction> listAuction = new ArrayList<>();

    public Auction() {
    }

    public Auction(Long id, String aucName, String aucDesc, float aucCurrPrice, float aucEndPrice, String aucDateEnd) {
        this.id = id;
        AucName = aucName;
        AucDesc = aucDesc;
        AucCurrPrice = aucCurrPrice;
        AucEndPrice = aucEndPrice;
        AucDateEnd = aucDateEnd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAucName() {
        return AucName;
    }

    public void setAucName(String aucName) {
        AucName = aucName;
    }

    public String getAucDesc() {
        return AucDesc;
    }

    public void setAucDesc(String aucDesc) {
        AucDesc = aucDesc;
    }

    public float getAucCurrPrice() {
        return AucCurrPrice;
    }

    public void setAucCurrPrice(float aucCurrPrice) {
        AucCurrPrice = aucCurrPrice;
    }

    public float getAucEndPrice() {
        return AucEndPrice;
    }

    public void setAucEndPrice(float aucEndPrice) {
        AucEndPrice = aucEndPrice;
    }

    public String getAucDateEnd() {
        return AucDateEnd;
    }

    public void setAucDateEnd(String aucDateEnd) {
        AucDateEnd = aucDateEnd;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id=" + id +
                ", AucName='" + AucName + '\'' +
                ", AucDesc='" + AucDesc + '\'' +
                ", AucCurrPrice=" + AucCurrPrice +
                ", AucEndPrice=" + AucEndPrice +
                ", AucDateEnd='" + AucDateEnd + '\'' +
                '}';
    }
}
