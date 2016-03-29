package v3tomd.buitensportenapp.Database.DAO.Impl;

import java.util.ArrayList;
import java.util.List;

import v3tomd.buitensportenapp.Database.DAO.LocatieDAO;
import v3tomd.buitensportenapp.Model.Locatie;

/**
 * Created by Vidjinder on 28-3-2016.
 */
public class LocatieDAOImpl implements LocatieDAO {
    List<Locatie> locaties;

    public LocatieDAOImpl(){
        locaties = new ArrayList<Locatie>();
        Locatie locatie1 = new Locatie(52.103178, 5.105735);
        Locatie locatie2 = new Locatie(52.102795, 5.108324);
        locaties.add(locatie1);
        locaties.add(locatie2);
    }

    @Override
    public List<Locatie> getAllLocaties() {
        return locaties;
    }

    @Override
    public Locatie getLocatie(int locatieId) {
        return locaties.get(locatieId);
    }

    @Override
    public void updateLocatie(Locatie locatie) {
        locaties.get(locatie.getMyID()).setLatitude(locatie.getLatitude());
        System.out.println("Locatie: " + locatie.getMyID() + ", updated in the database");
    }

    @Override
    public void deleteLocatie(Locatie locatie) {
        locaties.remove(locatie.getMyID());
        System.out.println("Locatie: " + locatie.getMyID() + ", deleted from database");
    }
}
