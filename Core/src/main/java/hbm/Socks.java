package hbm;

import javax.persistence.*;

@Entity
@Table(name="Socks")
public class Socks {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name="size ")
    private  String size ;

    public String getSize() {
        return size ;
    }
    public void setSize(String size) {
        this.size  = size;
    }

    @Column(name="color  ")
    private  String color  ;

    public String getColor() {
        return color  ;
    }
    public void setColor(String color ) {
        this.size  = color ;
    }

    @ManyToOne
    @JoinColumn(name = "type ")
    private  Type type;

    public Type GetType(){return  type;}
    public  void SetType(Type type)
    {
        this.type=type;
    }

    @ManyToOne
    @JoinColumn(name = "manufacturer  ")
    private  Manufacture manufacturer ;

    public Manufacture GetManufacturer (){return  manufacturer ;}
    public  void SetManufacturer (Manufacture manufacture)
    {
        this.manufacturer=manufacture;
    }

}

