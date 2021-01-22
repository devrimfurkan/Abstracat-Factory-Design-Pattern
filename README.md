# Abstracat-Factory-Design-Pattern

Birden fazla ürün ailesi ile çalışmak durumunda kaldığımızda , ürün ailesi ile istemci tarafını soyutlamak için kullanılır. Ürün ailelerinin oluşumunu istemci tarafından ayırarak, karar verme koşulu olmadan, esnek ve geliştirilebilir bir yapı kurmamızı sağlar. Abstract Factory tasarım deseni Factory tasarım desenine benzerdir temel farkı ise Factory tasarım deseninde bir fabrikadan bir tek ürün üretilebilirken Abstracat Factory tasarım deseninde ise bir fabrikadan birden fazla ürün üretmemize olanak sağlar gibi düşünebiliriz.

Abstract Factory tasarım desenini kullanırken:

•	En az bir tane alt sınıf

•	Bir tane super Abstract Factory sınıfı

•	En az bir tane alt Factory sınıfı

•	Bir tane fabrika üretici sınıfı

•	Test sınıfı

Bunlar bizim gereken sınıflarımızdandır. Abstract Factory tasarım deseni birbirleriyle alakalı veya bağımlı nesnelerin somut sınıflarını belirtmeden yaratılması için gereken bir arayüz sağlar.

Abstaract Factory tasarım deseninin avantajları ise:
1.	Ürün ailelerinin oluşumu istemci tarafından ayırarak,karar verme koşulu olmadan ve geliştirilebilir bir yapı kurmamızı sağlar.
2.	if-else yapısından kurtararak daha anlaşılır kod yazmayı sağlar
3.	Client sınıfına bir abstract arayüz kullanılmasını sağlayarak gerçekte üretilecek ilişki ürün (Product) sınıflarını bilmeden veya önemsemeden oluşturulmasına olanak sağlar.

Bu tasarım desenini bir dezavantajı yeni bir ürün sisteme eklenmek istendiğinde mesela yeni ürün sisteme eklenemek için abstaract factory sınıfında değişiklik yapmak gerekir ki bu da Factoryden türeyen tüm alt sınıflarda da değişiklik yapılması anlamına gelir.Ayrıca her bir ürün ailesi için (ChicagoPizzaIcerikFabrikasi,NYPizzaIcerikFabrikasi gibi) farklı somut factory sınıflar oluşturulur. Eğer çok fazla ürün ailesi söz konusu ise birbirinden çok küçük farklar ile ayrılsalar bile her biri için yeni bir factory alt sınıfı oluşturmak gerekecektir.

![Vize1](https://user-images.githubusercontent.com/70522562/105523678-bcd5cf00-5cef-11eb-86cf-49ffceee7571.png)

Örnek olarak yukarıdaki verilen class diyagramı yapısında PizzaIcerikFabrikası interface yapısında tüm pizzalarda bulunacak olan methodlar belirtilmiştir yani bir nevi bu interface implement eden classlar interfacedeki methodları gerçekleştireceklerine dair sözleşme yapmıştır. Pizza fabrikaları implement ettikleri methodların içeriklerini belirleyerek nasıl bir pizza oluşturacakalarını belirlerler. İstemci ise nasıl bir pizza istediğini belirterek ilgili fabrikalara isteklerini ileterek pizzalarını oluştururlar.
