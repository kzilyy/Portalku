package id.ac.polinema.lumajang.portalku.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppProperties {

    private String nama;
    private String versi;
    private int maksItem; 
    private String pesanSambutan; 

    public String getNama() { return nama; }
    public String getVersi() { return versi; }
    public int getMaksItem() { return maksItem; }
    public String getPesanSambutan() { return pesanSambutan; }
}