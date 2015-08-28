package SpringWebHibernate.models;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

/**
 * Created by Thoughtworks on 15/8/11.
 */
@Entity
public class Edge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int distance;

    @ManyToOne
    @JoinColumn(name = "dstNodeStation_id")
    NodeStation dstNodeStation;

    public Edge(int distance, NodeStation dstNodeStation) {
        this.distance = distance;
        this.dstNodeStation = dstNodeStation;
    }

    public Edge() {
    }

    public boolean canReach(String dstName) {
        if (dstName.equals(dstNodeStation.getName())){
            return true;
        }
        return false;
    }
}
