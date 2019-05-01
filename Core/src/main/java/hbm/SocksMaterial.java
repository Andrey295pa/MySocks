package hbm;


import javax.persistence.*;

@Entity
@Table(name="SocksMaterial")
public class SocksMaterial {
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


    @ManyToOne
    @JoinColumn(name = "socks ")
    private Socks socks;

    public Socks GetSocks(){return  socks;}
    public  void SetSocks(Socks socks)
    {
        this.socks=socks;
    }

    @ManyToOne
    @JoinColumn(name="material")
    private Material material;

    public Material GetMaterial(){return  material;}
    public  void SetSocks(Material material)
    {
        this.material=material;
    }

    @Column (name = "percentage")
    private  int percentage;

    public int GetPercentage(){return  percentage;}
    public  void SetPercentage(int per)
    {
        this.percentage=per;
    }

}
