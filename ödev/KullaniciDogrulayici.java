// Sorumluluk: Kullanıcı nesnesinin geçerliliğini kontrol eder.
public class KullaniciDogrulayici {

    public boolean dogrula(Kullanici kullanici) {
        if (kullanici.getKullaniciAdi() == null || kullanici.getKullaniciAdi().trim().isEmpty()) {
            System.err.println("Hata: Kullanıcı adı boş olamaz.");
            return false;
        }
        if (kullanici.getEmail() == null || !kullanici.getEmail().contains("@")) {
            System.err.println("Hata: Geçersiz e-posta adresi.");
            return false;
        }
        System.out.println("Kullanıcı bilgileri doğrulandı.");
        return true;
    }
}