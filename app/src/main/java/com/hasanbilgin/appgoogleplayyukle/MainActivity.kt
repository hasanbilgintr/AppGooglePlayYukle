package com.hasanbilgin.appgoogleplayyukle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        -uygulama ekranları yatay dikey kontrolü , çözünürlük kontrolü kontrol edilmiş olması
        -uygulamada resim müzik ses video telif hakkı önemli (royalty free image) diye bulabiliriz
        -developer.android.com sitesinde ordan google play tıklayıp play politikaları play içinde kuralları
        -developer.android.com sitesinde google play tıkla ordan play console oturum aç der tıklanır oturum açılmadıysa oturum açılır vs.(25 dolar ödeme yapıldıktan sonra)
        -google play console ekranı açılır
        -hesap makinesı uygulamsı yüklemek istersek mesela
        -create application (uygulama oluştur) butonuna tıklanır default language sadece tükiyede kullanıcaksanız türkçe açmaız yeterli eğer global düşünüyorsanız ingilice
        -title kısmında hesap makinesi girdik ve create dedik
        -açılan penecerede short description (kısa bir tanım 80 karakter) Dört işlemi yapabileceğiniz en güzel uygulama
        -full description (uzun açıklama 4000 karakter) Bu uygulamada çıkarma, çarpma , çarma vc. işlemleri yapılabilir uzatabilrisiniz, tabiki detaylı bir tanımlama tavsiye edilir
        -hi res icon (yüksek çözünürlüklü icon istiyor) 512 512 32 bit png olması lazım adobe xp vc programlardan yapılabilir yada logo yapma aracı diye aratılıp yapabiliriniz
        -screenshots (ekran görüntülerimiz) her phone tablet android tv ve wear os için en az 2 ekran görüntüsü istiyor tavsiye ise en az 4 5 ekran görüntüsüsü tabi hepsine yapıcaksanız hepsine koymanız şart
        -feature Graphic (güzel grafik) google playde ön resim kapak resim diye düşünebilirsiniz
        -application type  (uygulama tipi) oyunmu uygulamamı diye uygulamaseçtik
        -category (kategor) finans seçtik
        -tags (etiket) uygulamanızı en iyi anlatan etiketler seçilebilir en fazla 5 tane seçilebilir calculator ekledik

        -Context rating.(içerik  derecelendirme) bura apk yükledikten sonra açılcaktır.açıldıktan sonra  continue tıklıyoruz email adresini ister.altında hemen kategori seçmemizi ister .hesapmakinesi için productivity seçildi.Uygulama içersinide şiddet varmı diye soruyor yok. Cinsellik varmı diye soruyor yok. Saldırılı bir dil kullanılıyormu yok . Yasadışı madde vs varmı yok . yaşa uygun farklı promosyonlar varmı yok . geri kalan sorualrıda cevaplayabilirsin sorun yok . Saved questionnaire tıkla ve calculate rating tıklayabilirsin. sonra hangi ülkede hangi yaş gurubuna göre hatip simgeleri çıkıyor .aslında kanunlarına göre simegeler yapılmış.. sonundada apply raiting tıklanır

        -website uygulama içerikli varsa girilebilir yada kişisel vebsite varsa girilebilir.
        -Email ister bu email uygulama altında görünecektir farklı email verilebilir (her uygulama için farklı email açıp verilse daha iyi olur düşüncesindeyim hocada öle söledi)
        -Phone telefon girilebilir ve save draft basılabilir

        -App content -> privacy policy (özel politika)  kullanım koşulları diyebilir bir web sitesine yükleyip adresini isticektir zorunlu olabilir/ uygulama 13 yaşından küçükler içinse mutlaka eklenmeli değilse gerek görmüyo
        google da bu metinleri araştırarak ortaya birşeyler çıkartabiliriz
        -ads uygulama reklam varsa evet tıklayın
        .
        .

        -Pricing & distribution -> ücretlimi ücretsizmi  ücretli olucaksa ticaret hesabı açılması gerekiyor .... / Countries (ülkeler) hangi ülkelrede uygulama yayınlanacağını soruyor seçilip save tıklanır

        -App releases farklı farklı versiyonları yükleyeyince ve takip edebilceğimiz ekleme çıakrma bölümüdür / production -> manage tıklayınca create release tıkla key oluşturma(imzalama) burdan yapabilceğimizi ama biz continue diyerek proje içinde oluşturucaz
       --proje içinden apk çıkarma ve imzalı apk çıkarma -> Build Menüsüdnen->  Build Bundle(s) / APK(s) -> Build APK (s) imzasız olarak apk alabiliriz
       imzalı apk ise -> Generate Signed Bundle / APK...-> apk seçilir next tıklanır. Key store Path (imzalama yaptımız dosya) ordan create new tıklarız  key store path nerde dosya olşuturayım proje nerde ise 230828P01_ProjeName->230828P01_ProjeNameKeyStore adında kaydetsek iyi olur bölede tavsiye edildi hemen onun altındaki password ve confirm bu dosya şifresidir onlar girilir. Key altındaki Alias(takma ad) hasanbilgin yaz onun altındaki password ve confirm ise bu apk şifresidir diye düşünebilir aynı girsende sorun olmuyo nasılsa her projenin farklı dosyaları olucak... 25 kalabilir Firs and Last Name ise Hasan Bilgin yazılabilir. Organizational Unit şirket bölümü demek şirket için yapılıyorsa geliştirme departmanı gibi kendiniz içinse Hasan Bilgin diyip geçebilirsin Organization aynı şekilde firma ismi yoksa Hasan Bilgin . City or Locality İstanbul yazabilirsin . State or Province (eyalet) İstanbul yazılabilir . Country Code (XX)(ülke kodu) ise TR yazılbilir ve ok tıklanabilir. key store path oluştuurunca dosya şifresi ve apk takma adı ve şifreside direk yazılcaktır direk finişh tıklanabilir. açılan ekranda debug test etmek için bir apk dır. release ise yayımlayacağım apkdır. İkiside seçilebilir biz release seçtik.Ardından siteden Browse Files diyip o apk yı seçiyoruz .sroun varsa burda belirticektir.Release name 1.0 en başta bunu 2.3. aplar geldikçe yükseltebiliriz 1.1 1.2 ...gibi . What's new in this release? ise bu güncellem ise şu giderildi ilkse ilk yayın ..vs. vs... sonra save diyoruz .Review bazıp hata vsleri gösterir

       eksikleri üstüne durdukça gösterikcetir zaten türkçe ...







         */
    }
}