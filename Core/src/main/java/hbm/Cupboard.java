package hbm;

import javax.persistence.*;

@Entity
@Table(name="Сupboard")
public class Cupboard {
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
    @JoinColumn(name = "socks")
    private  Socks socks;

    public Socks getSocks() {
        return socks;
    }
    public void setSocks(Socks socks) {
        this.socks = socks;
    }

    @Column(name = "DateOfPurchase")
    private String DateOfPurchase;

    public String getDate() {
        return DateOfPurchase;
    }
    public void setDate(String data) {
        this.DateOfPurchase= data;
    }

    @Column(name="Access")
    private  int Access;

    public int getAccess() { return Access; }
    public void setAccess(int access) {
        this.Access = access;
    }

}
