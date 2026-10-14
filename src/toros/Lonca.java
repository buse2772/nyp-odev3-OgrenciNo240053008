package toros;

public class Lonca {
    private final String ad;
    private final int kurulusYili;
    private String duyuru;

    public Lonca(String ad, int kurulusYili, String duyuru) {
        if (ad == null || ad.length() < 3 || ad.length() > 25) {
            throw new IllegalArgumentException("Lonca adı null olamaz ve 3 ile 25 karakter arasında olmalıdır.");
        }
        
        
        if (kurulusYili <= 0) {
            throw new IllegalArgumentException("Lonca kuruluş yılı 0 veya büyük bir değer olmalıdır.");
        }

      
        this.ad = ad;
        this.kurulusYili = kurulusYili;
        this.duyuru = duyuru;
    } 
    
    public String getAd() {
        return ad;
    }

    public int getKurulusYili() {
        return kurulusYili;
    }

    public String getDuyuru() {
        return duyuru;
    }

  
    public void setDuyuru(String duyuru) {
        this.duyuru = duyuru;
    }

    @Override
    public String toString() {
        return "Lonca{" +
                "ad='" + ad + '\'' +
                ", kurulusYili=" + kurulusYili +
                ", duyuru='" + duyuru + '\'' +
                '}';
    }
}