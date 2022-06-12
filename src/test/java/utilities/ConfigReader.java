

package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
    public static Properties properties;

    static{
        String dosyaYolu="configuration.properties";



        try {
         FileInputStream   fis = new FileInputStream(dosyaYolu);
            // fis dosyayolunu tanimladigimiz configuration.properties dosyasini okudu
            properties=new Properties();//objeye deger atadım

            properties.load(fis); // fis'in okudugu bilgileri properties'e yukledi
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String getProperty(String key){//TEST METHODUNDAN KEY GELECEK yani"amazonUrl"geldi
        /*
          test method'undan yolladigimiz string key degerini alip
          Properties class'indan getProperty( ) method'unu kullanarak
          bu key'e ait value'u bize getirdi
         */
        return properties.getProperty(key);//BURDAKİ KEY YUKARDAN ALDIGI KEY İLE configuration.properties gidecek
        //sonra ordan value alıp properties(value) degerini bize getirecek buda return oldugu için biz bunu test classına
        //döndürecegiz 4 adımda işi hallediyoruz
    }
}
