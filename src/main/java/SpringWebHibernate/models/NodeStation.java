package SpringWebHibernate.models;

/**
 * Created by huipay on 15/8/10.
 */
import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class NodeStation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Edge> edges = new HashSet<Edge>();

    public NodeStation(String name) {
        this.name = name;
    }

    public NodeStation() {
    }
    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public boolean canReach(String dstName){
        for (Edge edge : edges){
            if (edge.canReach(dstName)){
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NodeStation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", edges=" + edges +
                '}';
    }
}
