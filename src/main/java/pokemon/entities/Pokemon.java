package pokemon.entities;

import javax.persistence.*;

@Table(name = "pokemons")
@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "primary_type", nullable = false)
    private int primaryType;
    @Column(name = "secondary_type")
    private int secondaryType;

    public Pokemon() {}
    public Pokemon(Long id, String name, int primaryType, int secondaryType) {
        this.id = id;
        this.name = name;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(int primaryType) {
        this.primaryType = primaryType;
    }

    public int getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(int secondaryType) {
        this.secondaryType = secondaryType;
    }
}
