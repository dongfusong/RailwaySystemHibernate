package SpringWebHibernate.models;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

/**
 * Created by huipay on 15/8/10.
 */

@Repository
public interface NodeStationRepository extends CrudRepository<NodeStation,Long>
{
    public NodeStation findByName(String name);
    public NodeStation save(NodeStation nodeStation);
}