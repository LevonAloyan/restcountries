package eu.restcountries.teams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String topLevelDomain;
    @Column
    private String nativeName;
    @Column
    private int calli;
    @Column
    private String capital;
    @Column
    private String flag;

    public Country(int id, String name, String topLevelDomain, String nativeName, int calli, String capital, String flag) {
        this.id = id;
        this.name = name;
        this.topLevelDomain = topLevelDomain;
        this.nativeName = nativeName;
        this.calli = calli;
        this.capital = capital;
        this.flag = flag;
    }

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public int getCalli() {
        return calli;
    }

    public void setCalli(int calli) {
        this.calli = calli;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
