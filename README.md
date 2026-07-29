# 🎓 UI Staj Projesi - Kampüs Online Sistemi

## 🌟 Genel Bakış
Bu proje, **Kampüs Online Sistemi**’nin kullanılabilirliğini artırmak ve sistem işlevlerini geliştirmek amacıyla yürütülmüştür. Giriş yapma, menü navigasyonu, mesajlaşma, finans yönetimi, devam durumu takibi, ödevler ve notlandırma gibi temel modülleri kapsamaktadır. Temel hedef; öğrenciler ve eğitmenler için kullanıcı dostu, kesintisiz ve etkileşimli bir test otomasyon deneyimi sunmaktır.

---

## ✨ Özellikler ve Modüller

### 1. **Giriş İşlemleri (Login)** 🔑  
- Öğrenciler için güvenli giriş altyapısı kurgulanmıştır.  
- Kimlik bilgileri doğrulanarak hatalı girişlerde uyarı mesajları görüntülenmektedir.  
- Başarılı giriş sonrasında kullanıcılar ana sayfaya yönlendirilmektedir.

### 2. **Ana Sayfa Navigasyonu** 🏠  
- Ders ve kampüs bilgilerine erişim sağlanmaktadır.  
- Menü ve butonlar arası geçişler optimize edilmiştir.

### 3. **Mesajlaşma Sistemi** ✉️  
- Mesaj gönderimi, yönetimi ve silme işlemleri yürütülmektedir.  
- Silinen mesajların geri yüklenmesi veya kalıcı olarak silinmesi desteklenmektedir.

### 4. **Finans Modülü** 💳  
- Ödeme detayları görüntülenebilmektedir.  
- Stripe altyapısı üzerinden çevrim içi ödemeler gerçekleştirilmektedir.  
- Ödeme özetleri Excel veya PDF formatında indirilebilmektedir.

### 5. **Ödev Yönetimi** 📝  
- Ödevlerin takibi ve sisteme yüklenmesi yönetilmektedir.  
- Ödevler özelinde tartışma başlıkları başlatılabilmektedir.  
- İş akışlarını hızlandırmak adına hızlı erişim butonları kullanılmıştır.

### 6. **Devam Durumu ve Takvim** 📅  
- Devamsızlık mazeretlerinin sisteme iletilmesi sağlanmaktadır.  
- Detaylı ders programları ve durumları takip edilebilmektedir.

### 7. **Notlandırma ve Profil Yönetimi** 🧾  
- Transkript ve not çizelgeleri indirilebilmektedir.  
- Tema ve profil fotoğrafı dâhil olmak üzere kişisel ayarlar özelleştirilebilmektedir.

---

## 💻 Kullanılan Teknolojiler ve Bağımlılıklar

* **Programlama Dili:** Java  
* **Test Framework’leri:** Cucumber, Selenium WebDriver, TestNG  
* **BDD Yaklaşımı:** Gherkin dili  
* **Loglama:** SLF4J  
* **Veri Yönetimi:** Apache POI, Apache Commons Lang3  
* **Raporlama:** ExtentReports (Cucumber Adapter)  
* **Veri Tabanı:** MySQL (MySQL Connector)  
* **Bağımlılık Yönetimi:** Apache Maven  
  * **Öne Çıkan Maven Bağımlılıkları:**  
    * `selenium-java:4.25.0`  
    * `cucumber-java:7.20.0`  
    * `testng:7.10.2`  
    * `slf4j-api:2.0.16`  
    * `poi-ooxml:4.1.0`  
    * `mysql-connector-java:8.0.28`

---

## 🤝 Proje Ekibi
* **Alper Alpay**  
* **Sefacan Başoğlu**  
* **Betül Gözlükoğlu**  
* **İlknur Neşe Tuncal**  
* **Yusuf Uçucu**  
* **Muhammet Mustafa Yazıcı**

---

## 📋 Gereksinimler

### Teknik Gereksinimler ⚙️  
* Güncel web tarayıcıları (Chrome, Firefox, Safari).  
* Aktif internet bağlantısı.

### Sistem Gereksinimleri 🌐  
* Test ortamı erişim adresi: `https://test.mersys.io`  
* Geçerli öğrenci kimlik bilgileri (credentials).

---

## 🚀 Kullanım ve Çalıştırma

1. **Kurulum:** System gereksinimlerinin karşılandığından emin olunur.  
2. **Giriş:** Tanımlı kullanıcı bilgileri ile sisteme erişim sağlanır.  
3. **Gezinme:** Sol menü (Hamburger Menu) üzerinden mesajlaşma, finans, ödevler gibi ilgili modüllere geçiş yapılır.  
4. **Katkı Sağlama:** Ekip üyeleri tarafından yeni işlevler eklenebilir veya hata bildirimleri depoya (repository) aktarılabilir.

---

## 🛠️ Katkıda Bulunma
Bu proje; öğrenci deneyimini iyileştirmek, test otomasyon süreçlerini geliştirmek ve takım çalışmasını pekiştirmek amacıyla tüm ekip üyelerinin ortak katkılarıyla hayata geçirilmiştir.
