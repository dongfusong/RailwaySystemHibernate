package SpringWebHibernate.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Thoughtworks on 15/8/11.
 */
@Service
@Transactional
public class RailwayService {

    private NodeStationRepository nodeStationRepository;

    @Autowired
    RailwayService(NodeStationRepository nodeStationRepository){
        this.nodeStationRepository = nodeStationRepository;
    }

    public NodeStation getNodeStation(String name) {
        NodeStation nodeStation = nodeStationRepository.findByName(name);
        if (nodeStation == null){
            nodeStation = new NodeStation(name);
            nodeStationRepository.save(nodeStation);
        }
        return nodeStation;
    }

    public void addRailwayEdge(String srcName, String dstName, int distance) {
        NodeStation srcNodeStation = getNodeStation(srcName);
        NodeStation dstStation = getNodeStation(dstName);
        srcNodeStation.addEdge(new Edge(distance, dstStation));
    }

    public void clear() {
        nodeStationRepository.deleteAll();
    }

    public boolean canReach(String srcName, String dstName) {
        NodeStation srcNodeStation =  getNodeStation(srcName);
        return srcNodeStation.canReach(dstName);
    }
    //ToDo:
    public void save(NodeStation nodeStation){
        nodeStationRepository.save(nodeStation);
    }
}
