package br.com.studies.cityquery.domain.model;


import br.com.studies.cityquery.infrastructure.config.PointType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "city")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
@Getter
@Setter
public class City implements Serializable {

    @Id
    private Long id;
    private String name;
    private Integer uf;
    private Integer ibge;

    @Column(name = "lat_lon")
    private String geolocation;

    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;
}
