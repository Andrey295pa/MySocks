package hbm;


import javax.persistence.*;

@Entity
@Table(name = "Statistics")
public class Statistics {

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
    @JoinColumn(name = "cupboard ")
    private  Cupboard cupboard;

    public Cupboard GetCupboard(){return  cupboard;}
    public  void SetCupboard(Cupboard cupboard)
    {
        this.cupboard=cupboard;
    }

    @Column(name = "operationTime ")
    private  Double operationTime;

    public Double getOperationTime() { return operationTime; }
    public void setOperationTime(Double op) {
        this.operationTime = op;
    }

   // private  Data start;
}
