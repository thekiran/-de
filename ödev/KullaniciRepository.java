// Sorumluluk: Kullanıcı nesnesini veritabanına veya başka bir depolama alanına kaydeder.
public class KullaniciRepository {

    public void kaydet(Kullanici kullanici) {
        // Burada normalde veritabanına kayıt kodu olurdu.
        // Örnek olarak konsola yazdırıyoruz.
        System.out.println(kullanici.getKullaniciAdi() + " adlı kullanıcı veritabanına başarıyla kaydedildi.");
    }
}