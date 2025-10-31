// Sorumluluk: Sadece kullanıcı verilerini tutar.
public class Kullanici {
    private String kullaniciAdi;
    private String email;

    public Kullanici(String kullaniciAdi, String email) {
        this.kullaniciAdi = kullaniciAdi;
        this.email = email;
    }

    // Getter ve Setter metotları
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
               "kullaniciAdi='" + kullaniciAdi + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}