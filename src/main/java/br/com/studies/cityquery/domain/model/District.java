package br.com.studies.cityquery.domain.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "district")
@Getter
@Setter
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String uf;
    private String ibge;

    @Type(type = "jsonb")
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country countryId;
}
