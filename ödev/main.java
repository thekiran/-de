public class Main {
    public static void main(String[] args) {
        // 1. Kullanıcı nesnesini oluştur.
        Kullanici yeniKullanici = new Kullanici("mekiran", "kiran@example.com");

        // 2. Sorumlulukları yerine getirecek nesneleri oluştur.
        KullaniciDogrulayici dogrulayici = new KullaniciDogrulayici();
        KullaniciRepository repository = new KullaniciRepository();

        // 3. Kullanıcıyı doğrula.
        boolean gecerliMi = dogrulayici.dogrula(yeniKullanici);

        // 4. Eğer geçerliyse, kullanıcıyı kaydet.
        if (gecerliMi) {
            repository.kaydet(yeniKullanici);
        }

        System.out.println("\n--- Hatalı Senaryo ---");
        // Hatalı bir kullanıcı oluşturalım.
        Kullanici hataliKullanici = new Kullanici("", "hatali-eposta");
        if (dogrulayici.dogrula(hataliKullanici)) {
            repository.kaydet(hataliKullanici);
        }
    }
}